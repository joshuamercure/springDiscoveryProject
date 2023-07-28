package com.spring.protoBuff.security.jwt;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseCookie;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.protoBuff.payload.request.LoginRequest;
import com.spring.protoBuff.payload.request.SignupRequest;
import com.spring.protoBuff.payload.response.MessageResponse;
import com.spring.protoBuff.payload.response.UserInfoResponse;
import com.spring.protoBuff.user.Role;
import com.spring.protoBuff.user.RoleRepository;
import com.spring.protoBuff.user.SecurityRole;
import com.spring.protoBuff.user.User;
import com.spring.protoBuff.user.UserDetailsImpl;
import com.spring.protoBuff.user.UserRepository;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class AuthController {
  @Autowired
  AuthenticationManager authenticationManager;

  @Autowired
  UserRepository userRepository;

  @Autowired
  RoleRepository roleRepository;

  @Autowired
  PasswordEncoder encoder;

  @Autowired
  JwtUtils jwtUtils;

  @PostMapping("/signin")
  public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {

    Authentication authentication = authenticationManager
        .authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

    SecurityContextHolder.getContext().setAuthentication(authentication);

    UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();

    ResponseCookie jwtCookie = jwtUtils.generateJwtCookie(userDetails);

    List<String> authorities = userDetails.getAuthorities().stream()
        .map(item -> item.getAuthority())
        .collect(Collectors.toList());

    return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE, jwtCookie.toString())
        .body(new UserInfoResponse(userDetails.getId(),
                                   userDetails.getUsername(),
                                   userDetails.getEmail(),
                                   userDetails.getRole(),
                                   authorities));
  }

  @PostMapping("/signup")
  public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest) {
    if (userRepository.existsByUsername(signUpRequest.getUsername())) {
      return ResponseEntity.badRequest().body(new MessageResponse("Error: Username is already taken!"));
    }

    if (userRepository.existsByEmail(signUpRequest.getEmail())) {
      return ResponseEntity.badRequest().body(new MessageResponse("Error: Email is already in use!"));
    }

    // Create new user's account
    User user = new User(signUpRequest.getUsername(),
                         signUpRequest.getEmail(),
                         encoder.encode(signUpRequest.getPassword()));

    String strRole = signUpRequest.getRole();
    SecurityRole role = new SecurityRole();
    if (strRole == null) {
           role = roleRepository.findByName(Role.ROLE_USER)
          .orElseThrow(() -> new RuntimeException("Error: Role is not found. No role provided !"));
    } else {
        switch (strRole) {
        case "admin":
          role = roleRepository.findByName(Role.ROLE_ADMIN)
              .orElseThrow(() -> new RuntimeException("Error: Role admin  is not found."));
          break;
        case "mod":
          role = roleRepository.findByName(Role.ROLE_MODERATOR)
              .orElseThrow(() -> new RuntimeException("Error: Role mod is not found."));

          break;
        default:
          role = roleRepository.findByName(Role.ROLE_USER)
              .orElseThrow(() -> new RuntimeException("Error: Role user is not found."));
        }
    }

    user.setRole(role);
    userRepository.save(user);

    return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
  }

  @PostMapping("/signout")
  public ResponseEntity<?> logoutUser() {
    ResponseCookie cookie = jwtUtils.getCleanJwtCookie();
    return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE, cookie.toString())
        .body(new MessageResponse("You've been signed out!"));
  }
}
