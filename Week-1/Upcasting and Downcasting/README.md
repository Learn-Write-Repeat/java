# Upcasting and Downcasting


## Type Casting
Type casting is a method or process of converting one data type to another
data type in both ways automatically and manually. Implicit conversion done
by the compiler and explicit conversion done by the programmer.


## Upcasting
A child object typecasted to its parent class object is known as Upcasting.
By upcasting an object to it's parent, we can access parent attributes and
methods. We can also access some specified methods of child class. Upcasting
can be done implicitly.

### Syntax
```java
ParentClass Obj = new ChildClass();
// Here child object created and typecasted automatically 
// to its parent object.
```


## Downcasting
A parent object typecasted to its child class object is known as Downcasting.
Downcasting cannot be done implicitly. When we forcefully typecast them, the
compiler checks in the background if this typecasting possible or not and
throws a ClassCastException if it is not possible.

### Syntax
```java
// Here we're using Upcasted Obj for downcasting.
ChildClass Obj2 = (ChildClass) Obj;
// Note that we're explicitly typecasting parent object
// to its child by '(ChildClass)'.
```


## Example
```java
// Parent class contains a method tell()
class Parent {
    
    // Attribute to explain upcasted access from child.
    String name = "Parent";

    void tell() {
        // Prints a msg from parent class.
        System.out.println("Parent Method");
    }
}

// Child class that extends parent class 
// and overrides parent class's tell() method.
class Child extends Parent {
    
    // Overrides the parent's tell() method and
    // prints msg from child class.
    @Override
    void tell() {
        System.out.println("Child Method");
    }
} 

// Public class UpcastingAndDowncasting which is a main class.
public class UpcastingAndDowncasting {

    // main() method to run program.
    public static void main(String[] args) {
        // Creating object for child class and Upcasting it 
        // to parent.
        Parent Obj = new Child();

        // Accessing and printing name attribute in parent class.
        System.out.println(Obj.name);
        
        // Calling tell() method which is overridden by child class.
        Obj.tell();

        // Downcasting Obj to child class.
        Child Obj2 = (Child) Obj;

        // After downcasting calling tell() method.
        Obj2.tell();
    }
}
```
> *Note: You can also find above code on [UpcastingAndDowncasting.java](UpcastingAndDowncasting.java).*


## Output
```
Parent
Child Method
Child Method
```


## Author
[NanthaKumar](https://github.com/nknantha "NanthaKumar's Profile")
