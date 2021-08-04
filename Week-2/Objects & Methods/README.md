## Objects

An object is an instance of a class. A class is a template or blueprint from which objects are created. So, an object is the instance(result) of a class.

Object Definitions:

- An object is a real-world entity.
- An object is a runtime entity.
- The object is an entity which has state and behavior.
- The object is an instance of a class.

## Method in Java

In Java, a method is like a function which is used to expose the behavior of an object.



## Example
```java
/*******************************Object and Methods*******************************/

/*
In this example, we are creating the two objects of Student class and initializing the value to these objects by invoking the insertRecord method. Here, we are displaying the state (data) of the objects by invoking the displayInformation() method.
*/

class Student{  
 int rollno;  
 String name;  
 
 void insertRecord(int r, String n){  
  rollno=r;  
  name=n;  
 }  

 void displayInformation(){System.out.println(rollno+" "+name);
}}  

class TestStudent{  
 public static void main(String args[]){  

  Student s1=new Student();  
  Student s2=new Student(); 

  s1.insertRecord(111,"Karan");  
  s2.insertRecord(222,"Aryan");  
  s1.displayInformation();  
  s2.displayInformation();  
 }  
}  

