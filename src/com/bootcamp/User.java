package com.bootcamp;

//POJO = Plain Old Java Object
public class User {
	
	// instance variables (declared as private)
	private String username;
	private String password;
	private String name;
	private int loginAttempts;
	
	//no args constructor
	public User() {
		
	}
	
	//4 args constructor
	public User(String username, String password, String name, int loginAttempts) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.loginAttempts = loginAttempts;
	
	}
	//
	
	

	// getters and setters for the above instance variables
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
	
	
	//
	

}
