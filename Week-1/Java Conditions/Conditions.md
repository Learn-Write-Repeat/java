# Java Conditions and If Statements

### Java supports the usual logical conditions from mathematics:

* Less than: a < b
* Less than or equal to: a <= b
* Greater than: a > b
* Greater than or equal to: a >= b
* Equal to a == b
* Not Equal to: a != b

### Java has the following conditional statements:

* Use if to specify a block of code to be executed, if a specified condition is true
* Use else to specify a block of code to be executed, if the same condition is false
* Use else if to specify a new condition to test, if the first condition is false
* Use switch to specify many alternative blocks of code to be executed

# The if Statement
### The if statement is used to specify a block of Java code to be executed if a condition is true.
## **Syntax**
```python
if (condition) {
```
  > block of code to be executed if the condition is true
`}`
## Example:
```python
public class Main {
  public static void main(String[] args) {
    if (20 > 18) {
      System.out.println("20 is greater than 18"); // obviously
    }  
  }
}
```
### Output:
`20 is greater than 18`

# The else Statement
### We use the else statement to specify a block of code to be executed if the condition is false.
## **Syntax**
```python
if (condition) {
```
  > block of code to be executed if the condition is true
`}`
```python
else {
```
  > block of code to be executed if the condition is false
`}`
## Example:
```python
public class Main {
  public static void main(String[] args) {
    int time = 20;
    if (time < 18) {
      System.out.println("Good day.");
    } else {
      System.out.println("Good evening.");
    }  
  }
}
```
### Output:
`Good evening`

# The else if Statement
### The else if statement is used to specify a new condition if the first condition is false.
## **Syntax**
```python
if (condition1) {
```
  > block of code to be executed if condition1 is true
`}`
```python
else if (condition2) {
```
  > block of code to be executed if the condition1 is false and condition2 is true
`}`
```python
else {
```
  > block of code to be executed if the condition1 is false and condition2 is false
`}`
## Example:
```python
public class Main {
  public static void main(String[] args) {
    int time = 22;
    if (time < 10) {
      System.out.println("Good morning.");
    } else if (time < 20) {
      System.out.println("Good day.");
    }  else {
      System.out.println("Good evening.");
    }
  }
}
```
### Output:
`Good evening`

# Short Hand If...Else (Ternary Operator)
### There is also a short-hand if else, which is known as the ternary operator because it consists of three operands. It can be used to replace multiple lines of code with a single line. It is often used to replace simple if else statements:
## **Syntax**
`variable = (condition) ? expressionTrue :  expressionFalse;`
## Example:
```python
public class Main {
  public static void main(String[] args) {
    int time = 20;
    if (time < 18) {
      System.out.println("Good day.");
    } else {
      System.out.println("Good evening.");
    }  
  }
}
```
### Output:
`Good evening`


```python

```
