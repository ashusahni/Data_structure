import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        // Create a Scanner object to read user input from the console
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0; // Initialize result to 0

        System.out.println("Welcome to the Simple Java Calculator!");
        System.out.println("-------------------------------------");

        // --- Get the first number ---
        while (true) { // Loop until valid input is received
            System.out.print("Enter the first number: ");
            try {
                num1 = scanner.nextDouble(); // Read the first number
                break; // Exit loop if input is valid
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Consume the invalid input to prevent infinite loop
            }
        }

        // --- Get the operator ---
        while (true) { // Loop until valid input is received
            System.out.print("Enter an operator (+, -, *, /): ");
            String operatorInput = scanner.next(); // Read the operator as a string
            if (operatorInput.length() == 1 && "+-*/".contains(operatorInput)) {
                operator = operatorInput.charAt(0); // Get the first character of the input
                break; // Exit loop if input is valid
            } else {
                System.out.println("Invalid operator. Please enter one of +, -, *, /.");
            }
        }

        // --- Get the second number ---
        while (true) { // Loop until valid input is received
            System.out.print("Enter the second number: ");
            try {
                num2 = scanner.nextDouble(); // Read the second number
                // Special check for division by zero
                if (operator == '/' && num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed. Please enter a non-zero second number.");
                    // Don't break; loop again for new input
                } else {
                    break; // Exit loop if input is valid and not division by zero
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Consume the invalid input
            }
        }

        // --- Perform the calculation based on the operator ---
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // Division by zero is already handled above, but good to have a fallback
                result = num1 / num2;
                break;
            default:
                // This case should ideally not be reached due to input validation,
                // but included for completeness.
                System.out.println("An unexpected error occurred with the operator.");
                return; // Exit the program if an unexpected operator slips through
        }

        // --- Display the result ---
        System.out.println("-------------------------------------");
        System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);

        // Close the scanner to release system resources
        scanner.close();
    }
}
