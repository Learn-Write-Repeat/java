# Super Class and Sub Class


## Super Class
Super class is defined as the base class of a derived class in which it's inherits to.
In other words, it is the top class of a derived class. It contains the base functionality
and behavior of a class. We cannot assign a super class object to its subclass variable type
without explicit type casting. Super class is also known as parent class. `super` keyword is used to
access parent class attributes and methods from a subclass.


## Sub Class
Sub class is the derived class of a base class in which it's inherits from. It has an 'is a'
relationship with its parent class. We can assign a subclass object to its super class
variable type without explicit type casting. Subclass is also known as child class. In child class
we can override the functionality of its parent class. It provides better code reusability.


Both super class and subclass concepts are mainly used in Inheritance concept. `extends` keyword
is used to inherit classes.

### Syntax
```java
class ClassName extends ParentClass {
    // body of the child class.
    // use "super" keyword to access ParentClass attributes and methods.
}
```


## Example
```java
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
```
> *Note: You can find the above code on [SuperclassSubclass.java](SuperclassSubclass.java).*


## Output
```
Making Sounds...
From Base Animal, Base Animal Sound...
From Dog, Bow Bow...
From Cat, Meow Meow...
```


## Author
[NanthaKumar](https://github.com/nknantha "NanthaKumar's Profile")
