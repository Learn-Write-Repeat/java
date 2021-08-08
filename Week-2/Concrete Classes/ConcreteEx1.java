/**
 * This file contains example of simple concrete class.
 * It contains ConcreteEx1 class, contains all possible methods
 * that the program needs.
 * 
 * @author NanthaKumar <https://github.com/nknantha>
 * @date 2021/08/08
 */

// Example - 1

// A simple concrete public class named ConcreteEx1.
public class ConcreteEx1 {

    // add() method takes 2 integers and return their sum.
    static int add(int a, int b) {
        return a + b;
    }

    // multiply() method takes 2 integers and return their product.
    static int multiply(int a, int b) {
        return a * b;
    }

    // main() method contains driver code.
    public static void main(String[] args) {
        
        // Creating variables to hold integer values.
        int num1 = 10, num2 = 5;

        // Calling add() method with num1 and num2 and
        // printing the result.
        System.out.println("Sum: " + add(num1, num2));

        // Printing the result of multiply() with num1 and num2.
        System.out.println("Product: " + multiply(num1, num2));
    }
}

/**
 * OUTPUT:
 * Sum: 15
 * Product: 50
 */
