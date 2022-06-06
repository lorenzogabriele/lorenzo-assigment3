package com.bootcamp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileService {
	public static User[] lorenzoArray() throws IOException {
		User[] users = new User[4];
		System.out.println("Start!");
		BufferedReader lorenzoReader = null;
		try {
			lorenzoReader = new BufferedReader(new FileReader("data.txt"));

			int i = 0;
			String line = "";
			while ((line = lorenzoReader.readLine()) != null) {
				//System.out.println(line);
				String[] data = line.split(",");
				//System.out.println(data[0]);
				//System.out.println(data[1]);
				//System.out.println(data[2]);
	
				
//				for (String a : data) {
//					System.out.println(a);
//				}
					
				
				User user = new User();
				user.setUsername(data[0]);
				user.setPassword(data[1]);
				user.setName(data[2]);
				
				users[i] = user;
				i++;
				
				
				
			}

		} catch (FileNotFoundException e) {
			System.out.println("Oops, the file wasn't found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Oops, there was an I/O Exception");
			e.printStackTrace();
		} finally {
			try {
				lorenzoReader.close();
				System.out.println("Closing file reader");
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Stack Trace exception Print");
			}
		}
		System.out.println("Return Array");
		return users;
	}
}
