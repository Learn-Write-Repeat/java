/**
 * This file contains the example of errors and exceptions.
 * 
 * @author NanthaKumar <https://github.com/nknantha>
 * @date 2021/08/18
 */

// Class for example of ArithmeticException.
class ExceptionExample {

    // Method containing code to make ArithmeticException.
    public static void exec() {
        int a = 9, b = 0;

        try {
            System.out.println("Result: " + a / b);
        }
        catch (ArithmeticException e) {
            System.out.println("Catched Exception: " + e);
        }
    }
}

// Class for Error example.
class ErrorExample {

    // Method to make StackOverFlowError.
    public static void exec(int i) {
        
        // Recursive call with incremented value.
        exec(++i);
    }
}

// Main class contains the main method.
public class ExceptionError {

    // main() method contains driver code.
    public static void main(String[] args) {
        
        // Calling methods to execute examples.
        ExceptionExample.exec();
        ErrorExample.exec(1);
    }
}

/**
 * Output:
 * Catched Exception: java.lang.ArithmeticException: / by zero
 * Exception in thread "main" java.lang.StackOverflowError
 *         at ErrorExample.exec(Main.java:39)
 *         at ErrorExample.exec(Main.java:39)
 *         at ErrorExample.exec(Main.java:39)
 *         at ErrorExample.exec(Main.java:39)
 *         at ErrorExample.exec(Main.java:39)
 * ...
 */
