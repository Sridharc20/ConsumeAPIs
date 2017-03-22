package com.example;

public class Customer {

	private String firstName;
	private String lastName;
	private String place;

	private Customer() {
	}

	public Customer(String firstName, String lastName, String place) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.place = place;
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

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

}
