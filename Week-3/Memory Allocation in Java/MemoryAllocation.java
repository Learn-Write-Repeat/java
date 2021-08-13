/**
 * This file demonstrate memory allocation in java. It contains the example of
 * Stack Memory and Heap Space.
 * 
 * @author NanthaKumar <https://github.com/nknantha>
 * @date 2021/08/13
 */

// Class Fruit contains attributes and a method.
class Fruit {

    // While creating object for this class it acquire its
    // memory for attributes and methods in its own Stack memory.

    // Creating attributes.
    String color = "Red";
    int weight = 2;

    // method toString() gives color and weight.
    public String toString() {
        return "Color: " + this.color + ", Weight: " + 2;
    }
}

// Main class MemoryAllocation.
public class MemoryAllocation {

    // main() method contains the driver code.
    public static void main(String[] args) {

        // Here we're creating object for Fruit class.
        // The object created and stored in Heap memory while
        // their attributes, methods are stored in Stack memory.

        // Creating object for fruit.
        System.out.println("Creating object for Fruit...");
        Fruit apple = new Fruit();

        // Printing apple object.
        System.out.println("Object Apple: " + apple.toString());
    }
}

/**
 * Output: 
 * Creating object for Fruit... 
 * Object Apple: Color: Red, Weight: 2
 */
