### Inheritance

Inheritance in Java is a concept that acquires the properties from one class to other classes; for example, the relationship between father and son. 

- In Java, a class can inherit attributes and methods from another class. The class that inherits the properties is known as the sub-class or the child class. 
- The class from which the properties are inherited from is know as the superclass or the parent class.
- Inheritance is also known as the IS-A relationship. 

### Types of Inheritance in Java 

- Single Inheritance: Creating subclasses from a single base class is called single inheritance. 
- Multiple Inheritance: In this case, there is more than one superclass, and there can be one or more subclasses but it is not available in Java.
- Multilevel Inheritance: In Multi-Level Inheritance in Java, a class extends to another class that is already extended from another class. 

### Super keyword 
- We can invoke the superclass variables. 
- We can invoke the superclass methods. 
- We can invoke the superclass constructor. 


## Example
```java
/******************************* Inheritance *******************************/


class superclass 
{ 
 // superclass data variables 
 // superclass member functions 
} 

class subclass ​extends​ superclass 
{ 
 // subclass data variables 
 // subclass member functions 
}


class Parent        // parent class
{ 
 public void M1() 
 { 
 System.out.println("Parent Class Method"); 
 } 
} 
class Child extends Parent          // child class
{ 
 public void M2() 
 { 
 System.out.println("Child Class Method"); 
 } 
} 
class Inh_In_Java 
{ 
 public static void main(String[] args)
 { 
 Child p=new Child();       // object of child class
 p.M1();            // methods
 p.M2(); 
 } 
} 

```