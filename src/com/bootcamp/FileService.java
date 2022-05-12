package com.bootcamp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileService {

	{
		BufferedReader lorenzoReader = null;
		String line = "";
		
		// find out about the user array in the user buffer reading
		try {
			while (line != null) {
				try {
					lorenzoReader = new BufferedReader(new FileReader("data.txt"));
					line = lorenzoReader.readLine();
				} catch (FileNotFoundException e) {
					System.out.println("Oh shoot file not found exception!");
					e.printStackTrace();
				
				} catch (IOException e) {
					System.out.println("Ops there was a IO Exception!");
					e.printStackTrace();
				}
				
				System.out.println();
				}
				//closing the IO part
				} finally {
					
					try {
						System.out.println("Closing lorenzoReader");
						lorenzoReader.close();
						
					} catch (IOException e) {
						e.printStackTrace();

					}
					
				}
					
				}
		
}
