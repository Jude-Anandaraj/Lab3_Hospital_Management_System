/*
 * Jude Anandaraj
 * 2026/10/10
 * EmergencyDoctor class 
 */
package com.ja.lab3;

// EmergencyDoctor inherits from Doctor and implements two interfaces.
// This demonstrates multiple inheritance using interfaces.
public class EmergencyDoctor extends Doctor
        implements MedicalProfessional, Billable {

    // Constructor initializes the EmergencyDoctor object.
    public EmergencyDoctor(int personId, String name, int age,
                           String specialization, double consultationFee)
            throws InvalidPersonException, InvalidSalaryException {

        // Calls the Doctor constructor.
        super(personId, name, age, specialization, consultationFee);
    }

    // Specialized method for handling emergencies.
    public void handleEmergency() {
        System.out.println("Emergency Doctor " + this.name
                + " is handling a medical emergency.");
    }

    // Implements the MedicalProfessional interface.
    @Override
    public void prescribeMedication() {
        System.out.println("Emergency Doctor " + this.name
                + " is prescribing medication.");
    }

    // Implements the Billable interface.
    @Override
    public void generateBill() {
        System.out.println("Emergency Doctor " + this.name
                + " generated a bill of $" + getConsultationFee());
    }

    // Displays inherited details and EmergencyDoctor's role.
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Emergency Doctor");
    }

    // Overrides the inherited Doctor method.
    @Override
    public void performDuties() {
        System.out.println("Emergency Doctor " + this.name
                + " is providing emergency medical treatment.");
    }
}
