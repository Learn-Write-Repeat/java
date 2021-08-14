# Static Concept in Inheritance
  
  
## Static Methods
If a static method defined in parent class, that is overridden by a static method
in its subclass makes the parent static method to be hidden.  
It has 2 implications,
- The instance method invokes the one in subclass not the superclass.
- The hidden method gets invoked depend on where it's invoked from either superclass
or subclass.
  
  
## Example
Consider an example that contains 3 classes.
  
Class Fruit:
```java
class Fruit {

    // Static method.
    public static void whoAreYou() {
        System.out.println("I'm a static method, from Fruit class.");
    }

    // Instance method.
    public void whoAreYou() {
        System.out.println("I'm an instance method, from Fruit class.");
    }
}
```
  
Class Apple:
```java
class Apple extends Fruit {

    // Static method.
    public static void whoAreYou() {
        System.out.println("I'm a static method, from Apple class.");
    }

    // Instance method.
    public void whoAreYou() {
        System.out.println("I'm an instance method, from Apple class.");
    }    
}
```
The Apple class overrides the instance method of Fruit class and hides the static
method of Fruit class.
  
Main Class:
```java
// Main class contains main method.
public class StaticInheritance {

    // main() contains driver code.
    public static void main(String[] args) {

        Apple myApple = new Apple();
        Fruit myFruit = myApple;
        Fruit.whoAreYou();
        myFruit.whoAreYou();
        // myApple.whoAreYou();
    }
}
```
Creating object for Apple class then upcasting it to parent class Fruit. Then it
invokes the Fruit class method `whoAreYou()` and instance method `whoAreYou()`.
  
> *You can find the above code on [StaticInheritance.java](StaticInheritance.java).*
  
  
## Output
```
I'm a static method, from Fruit class.
I'm an instance method, from Apple class.
```
  
**REFERENCE:** https://docs.oracle.com/javase/tutorial/java/IandI/override.html
  
## Author
[NanthaKumar](https://github.com/nknantha "NanthaKumar's Profile")
