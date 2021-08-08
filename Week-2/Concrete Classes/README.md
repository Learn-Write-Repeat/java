# Concrete Classes


## Concrete Class
A concrete class is a class that has an implementation for all of its methods
that were inherited from abstract or implemented via interfaces.  It is a
complete class and can be instantiated. It cannot be abstract. Furthermore, 
it is opposite to abstract.


## Example - 1
```java
// Example - 1

// A simple concrete public class named ConcreteEx1.
public class ConcreteEx1 {

    // add() method takes 2 integers and return their sum.
    static int add(int a, int b) {
        return a + b;
    }

    // multiply() method takes 2 integers and return their product.
    static int multiply(int a, int b) {
        return a * b;
    }

    // main() method contains driver code.
    public static void main(String[] args) {
        
        // Creating variables to hold integer values.
        int num1 = 10, num2 = 5;

        // Calling add() method with num1 and num2 and
        // printing the result.
        System.out.println("Sum: " + add(num1, num2));

        // Printing the result of multiply() with num1 and num2.
        System.out.println("Product: " + multiply(num1, num2));
    }
}
```
> *You can find the above code on [ConcreteEx1.java](ConcreteEx1.java).*


## Output
```
Sum: 15
Product: 50
```


## Example - 2
```java
// Example - 2

// Interface Calc contains declarations of method add() and multiply().
interface Calc {
    int add(int a, int b);
    int multiply(int a, int b);
}

// Abstract class add contains the implementation of add() method and
// it implements the Calc interface.
abstract class Add implements Calc {

    // Implementation of add() method
    public int add(int a, int b) {
        return a + b;
    }
}

// Public main class (Concrete) contains main() method and implemantation of
// multiply() method and it extends the abstract class Add.
public class ConcreteEx2 extends Add {
    
    // Implemantation of multiply() method.
    public int multiply(int a, int b) {
        return a * b;
    }

    // main() method contains driver code.
    public static void main(String[] args) {
        
        // Creating object for main class.
        ConcreteEx2 Obj = new ConcreteEx2();

        // Variables to hold integers.
        int num1 = 10, num2 = 5;

        // Calling add() method in Obj and printing the return value.
        System.out.println("Sum: " + Obj.add(num1, num2));

        // Calling multiply() method in Obj and printing the return value.
        System.out.println("Product: " + Obj.multiply(num1, num2));
    }
}
```
> *You can find the above code on [ConcreteEx2.java](ConcreteEx2.java).*


## Output
```
Sum: 15
Product: 50
```


## Author
[NanthaKumar](https://github.com/nknantha "NanthaKumar's Profile")
