package com.luv2code.springdemo.mvc;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	
	private ArrayList<String> countryOptions;
	
	public Student() {
		
		countryOptions = new ArrayList<>();
		
		countryOptions.add("Brazil");
		countryOptions.add("Germany");
		countryOptions.add("France");
		countryOptions.add("India");
		countryOptions.add("United States of America");
		countryOptions.add("Japan");

		
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public ArrayList<String> getCountryOptions() {
		return countryOptions;
	}
	

}
