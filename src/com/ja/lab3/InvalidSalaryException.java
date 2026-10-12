/*
 * Jude Anandaraj
 * 2026/10/10
 * InvalidSalaryException class 
 */
package com.ja.lab3;

// Custom exception for invalid salary or consultation fee.
public class InvalidSalaryException extends Exception {

    // Constructor accepts an error message.
    public InvalidSalaryException(String message) {
        super(message);
    }
}
