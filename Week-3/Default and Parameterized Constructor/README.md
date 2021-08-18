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
```
> *You can find the above code on [Constructors.java](Constructors.java).*
  
  
## Output
```
myAnimal: color = Red
myAnimal2: color = Orange
```
  
  
## Author
[NanthaKumar](https://github.com/nknantha "NanthaKumar's Profile")
