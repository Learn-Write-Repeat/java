/**
 * CompiletimePolymorphism
 * 
 * This file contains the demonstration of compile-time polymorphism.
 * It contains a main class that contains methods sum() with 3
 * signatures and a main method for begin execution.
 * 
 * @author NanthaKumar <https://github.com/nknantha>
 * @date 2021/08/08
 */

// Public main class CompiletimePolymorphism.
public class CompiletimePolymorphism {

    // Signature - 1:
    // sum() method with 2 integer parameter.
    static int sum(int a, int b) {
        return a + b;
    }

    // Signature - 2:
    // sum() method with 2 float parameter.
    static float sum(float a, float b) {
        return a + b;
    }

    // Signature - 3:
    // sum() method with 3 integer parameter.
    static int sum(int a, int b, int c) {
        return a + b + c;
    }
    
    // main() method contains driver code and demonstration.
    public static void main(String[] args) {
        
        // Calling sum() method with 2 integer values and 
        // printing the result.
        System.out.println(sum(3, 10));

        // Calling sum() method with 2 float values and 
        // printing the result.
        System.out.println(sum(3.0f, 10.0f));

        // Calling sum() method with 3 integer values and 
        // printing the result.
        System.out.println(sum(3, 10, 2));

        // Above different method calls of sum() are resolved at compiletime
        // rather than runtime.
    }
}

/**
 * OUTPUT:
 * 13
 * 13.0
 * 15
 */
