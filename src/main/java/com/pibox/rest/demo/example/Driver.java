package com.pibox.rest.demo.example;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		
		try {
			// create object mapper
			ObjectMapper mapper = new ObjectMapper();
			
			// read JSON  file and map/convert to Java POJO: 
			// data/sample-lite.json
			
			Student theStudent = mapper.readValue(
						new File("data/sample-full.json"), Student.class);
			
			// print first name and last name
			System.out.println("First name = " + theStudent.getFirstName());
			System.out.println("Last name = " + theStudent.getLastName());

			Address address = theStudent.getAddress();
			System.out.println("Street = " + address.getStreet());
			System.out.println("City = " + address.getCity());

			System.out.print("Languages = " );
			for (String lang: theStudent.getLanguages()) {
				System.out.print(lang + " ");
			}


		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
	}
}




