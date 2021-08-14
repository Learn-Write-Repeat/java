/**
 * This file contains the example of types of constructor.
 * 
 * @author NanthaKumar <https://github.com/nknantha>
 * @date 2021/08/14
 */

// Class Animal contains default constructor.
class Animal {

    public String color;

    // Default constructor.
    Animal() {

        // Storing default value in instance variable.
        this.color = "Red";
    }
}

// Class Fruit contains parameterized constructor.
class Fruit {

    public String color;

    // Parameterized constructor.
    Fruit(String color) {

        // Storing the given value in instance variable.
        this.color = color;
    }
}

// Main class contains the main() method.
public class Constructors {

    // main() method contains the driver code.
    public static void main(String[] args) {
        
        // Creating objects for Animal and Fruit.
        Animal myAnimal = new Animal();
        Fruit myFruit = new Fruit("Orange");

        // Printing the values of color in both classes.
        System.out.println("Animal: color = " + myAnimal.color);
        System.out.println("Fruit: color = " + myFruit.color);
    }
}

/**
 * Output:
 * Animal: color = Red
 * Fruit: color = Orange
 */
