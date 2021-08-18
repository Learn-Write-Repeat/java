/**
 * This file contains the example of types of constructor.
 * 
 * @author NanthaKumar <https://github.com/nknantha>
 * @date 2021/08/14
 */

// Class Animal contains default and parameterized constructor.
class Animal {

    public String color;

    // Default constructor.
    Animal() {

        // Storing default value in instance variable.
        this.color = "Red";
    }
    
    // Parameterized constructor.
    Animal(String color) {

        // Storing given value in instance variable.
        this.color = color;
    }
}

// Main class contains the main() method.
public class Constructors {

    // main() method contains the driver code.
    public static void main(String[] args) {
        
        // Creating objects for Animal.
        Animal myAnimal = new Animal();
        Animal myAnimal2 = new Animal("Orange");

        // Printing the values of color in objects.
        System.out.println("myAnimal: color = " + myAnimal.color);
        System.out.println("myAnimal2: color = " + myAnimal2.color);
    }
}

/**
 * Output:
 * myAnimal: color = Red
 * myAnimal2: color = Orange
 */
