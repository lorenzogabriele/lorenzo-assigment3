package com.bootcamp;

public class User {
	
	private String username;
	private String password;
	private String name;
	private int loginAttempts;
	
	public User(String username, String password, String name, int loginAttempts) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.loginAttempts = loginAttempts;
	}
	//

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLoginAttempts() {
		return loginAttempts;
	}

	public void setLoginAttempts(int loginAttempts) {
		this.loginAttempts = loginAttempts;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", name=" + name + ", loginAttempts="
				+ loginAttempts + "]";
	}
	
	
	
	

}
