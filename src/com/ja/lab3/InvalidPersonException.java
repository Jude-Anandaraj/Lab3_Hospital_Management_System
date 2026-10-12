/*
 * Jude Anandaraj
 * 2026/10/10
 * InvalidPersonException class 
 */
package com.ja.lab3;

// Custom exception for invalid person information.
public class InvalidPersonException extends Exception {

    // Constructor accepts a custom error message.
    public InvalidPersonException(String message) {
        super(message);
    }
}
