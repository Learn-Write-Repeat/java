/**
 * This file contains the example of this and super call constructor.
 * 
 * @author NanthaKumar <https://github.com/nknantha>
 * @date 2021/08/17
 */

// Base class Fruit.
class Fruit {

    String color;

    Fruit() {
        // this keyword used to access the attribute in current class.
        this.color = "Red";
        System.out.println("Fruit default constructor invoked...");
    }

    Fruit(String color) {
        // this keyword used to access the attribute in current class.
        this.color = color;
        System.out.println("Fruit parameterized constructor invoked...");
    }
}

// Derived class Apple from Fruit.
class Apple extends Fruit {

    Apple() {
        // super keyword used to invoke the parent class constructor.
        super();
        System.out.println("Apple default constructor invoked...");
    }

    Apple(String color) {
        // super keyword used to invoke the parent class constructor.
        super(color);
        System.out.println("Apple parameterized constructor invoked...");
    }
}

// Main class contains the main method.
public class thisSuperConstructor {
    
    // main() method contains the driver code.
    public static void main(String[] args) {
        
        // Creating object to invoke constructors.
        Apple myApple = new Apple();
        Apple myApple2 = new Apple("Green");
        System.out.println("myApple Color: " + myApple.color);
        System.out.println("myApple2 Color: " + myApple2.color);
    }
}

/**
 * Output:
 * Fruit default constructor invoked...
 * Apple default constructor invoked...
 * Fruit parameterized constructor invoked...
 * Apple parameterized constructor invoked...
 * myApple Color: Red
 * myApple2 Color: Green
 */
