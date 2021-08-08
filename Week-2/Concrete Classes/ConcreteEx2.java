/**
 * This file contains example of concrete class with abtract and interface
 * concepts. It contains a interface Calc contains declarations of add(), 
 * multiply() and a abstract class Add contains implementation of add() and 
 * a main class contains implementation of multiply() and main() methods.
 * 
 * @author NanthaKumar <https://github.com/nknantha>
 * @date 2021/08/08
 */

// Example - 2

// Interface Calc contains declarations of method add() and multiply().
interface Calc {
    int add(int a, int b);
    int multiply(int a, int b);
}

// Abstract class add contains the implementation of add() method and
// it implements the Calc interface.
abstract class Add implements Calc {

    // Implementation of add() method
    public int add(int a, int b) {
        return a + b;
    }
}

// Public main class (Concrete) contains main() method and implemantation of
// multiply() method and it extends the abstract class Add.
public class ConcreteEx2 extends Add {
    
    // Implemantation of multiply() method.
    public int multiply(int a, int b) {
        return a * b;
    }

    // main() method contains driver code.
    public static void main(String[] args) {
        
        // Creating object for main class.
        ConcreteEx2 Obj = new ConcreteEx2();

        // Variables to hold integers.
        int num1 = 10, num2 = 5;

        // Calling add() method in Obj and printing the return value.
        System.out.println("Sum: " + Obj.add(num1, num2));

        // Calling multiply() method in Obj and printing the return value.
        System.out.println("Product: " + Obj.multiply(num1, num2));
    }
}

/**
 * OUTPUT:
 * Sum: 15
 * Product: 50
 */
