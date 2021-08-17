/**
 * This file contains the demonstration of throwing exception.
 * 
 * @author NanthaKumar <https://github.com/nknantha>
 * @date 2021/08/17
 */

// Main class contains the main method.
public class ThrowingException {
    
    // Divide method divides the given numbers.
    // It may throws ArithmeticException and base Exception.
    public static int divide(int a, int b) throws ArithmeticException, Exception {
        
        // Throwing manual exception if a < b.
        if (a < b) {
            throw new Exception("Value a: " + a + ", should be greater than value b: " + b);
        }
        return a / b;
    }

    // Execute and manages the exception with try catch.
    public static void execDivide(int a, int b) {
        try {
            System.out.println("Result: " + divide(a, b));
        }
        catch (ArithmeticException e) {
            System.out.println("Catched Exception: " + e);
        }
        catch (Exception e) {
            System.out.println("Catched Exception: " + e);
        }
    }

    // main() method contains the driver code.
    public static void main(String[] args) {
        
        // First we try to catch ArithmeticException.
        execDivide(5, 0);

        // Second we try to catch manual exception.
        execDivide(5, 10);
    }
}

/**
 * Output:
 * Catched Exception: java.lang.ArithmeticException: / by zero
 * Catched Exception: java.lang.Exception: Value a: 5, should be greater than value b: 10
 */
