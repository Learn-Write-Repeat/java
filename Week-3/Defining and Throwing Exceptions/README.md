# Defining and Throwing Exceptions
  
  
## Exceptions
An exception is an event, which occurs during the execution of a program, that disrupts the
normal flow of the program's instructions. 
  
When an error occurs within a method, the method creates an object and hands it
off to the runtime system. The object, called an exception object, contains information
about the error, including its type and the state of the program when the error occurred.
Creating an exception object and handing it to the runtime system is called throwing an exception.
  
  
## Throwing Exceptions
`throw` keyword used to throw Exceptions in a custom manner. The method throws an exception
must be specified as such `throws` clause. 
  
### Syntax
```java
throw <Exception>;
```
```java
accessModifier returnType methodName(datatype param,...) throws <Exception> {
    // Body of the method.
}
```
  
  
## Example
```java
// Main class contains the main method.
public class ThrowingException {
    
    // Divide method divides the given numbers.
    // It may throws ArithmeticException and base Exception.
    public static int divide(int a, int b) throws ArithmeticException, Exception {
        
        // Throwing manual exception if a < b.
        if (a < b) {
            throw new Exception("Value a: " + a + ", should be greater than value b: " + b);
        }
        return a / b;
    }

    // Execute and manages the exception with try catch.
    public static void execDivide(int a, int b) {
        try {
            System.out.println("Result: " + divide(a, b));
        }
        catch (ArithmeticException e) {
            System.out.println("Catched Exception: " + e);
        }
        catch (Exception e) {
            System.out.println("Catched Exception: " + e);
        }
    }

    // main() method contains the driver code.
    public static void main(String[] args) {
        
        // First we try to catch ArithmeticException.
        execDivide(5, 0);

        // Second we try to catch manual exception.
        execDivide(5, 10);
    }
}
```
> *Note: You can find the above code on [ThrowingException.java](ThrowingException.java).*
  
  
## Output
```
Catched Exception: java.lang.ArithmeticException: / by zero
Catched Exception: java.lang.Exception: Value a: 5, should be greater than value b: 10
```
  
  
**Reference:** https://docs.oracle.com/javase/tutorial/essential/exceptions/definition.html
## Author
[NanthaKumar](https://github.com/nknantha "NanthaKumar's Profile")
