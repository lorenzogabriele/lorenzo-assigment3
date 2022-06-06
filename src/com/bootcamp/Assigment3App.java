package com.bootcamp;

import java.io.IOException;

public class Assigment3App {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		
		FileService fileservice = new FileService();
		User[] allUsers = fileservice.lorenzoArray();
		//System.out.println(allUsers[1]);
		
		UserService userservice = new UserService();
		userservice.UserServiceMethod(allUsers);
		
		
		//System.out.println(allUsers[1]);
		
		//User [] lorenzoArray = new User[4];
		//User user = new User(null, null, null, 0);
		
	}

}
