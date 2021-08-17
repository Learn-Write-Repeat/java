/**
 * This file contains the example of StaticInheritance in Java.
 * 
 * @author NanthaKumar <https://github.com/nknantha>
 * @date 2021/08/14
 */

class Fruit {

    // Static method.
    public static void staticMethod() {
        System.out.println("I'm a static method, from Fruit class.");
    }

    // Instance method.
    public void instanceMethod() {
        System.out.println("I'm an instance method, from Fruit class.");
    }
}

class Apple extends Fruit {

    // Static method.
    public static void staticMethod() {
        System.out.println("I'm a static method, from Apple class.");
    }

    // Instance method.
    public void instanceMethod() {
        System.out.println("I'm an instance method, from Apple class.");
    }    
}

// Main class contains main method.
public class StaticInheritance {

    // main() contains driver code.
    public static void main(String[] args) {

        Apple myApple = new Apple();
        Fruit myFruit = myApple;
        Fruit.staticMethod();
        myFruit.instanceMethod();
    }
}

/**
 * Output:
 * I'm a static method, from Fruit class.
 * I'm an instance method, from Apple class.
 */
