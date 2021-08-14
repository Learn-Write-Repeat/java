# Default and Parameterized Constructor
  
  
## Default Constructor
A constructor having no parameter is known as default constructor. It is used to
assign default value to the object. If there is no constructor in a class the
compiler automatically creates a default constructor.
  
### Syntax
```java
<className>() {
    // body of the constructor.
}
```
  

## Parameterized Constructor
A constructor having specific number of parameter is called parameterized constructor.
It assigns the given value to the object. 
  
### Syntax
```java
<className>(datatype parameter,...) {
    // body of the constructor.
}
```
  

## Example
```java
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
```
> *You can find the above code on [Constructors.java](Constructors.java).*
  
  
## Output
```
Animal: color = Red
Fruit: color = Orange
```
  
  
## Author
[NanthaKumar](https://github.com/nknantha "NanthaKumar's Profile")
