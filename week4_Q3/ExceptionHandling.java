package week4_Q3;

import java.util.Scanner;

public class ExceptionHandling extends InvalidInputException {

    public ExceptionHandling(String message) {
		super(message);
		
	}

	// Method to perform division and handle invalid inputs
    public static void divide(int a, int b) throws InvalidInputException {
        if (a < 0 || b < 0) {
            throw new InvalidInputException("Numerator or denominator cannot be negative.");
        }
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        System.out.println("Result: " + (a / b));
    }

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        try {
            // Example: NullPointerException handling
            String nullString = null;
            System.out.println(nullString.length());  // This will throw NullPointerException

        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: You tried to access a null object.");
        }

        try {
            // Division example with potential exceptions
            System.out.print("Enter numerator: ");
            int numerator = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter denominator: ");
            int denominator = Integer.parseInt(scanner.nextLine());

            // Perform division (may throw ArithmeticException or custom InvalidInputException)
            divide(numerator, denominator);

        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());

        } catch (InvalidInputException e) {
            System.out.println("Caught InvalidInputException: " + e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: Please enter valid integers.");
        }

        try {
            // Example: ArrayIndexOutOfBoundsException handling
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);  // This will throw ArrayIndexOutOfBoundsException

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: Invalid array index access.");
        }

        // Finally block to demonstrate cleanup, even if an exception occurs
        finally {
            System.out.println("Program execution completed.");
            scanner.close();
        }
    }
}