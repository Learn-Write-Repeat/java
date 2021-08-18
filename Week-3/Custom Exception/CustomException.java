/**
 * This file contains the example for Custom Exception.
 * 
 * @author NanthaKumar <https://github.com/nknantha>
 * @date 2021/08/18
 */

// Custom Exception class.
class InvalidAgeException extends Exception {

    // Constructor invokes parent constructor.
    public InvalidAgeException(String errorMessage) {
        super(errorMessage);
    }
}

// Main class contains the main method.
public class CustomException {
    
    // Method to check the age is adult.
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age: " + age + " is not belongs to adult");
        } else {
            System.out.println("Age: " + age + " is valid.");
        }
    }

    // main() method contains driver code.
    public static void main(String[] args) {
        
        // Invoking custom exception by passing non adult age.
        try {
            validateAge(11);
        }
        catch (InvalidAgeException e) {
            System.out.println("Catched Exception: " + e);
        }

        // Validating proper adult age.
        try {
            validateAge(20);
        }
        catch (InvalidAgeException e) {
            System.out.println("Catched Exception: " + e);
        }
    }
}

/**
 * Output:
 * Catched Exception: InvalidAgeException: Age: 11 is not belongs to adult
 * Age: 20 is valid.
 */
