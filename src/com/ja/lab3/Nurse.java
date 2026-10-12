/*
 * Jude Anandaraj
 * 2026/10/10
 * Nurse class 
 */
package com.ja.lab3;

// Nurse inherits from Person (Hierarchical Inheritance).
public class Nurse extends Person {

    private String department;
    private String shift;

    // Constructor
    public Nurse(int personId, String name, int age,
                 String department, String shift) throws InvalidPersonException {

        super(personId, name, age);

        this.department = department;
        this.shift = shift;
        
    }

    // Display Nurse details
    @Override
    public void displayDetails() {
        super.displayDetails();

        System.out.println("Department: " + department);
        System.out.println("Shift: " + shift);
    }

    // Nurse's specialized method
    public void assistPatient() {
        System.out.println("Nurse " + this.name
                + " is assisting a patient in " + department + ".");
    }

    // Method overriding
    @Override
    public void performDuties() {
        System.out.println("Nurse " + this.name
                + " is checking the patients.");
    }
}
