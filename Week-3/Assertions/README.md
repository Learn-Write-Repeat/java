# Assertions
  
  
## Assertions
Assertions is used to test assumption about the program in Java. `assert` keyword
used to make assertion. While executing assertion, it is believed to be true. If
it fails, JVM throws an error named `AssertionError`. It is mainly used for testing
purposes during development.
  
### Syntax
```java
assert expression;
```
OR
```java
assert expression1: expression2;
```
  
### Enabling Assertion
By default assertion is disabled in JVM. Use the following command to enable it.
```
java -ea filename.java
```
OR
```
java --enableassertion filename.java
```
For disabling assertion use `-da` or `--disableassertion` instead of `-ea` or
`--enableassertion`.
  
### Where to not use assertion
- Assertion should not be used to check arguments in the public methods because it
should result in appropriate runtime exception.
- Do not use assertion, if you don't want any error in any situation.
  

## Example
```java
// Main class contains main method.
public class Assertions {
    
    // method to check minimum.
    public static void checkMinimum(int num) {
        assert num > 21: "Value under minimum";
        System.out.println("Given Value: " + num);
    }

    // main() method contains example.
    public static void main(String[] args) {
        
        // Invoking assertion.
        checkMinimum(7);

        // Value > 21
        checkMinimum(25);
    }
}
```
> *Note: You can find the above code on [Assertions.java](Assertions.java).*
  

## Output
On assertion disabled,
```
Given Value: 7
Given Value: 25
```
On assertion enabled,
```
Exception in thread "main" java.lang.AssertionError: Value under minimum
        at Assertions.checkMinimum(Assertions.java:13)
        at Assertions.main(Assertions.java:21)
```
  

**Reference:**  
https://www.geeksforgeeks.org/assertions-in-java/  
https://www.javatpoint.com/assertion-in-java
## Author
[NanthaKumar](https://github.com/nknantha "NanthaKumar's Profile")
