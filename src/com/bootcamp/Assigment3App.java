package com.bootcamp;

import java.io.IOException;

public class Assigment3App {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		
		//call the fileservice with myArray method once
		FileService fileservice = new FileService();
		User[] allUsers = fileservice.myArray();
		
		
		//pass the allUsers data to the userservice method
		UserService userservice = new UserService();
		userservice.UserServiceMethod(allUsers);

	}

}
