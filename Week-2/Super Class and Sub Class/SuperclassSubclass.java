/**
 * This file contains the example code for Superclass and Subclass demonstration.
 * It contains a parent class Animal and child classes Dog and Cat. It contains
 * a main class contains driver code.
 * 
 * @author NanthaKumar <https://github.com/nknantha>
 * @date 2021/08/07
 */

// Base class Animal contains parent functionality.
class Animal {

    // Stores animal name.
    public String name = "Base Animal";

    // Different animals make different sounds so we declaring base class method
    // makeSound() to easily override from child classes.
    public void makeSound() {
        System.out.println("Base Animal Sound...");
    }
}

// Dog class (subclass) extends the Animal class.
class Dog extends Animal {

    // Constructor that changes the parent name attribute by using
    // "super" keyword.
    Dog() {
        super.name = "Dog";
    }

    // Dogs makes sound "Bow Bow". For that we're overriding parent class
    // makeSound() method.
    public void makeSound() {
        System.out.println("Bow Bow...");
    }
}

// Cat class (subclass) extends the Animal class.
class Cat extends Animal {

    // Constructor that changes the parent name attribute by using
    // "super" keyword.
    Cat() {
        super.name = "Cat";
    }

    // Overriding parent makeSound() with "Meow Meow".
    public void makeSound() {
        System.out.println("Meow Meow...");
    }
}

// public class contains main method.
public class SuperclassSubclass {

    // main() method contains driver code.
    public static void main(String[] args) {
        
        // Objects creation for animals.
        Animal baseAnimal = new Animal();
        Dog doggy = new Dog();
        Cat kitty = new Cat();

        // Calling makeSound() of all Animals.
        System.out.println("Making Sounds...");

        System.out.print("From " + baseAnimal.name + ", "); 
        baseAnimal.makeSound();
        
        System.out.print("From " + doggy.name + ", "); 
        doggy.makeSound();
        
        System.out.print("From " + kitty.name + ", "); 
        kitty.makeSound();
    }
}

/**
 * OUTPUT:
 * Making Sounds...
 * From Base Animal, Base Animal Sound...
 * From Dog, Bow Bow...
 * From Cat, Meow Meow...
 */
