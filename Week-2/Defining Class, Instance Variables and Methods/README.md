# Defining Class, Instance Variables and Methods


## Defining Class
Class is a blueprint or prototype from which objects are created. It is a logical entity.
A class can have attributes and methods.

### Syntax
```java
<access_modifier> class <class_name> {
    // body of the class.
}
```
- access_modifier: Specifies the accessibility of the class. It takes default if we don't specify anything.
- class_name: The name of the class. The name should be start with an initial letter, it capitalized for convention.


## Defining Instance Variables
Variables created inside class and outside methods known as instance variables. It doesn't get memory at
compile time, it gets memory only when object being created. It is also known as attributes.

### Syntax
```java
class ClassName {
    <data_type> <variable_name>;
}
```
- data_type: The data type of the instance variable.
- variable_name: The name of the instance variable.

Like variables, we initialize instance variables at the time of declaring.


## Defining Methods
A method is a block of code which only runs when it's called. It's like a function which is used to
expose behavior of an object. It provides code reusability and code optimization.

### Syntax
```java
class ClassName {
    <access_modifier> <return_type> <method_name>(<parameters>) {
        // body of the method.
    }
}
```
- access_modifier: Specifies the accessibility of the class. It takes default if we don't specify anything.
- return_type: Defines the return type of the method.
- method_name: Name of the function. By convention method name should be in camelCase.
- parameters: List of all parameters and their data types.


## Example
```java
// Default class Student contains example attributes and methods.
class Student {
    
    // Defining private student name instance variable.
    private String name;

    // A method to get student name.
    public String getName() {
        return this.name;
    }

    // A method to set student name. Takes a parameter name to get assigned.
    public void setName(String name) {
        this.name = name;
    }
}

// Public class ClassVariableMethod for example demonstration.
public class ClassVariableMethod {

    // Public main() contains example code.
    public static void main(String[] args) {

        // Creating object for student class.
        Student Obj = new Student();

        // Checking initial name of Obj.
        System.out.println("Initially, name is " + Obj.getName());

        // Changing name to Steve.
        // Obj.name = "Steve"; // this creates error because of private modifier.
        Obj.setName("Steve");

        // After changing name accessing name of Obj.
        System.out.println("After name change, name is " + Obj.getName());
    }
}
```
> *Note: You can find above code on [ClassVariableMethod.java](ClassVariableMethod.java)*


## Output
```
Initially, name is null
After name change, name is Steve
```


## Author
[NanthaKumar](https://github.com/nknantha "NanthaKumar's Profile")
