# Static Variables and Methods
  

## Static Keyword
The keyword `static` gives the static property to the Java class. It is
belonged to class than instance of the class. It can be used with,
- Variables
- Methods
- Blocks
  

## Static Variables
A variable defined with `static` keyword is known as static variable.
- It belongs to the class not to the instance(object).
- It gives common property across objects created with same class.
- These variables get initialized first than any other instance variables in
the class.
- A static variable inside a class can be accessed without creating an object.
  
  
## Static Methods
A method defined with `static` keyword is known as static method.
- It belongs to the class not to the object(instance).
- It only accesses static data member and can change the value of it.
- It can be invoked without creating an object.
  

## Static Blocks
A block can be defined with `static` keyword is known as static block.
- It's executed when the class loaded in JVM.
- It helps to initialize static data members inside a class.
  
  
## Example
```java
// DemoClass contains static attributs, methods and block.
class DemoClass {

    // Static attribute.
    static String greet = "Welcome";
    static int a, b;

    // Static block. It'll be loaded when class loaded in JVM.
    static {
        System.out.println("Static Block Invoked...");

        // Here the static attributes accessed by a static block.
        a = 10;
        b = 20;
    }

    // Static method.
    static void hello() {
        System.out.println("Hello, I'm from DemoClass...");
    }

}

// Main class contains the main method().
public class StaticVariableMethod {

    // main() method contains the driver code.
    public static void main(String[] args) {
        
        // Directly accessing DemoClass attributes and printing
        // them.
        System.out.println("Greet: " + DemoClass.greet);
        System.out.println("a: " + DemoClass.a);
        System.out.println("b: " + DemoClass.b);
        DemoClass.hello();
    }
}
```
> *You can find the above code on [StaticVariableMethod.java](StaticVariableMethod.java).*
  

## Output
```
Static Block Invoked...
Greet: Welcome
a: 10
b: 20
Hello, I'm from DemoClass...
```
  

## Author
[NanthaKumar](https://github.com/nknantha "NanthaKumar's Profile")
