package com.bootcamp;

import java.io.IOException;
import java.util.Scanner;

//this class validate the user
public class UserService {
	User[] UserServiceMethod(User[] users) throws IOException {

		Scanner scanner = new Scanner(System.in);

		String userInput = null, passInput = null;
		boolean found = false;
		int loginAttempts = 4;
		
		System.out.println(users.length);

		int i = 0;
		while (i <= 4) {

			//User user = users[i]; //removed this prints out of bounds exc

			System.out.println("Enter your email: ");
			userInput = scanner.nextLine();

			System.out.println("Enter your password: ");
			passInput = scanner.nextLine();

			// loop check current_user in the array of all the Users
			//for (User current_user : users)
			

			for (User current_user : users) {
				if (userInput.equalsIgnoreCase(current_user.getUsername())
						&& (passInput.equals(current_user.getPassword()))) {
					System.out.println("Welcome: " + current_user.getName());
					found = true;
					return users; // break
				} else {
					found = false;
				}
			}


			if (loginAttempts != 0) {
				System.out.println("Invalid login, please try again.");
				loginAttempts--;
			} else {
				if (loginAttempts == 0) {
					System.out.println("Too many failed login attempts, you are now locked out.");
					}
			}

			i++;
		}

		scanner.close();
		return users; // return the User
	}
}