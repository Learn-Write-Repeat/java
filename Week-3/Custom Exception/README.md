# Custom Exception
  
  
## Custom Exception
We can define our own exception called custom exception as per need. It can be defined by
extending the `Exception` base class. It is used to give custom exceptional condition in a
desired project. It is also called user-defined exception. Using custom exception, we can
have our own exception and message. 
  
### Syntax
```java
access_modifier class CustomExceptionName extends Exception {

    // Constructor for custom exception that must invoke parent exception.
    public CustomExceptionName(String errorMessage) {
        super(errorMessage);
    }
}
```
  
  
## Example
```java
// Custom Exception class.
class InvalidAgeException extends Exception {

    // Constructor invokes parent constructor.
    public InvalidAgeException(String errorMessage) {
        super(errorMessage);
    }
}

// Main class contains the main method.
public class CustomException {
    
    // Method to check the age is adult.
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age: " + age + " is not belongs to adult");
        } else {
            System.out.println("Age: " + age + " is valid.");
        }
    }

    // main() method contains driver code.
    public static void main(String[] args) {
        
        // Invoking custom exception by passing non adult age.
        try {
            validateAge(11);
        }
        catch (InvalidAgeException e) {
            System.out.println("Catched Exception: " + e);
        }

        // Validating proper adult age.
        try {
            validateAge(20);
        }
        catch (InvalidAgeException e) {
            System.out.println("Catched Exception: " + e);
        }
    }
}
```
> *Note: You can find the above code on [CustomException.java](CustomException.java).*
  
  
**Reference:** https://www.javatpoint.com/custom-exception  
## Output
```
Catched Exception: InvalidAgeException: Age: 11 is not belongs to adult
Age: 20 is valid.
```
  
  
## Author
[NanthaKumar](https://github.com/nknantha "NanthaKumar's Profile")
