/**
 * This file demonstrate the static variables, methods and blocks.
 * 
 * @author NanthaKumar <https://github.com/nknantha>
 * @date 2021/08/13
 */

// DemoClass contains static attributs, methods and block.
class DemoClass {

    // Static attribute.
    static String greet = "Welcome";
    static int a, b;

    // Static block. It'll be loaded when class loaded in JVM.
    static {
        System.out.println("Static Block Invoked...");

        // Here the static attributes accessed by a static block.
        a = 10;
        b = 20;
    }

    // Static method.
    static void hello() {
        System.out.println("Hello, I'm from DemoClass...");
    }

}

// Main class contains the main method().
public class StaticVariableMethod {

    // main() method contains the driver code.
    public static void main(String[] args) {
        
        // Directly accessing DemoClass attributes and printing
        // them.
        System.out.println("Greet: " + DemoClass.greet);
        System.out.println("a: " + DemoClass.a);
        System.out.println("b: " + DemoClass.b);
        DemoClass.hello();
    }
}

/**
 * Output:
 * Static Block Invoked...
 * Greet: Welcome
 * a: 10
 * b: 20
 * Hello, I'm from DemoClass...
 */
