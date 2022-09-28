package com.opencsv.csvreader.OpenCSVandGson;

import com.opencsv.bean.CsvBindByName;

public class CSVUser {
	
	@CsvBindByName
	private String name;
	
	@CsvBindByName(column = "email", required = true)
	private String email;
	
	@CsvBindByName(column = "phone")
	private String phoneNumber;
	
	@CsvBindByName
	private String country;

	@Override
	public String toString() {
		return "CSVUser {\nName : " + name + ",\nEmail : " + email + ",\nPhone Number : " + phoneNumber + "\nCountry : " + country
				+ "}";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
