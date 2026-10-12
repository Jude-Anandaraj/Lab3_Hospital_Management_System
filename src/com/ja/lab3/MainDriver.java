/*
 * Jude Anandaraj
 * 2026/10/10
 * MainDriver class 
 */
package com.ja.lab3;

// MainDriver demonstrates all the inheritance concepts.
public class MainDriver {

	// Main method - starting point of the program.
	public static void main(String[] args) {

		try {

			System.out.println("==================================");
			System.out.println("    HOSPITAL MANAGEMENT SYSTEM");
			System.out.println("==================================");

			// 1. Create objects of each hospital employee class.
			Doctor doctor = new Doctor(101, "James", 40, "Cardiology", 150.00);

			Nurse nurse = new Nurse(102, "Sarah", 29, "Emergency", "Night");

			Surgeon surgeon = new Surgeon(103, "Michael", 45, "Surgery", 300.00, "Cardiac", "OR-5");

			EmergencyDoctor emergencyDoctor = new EmergencyDoctor(104, "Emily", 38, "Emergency Medicine", 200.00);

			// 2. Demonstrate single inheritance.
			System.out.println("\n--- DOCTOR DETAILS ---");
			doctor.displayDetails();
			doctor.performDuties();
			doctor.diagnosePatient();

			// 3. Demonstrate hierarchical inheritance.
			System.out.println("\n--- NURSE DETAILS ---");
			nurse.displayDetails();
			nurse.performDuties();
			nurse.assistPatient();

			// 4. Demonstrate multilevel inheritance.
			System.out.println("\n--- SURGEON DETAILS ---");
			surgeon.displayDetails();
			surgeon.performDuties();
			surgeon.diagnosePatient();
			surgeon.performSurgery();

			// 5. Demonstrate multiple inheritance using interfaces.
			System.out.println("\n--- EMERGENCY DOCTOR DETAILS ---");
			emergencyDoctor.displayDetails();
			emergencyDoctor.performDuties();
			emergencyDoctor.diagnosePatient();
			emergencyDoctor.handleEmergency();
			emergencyDoctor.generateBill();

			//
			System.out.println("\n--- DEMONSTRATE METHOD OVERRIDING ---");
			Person generalPerson = new Person(100, "Anandaraj", 61);
			generalPerson.performDuties();
			doctor.performDuties();
			nurse.performDuties();
			surgeon.performDuties();
			emergencyDoctor.performDuties();

			// 6. Demonstrate polymorphism.
			System.out.println("\n--- POLYMORPHISM ---");

			// Parent class reference.
			Person person;

			// Person reference points to a Doctor object.
			person = new Doctor(201, "John", 55, "Cardiology", 250.00);
			person.performDuties();

			// Person reference points to a Nurse object.
			person = new Nurse(202, "Remo", 25, "Emergency", "Day");
			person.performDuties();

			// Person reference points to a Surgeon object.
			person = new Surgeon(203, "Anna", 35, "Surgery", 400.00, "Neurology", "OR-5");
			person.performDuties();

			// Person reference points to an EmergencyDoctor object.
			person = new EmergencyDoctor(204, "Vivek", 39, "Emergency Medicine", 300.00);
			person.performDuties();

			// 6. Demonstrate polymorphism using array.
			System.out.println("\n--- POLYMORPHISM USING ARRAY---");

			// Parent class reference.
			Person[] personArray = new Person[4];
			personArray[0]= new Doctor(201, "John", 55, "Cardiology", 250.00);
			personArray[1]= new Nurse(202, "Remo", 25, "Emergency", "Day");
			personArray[2]= new Surgeon(203, "Anna", 35, "Surgery", 400.00, "Neurology", "OR-5");
			personArray[3]= new EmergencyDoctor(204, "Vivek", 39, "Emergency Medicine", 300.00);
			
			for (Person personPoly: personArray) 
			{
				personPoly.performDuties();
			}

			System.out.println("\n--- INTERFACE METHODS ---");

			// MedicalProfessional interface method.
			emergencyDoctor.prescribeMedication();

			// Billable interface method.
			emergencyDoctor.generateBill();

			System.out.println("\n==================================");
			System.out.println("      PROGRAM COMPLETED");
			System.out.println("==================================");

		}

		// Handle invalid person information.
		catch (InvalidPersonException e) {
			System.out.println("Person Error: " + e.getMessage());
		}

		// Handle invalid salary or fee information.
		catch (InvalidSalaryException e) {
			System.out.println("Salary Error: " + e.getMessage());
		}
	}
}
