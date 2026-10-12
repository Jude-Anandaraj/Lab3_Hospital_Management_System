/*
 * Jude Anandaraj
 * 2026/10/10
 * Person class 
 */
package com.ja.lab3;

//Person Class
public class Person {

	protected int personId;
	protected String name;
	protected int age;

	// Constructor
	public Person(int personId, String name, int age) throws InvalidPersonException {

		// Validate personId
		if (personId < 0) {
			throw new InvalidPersonException("The personId cannot be negative.");
		}

		// Validate name
		if (name == null || name.trim().isEmpty()) {
			throw new InvalidPersonException("The name of the person cannot be empty.");
		}

		// Validate age
		if (age < 0) {
			throw new InvalidPersonException("The age of the person cannot be negative.");
		}

		this.personId = personId;
		this.name = name;
		this.age = age;

	}

	public void displayDetails() {
		System.out.println("Person ID: " + personId);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}

	public void performDuties() {
		System.out.println(this.name + " is performing hospital duties.");
	}
}
