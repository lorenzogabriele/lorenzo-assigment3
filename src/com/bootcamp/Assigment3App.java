package com.bootcamp;

import java.io.IOException;

public class Assigment3App {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		
		FileService fileservice = new FileService();
		User[] allUsers = fileservice.lorenzoArray();
		
		UserService userservice = new UserService();
		userservice.UserServiceMethod(allUsers);
		
		
		
		
	}

}
