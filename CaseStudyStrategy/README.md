# Clinic Payment System - Strategy Pattern

A simple Java application demonstrating the Strategy Design Pattern.

## Overview
This project models a clinic's reception desk where patients can pay their medical bills. By using the Strategy Pattern, the payment method (Cash or Card) is separated from the `ClinicPatient` class. This makes the code cleaner and allows the system to add new payment types (like Insurance or Apple Pay) in the future without changing the patient code.

## File Structure
All code is located in a single file for easy reading:
- `PaymentStrategy` (The interface every payment type must follow)
- `CashPayment` & `CardPayment` (The specific payment behaviors)
- `ClinicPatient` (The context class that uses the payment strategy)
- `Main` (The test class)

## How to Run

1. Save the code into `Main.java`.
2. Compile via terminal: `javac Main.java`
3. Run the application: `java Main`
