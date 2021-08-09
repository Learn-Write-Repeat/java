### Inheritance

Inheritance in Java is a concept that acquires the properties from one class to other classes; for example, the relationship between father and son. 

- In Java, a class can inherit attributes and methods from another class. The class that inherits the properties is known as the sub-class or the child class. 
- The class from which the properties are inherited from is know as the superclass or the parent class.
- Inheritance is also known as the IS-A relationship. 

### Types of Inheritance in Java 

- Single Inheritance: Creating subclasses from a single base class is called single inheritance. 
- Multiple Inheritance: In this case, there is more than one superclass, and there can be one or more subclasses but it is not available in Java.
- Multilevel Inheritance: In Multi-Level Inheritance in Java, a class extends to another class that is already extended from another class.
- Hierarchical Inheritance: A class can have more than one class derived from it. So we have one base or superclass and more than one subclasses. 
Eg: of hierarchical inheritance, we can represent Animal class as a superclass and then have more than one animal like Cat, Dog, Cow, etc. derived from it. 

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

// Eg of SIngle Inheritance
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



// Eg of multilevel inheritance
import java.util.*; 
import java.lang.*; 
import java.io.*; 
//parent class A  
class A 
{ 
    public void print_A() 
    { 
        System.out.print("SoftwareTestingHelp "); 
    } 
} 
//Derived class B - intermediary  
class B extends A 
{ 
    public void print_B() 
    { 
        System.out.print("Java Series "); 
    } 
} 
//Derived Class C  
class C extends B 
{ 
    public void print_C() 
    { 
        System.out.print("Tutorials"); 
    } 
} 
 
public class Main 
{ 
    public static void main(String[] args) 
    { 
        C c_obj = new C();  //create Class C obj 
        c_obj.print_A();    //call grandparent class method
        c_obj.print_B();    //call parent class method
        c_obj.print_C();    //call member method
    } 
}



// Eg of hierarchical inheritance
//class Parent 
class Parent 
{ 
    public void print_parent() 
    { 
        System.out.println("In ::Parent class"); 
    } 
} 
//child1 class  
class Child1 extends  Parent
{ 
    public void print_child1() 
    { 
        System.out.println("In ::Child1 class"); 
    } 
} 
//child2 class  
class Child2 extends Parent 
{ 
    public void print_child2() 
    { 
        System.out.println("In ::Child2 class"); 
    } 
} 
//child3 class
class Child3 extends Parent 
{ 
    public void print_child3() 
    { 
        System.out.println("In ::Child3 class"); 
    } 
} 
   
public class Main 
{ 
    public static void main(String[] args) 
    { 
        Child1 ch1 = new Child1();      //create a Child1 class object
        ch1.print_child1();             //call its member method
        Child2 ch2 = new Child2();      //create a Child2 class object
        ch2.print_child2();             //call its member method
        Child3 ch3 = new Child3();      //create a Child3 class object
        ch3.print_child3();             //call its member method
        ch3.print_parent();             //call parent class method with any object
    } 
}

```