/*
 * Jude Anandaraj
 * 2026/10/10
 * Doctor class 
 */
package com.ja.lab3;

// Doctor inherits from Person (Single Inheritance).
public class Doctor extends Person {

    protected String specialization;
    protected double consultationFee;

    // Constructor
    public Doctor(int personId, String name, int age,
                  String specialization, double consultationFee)
            throws InvalidPersonException, InvalidSalaryException {

        super(personId, name, age);

        // Validate specialization
        if (specialization == null || specialization.trim().isEmpty()) {
            throw new InvalidPersonException(
                    "Specialization cannot be empty.");
        }

        // Validate consultation fee
        if (consultationFee < 0) {
            throw new InvalidSalaryException(
                    "Consultation fee cannot be negative.");
        }

        this.specialization = specialization;
        this.consultationFee = round2(consultationFee);
    }

    // Get specialization
    public String getSpecialization() {
        return specialization;
    }

    // Get consultation fee
    public double getConsultationFee() {
    	
        return round2(consultationFee);
    }

    // Doctor's specialized method
    public void diagnosePatient() {
        System.out.println("Doctor " + this.name
                + " is diagnosing a patient.");
    }

    // Display Doctor details
    @Override
    public void displayDetails() {
        super.displayDetails();

        System.out.println("Specialization: " + specialization);
        System.out.println("Consultation Fee: $" + consultationFee);
    }

    // Method overriding
    @Override
    public void performDuties() {
        System.out.println("Doctor " + this.name
                + " is consulting patients.");
    }
    
    private static double round2(double value)
    {
    	return Math.round(value * 100.0)/100.0;
    }
}
