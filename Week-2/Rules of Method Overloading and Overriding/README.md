# Rules of Method Overloading and Overriding
  
  
## Method Overloading
If a class have more than 1 method with same name with different signature is
known as method overloading. It increases the productivity and provides greater
readability.
  
There are 2 ways to overload a method,
- By changing the number of parameter.
- By changing the datatype of parameter.
  
### Rules for Method Overloading
  
#### 1. Method Signature
The first rule is to change the method signature. The method signature can be 
changed by changing the number of parameters or changing the datatype of the 
parameters or changing the position of parameters. You can use any of these
combinations to overload a method.
  
#### 2. Method Return Type
By changing the return type we cannot overload a method, because of return type
not a part of a method signature. If you tried to overload with this, the compiler
will throw error.
  
  
## Method Overriding
An inherited class or an implemented interface methods have another definition
in its child class known as method overloading. While creating object for child
class, the same methods in parent class will be overridden by the child class 
methods. It is used for runtime polymorphism. 
  
### Rules for Method Overriding
  
#### 1. Location
A method can only be overridden in subclass, not in the same class. The subclass
must inherit the parent class contains the method to be overridden.
  
#### 2. Exception
Overriding method cannot throw any checked Exception which is in the hierarchy,
than checked Exception thrown by the overridden method.
  
#### 3. Visibility
The overriding method cannot reduce the accessibility of the overridden method.
i.e. the private overriding method cannot override a public overridden method.
You cannot reduce the visibility of inherited method of a class.
  
#### 4. Accessibility
Overriding method can increase the visibility of overridden method. This is
opposite to the rule Visibility. i.e. the overridden method declared as private
then the overriding method can be protected or public.
  
#### 5. Type of Methods
Access modifier specified as private, final and static methods cannot be overridden
in Java. This provides security to methods. If you tried to override them compiler
throws an error.
  
#### 6. Return Type
The return type of the overriding method must be same as the overridden method.
  
  
## Example
```java
// Base class for Animal.
class Animal {
    
    // Overridden method makeSound() follows the rules of
    // method overriding. Note that here the method is protected (non public).
    protected String makeSound() {
        return "Base Animal Sound...";
    }
}

// Dog class that extends the Animal.
class Dog extends Animal {

    // Overriding method makeSound() follows the rules of method overriding.
    // Note that here the method is public (not default).
    public String makeSound() {
        return "Bow Bow...";
    }
}

// Main class containes driver code and example.
public class MethodOverloadOverride {

    // Creating static methods for overloading. static used for invoke 
    // method without creating object.
    // Method sum() for adding 2 integers and return the sum.
    static int sum(int a, int b) {
        return a + b;
    }

    // Method sum() adds 2 floats and return the sum.
    static float sum(float a, float b) {
        return a + b;
    }

    // main method for execution.
    public static void main(String[] args) {
        
        
        // Example of overriding.

        // Creating Object for Dog class and calling the makeSound() method
        // and testing it against Animal class object.
        System.out.println("From Dog: " + new Dog().makeSound());
        System.out.println("From Animal: " + new Animal().makeSound());


        // Example of overloading.

        // Calling sum() methods with intergers and floats then prints the
        // result.
        System.out.println("Integer Addition, 5 + 4 : " + sum(5, 4));
        System.out.println("Float Addition, 5.0 + 4.0 : " + sum(5.0f, 4.0f));
        // On above code 'f' used after floating numbers. This is because when we 
        // use decimal point numbers without suffix 'f', Java treat is as double
        // datatype.
    }    
}
```
> *Note: You can find the above code on [MethodOverloadOverride.java](MethodOverloadOverride.java).*
  
  
## Output
```
From Dog: Bow Bow...
From Animal: Base Animal Sound...
Integer Addition, 5 + 4 : 9
Float Addition, 5.0 + 4.0 : 9.0
```
  
  
## Author
[NanthaKumar](https://github.com/nknantha "NanthaKumar's Profile")
