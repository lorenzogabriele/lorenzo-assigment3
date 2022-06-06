package com.bootcamp;

import java.io.IOException;
import java.util.Scanner;

//this class validate the user
public class UserService {
	void UserServiceMethod(User[] users) throws IOException {		

		Scanner scanner = new Scanner(System.in);

		String user, pass;

		User[] allUsers = FileService.lorenzoArray();
		// System.out.println(User.getUsername()); //test print

		int i = 0;
		while (i < 4) {

			System.out.println("Enter your email: ");
			user = scanner.nextLine();

			System.out.println("Enter your password: ");
			pass = scanner.nextLine();

			// loop bring every of allUsers

			if (user.trim().equals(User.getUsername()) || (pass.trim().equals(User.getPassword()))) {
				System.out.println("Welcome: " + User.getName());
				break;
			} else {
				System.out.println("Invalid login, please try again");
			}
			i++;

		}

		System.out.println("Too many failed login attempts, you are now locked out.");
		scanner.close();
	}
}