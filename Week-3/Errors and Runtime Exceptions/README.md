# Errors and Runtime Exceptions
  
  
## Exceptions
An exception is an event, which occurs during the execution of a program, that disrupts the
normal flow of the program's instructions. It may occur at compile time and runtime. It can
be thrown manually by developer. It can be handled by `try{}catch{}` blocks. Exception
may be checked and unchecked.
  

## Errors
Errors are the problem that happens at runtime unexpectedly. It cannot be handled or caught.
It indicates a serious problem. These are all unchecked. Example: `Assertion­Error`, 
`Linkage­Error`.
  
| Exceptions | Errors |
|:---|:---|
| We can recover from exceptions using `try` `catch` blocks. | Impossible to recover. |
| It has checked and unchecked classification. | All errors are unchecked. |
| It occurs at compile and runtime. | It occurs only at runtime. |
| Base class: `java.lang.Exception`. | Base class: `java.lang.Error`. |
| Checked exceptions are known to compiler. | Errors cannot be known to compiler. |
| Examples:<br> **Checked Exceptions:** `Class­Not­Found­Exception`, `Illegal­Access­Exception`.<br> **Unchecked Exceptions:** `Arithmetic­Exception`, `Array­Store­Exception`. | Examples: `Out­Of­Memory­Error`, `Stack­Overflow­Error`. |
  

## Example
```java
// Class for example of ArithmeticException.
class ExceptionExample {

    // Method containing code to make ArithmeticException.
    public static void exec() {
        int a = 9, b = 0;

        try {
            System.out.println("Result: " + a / b);
        }
        catch (ArithmeticException e) {
            System.out.println("Catched Exception: " + e);
        }
    }
}

// Class for Error example.
class ErrorExample {

    // Method to make StackOverFlowError.
    public static void exec(int i) {
        
        // Recursive call with incremented value.
        exec(++i);
    }
}

// Main class contains the main method.
public class ExceptionError {

    // main() method contains driver code.
    public static void main(String[] args) {
        
        // Calling methods to execute examples.
        ExceptionExample.exec();
        ErrorExample.exec(1);
    }
}
```
> *Note: You can find the above code on [ExceptionError.java](ExceptionError.java).*
  

## Output
```
Catched Exception: java.lang.ArithmeticException: / by zero
Exception in thread "main" java.lang.StackOverflowError
        at ErrorExample.exec(Main.java:39)
        at ErrorExample.exec(Main.java:39)
        at ErrorExample.exec(Main.java:39)
        at ErrorExample.exec(Main.java:39)
        at ErrorExample.exec(Main.java:39)
...
```
  
**Reference:**   
https://www.geeksforgeeks.org/errors-v-s-exceptions-in-java/  
https://www.javatpoint.com/exception-vs-error-in-java
  

## Author
[NanthaKumar](https://github.com/nknantha "NanthaKumar's Profile")
