package com.spring.protoBuff.payload.response;

import java.util.List;

public class UserInfoResponse {
	private Long id;
	private String username;
	private String email;
	private String role;
	private List<String> authorities;

	public UserInfoResponse(Long id, String username, String email,String role, List<String> authorities) {
		this.id = id;
		this.username = username;
		this.email = email;
		this.role = role;
		this.authorities = authorities;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setRole(String role){
		this.role = role;
	}
	public String getRole(){
		return this.role;
	}

	public List<String> getAuthoritiess() {
		return authorities;
	}
}