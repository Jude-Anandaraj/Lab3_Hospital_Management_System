/*
 * Jude Anandaraj
 * 2026/10/10
 * Surgeon class 
 */
package com.ja.lab3;

// Surgeon inherits from Doctor.
// Multilevel inheritance: Person -> Doctor -> Surgeon.
public class Surgeon extends Doctor {

    // Private attributes demonstrate encapsulation.
    private String surgeryType;
    private String operatingRoom;

    // Constructor initializes inherited and Surgeon attributes.
    public Surgeon(int personId, String name, int age,
                   String specialization, double consultationFee,
                   String surgeryType, String operatingRoom)
            throws InvalidPersonException, InvalidSalaryException {

        // Calls the Doctor constructor.
        super(personId, name, age, specialization, consultationFee);

        this.surgeryType = surgeryType;
        this.operatingRoom = operatingRoom;
    }

    // Displays Person, Doctor, and Surgeon information.
    @Override
    public void displayDetails() {
        super.displayDetails();

        System.out.println("Surgery Type: " + surgeryType);
        System.out.println("Operating Room: " + operatingRoom);
    }

    // Specialized method required for the Surgeon class.
    public void performSurgery() {
        System.out.println("Surgeon " + this.name
                + " is performing " + surgeryType
                + " surgery in operating room "
                + operatingRoom + ".");
    }

    // Overrides the Doctor's performDuties() method.
    @Override
    public void performDuties() {
        System.out.println("Surgeon " + this.name
                + " is performing surgical duties.");
    }
    
    
}
