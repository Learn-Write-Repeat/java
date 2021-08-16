# Class, Variable and Method in Java
>Java is an Object-Oriented programming Language which means it follows data controlling access to the code approch.
## **Declaration**
- `Declaration of Class` : A class is declared by use of the class keyword. The class body is enclosed between curly braces { and }. The data or variables, defined within a class are called instance variables. The code is contained within methods. Collectively, the methods and variables defined within a class are called **members of the class**.
   </br>The syntax:
   
   ![](https://www.w3resource.com/w3r_images/java-class-image.png)
- `Declaration of Instance Variables` : Variables defined within a class are called **instance variables** and every object has it's own copy of instance variable and each object contains it's own data. An instance variable can be declared public or private or default (no modifier). When we do not want our variable’s value to be changed out-side our class we should declare them private. public variables can be accessed and changed from outside of the class.
   </br>The syntax:
   
   ![](https://www.w3resource.com/w3r_images/declaration-of-instance-variables.png)
- `Declaration of Methods` : A method is a program module that contains a series of statements that carry out a task and it is optional to execute or not. To execute a method, you invoke or call it from another method; the calling method makes a method call, which invokes the called method. Any class can contain an unlimited number of methods, and each method can be called an unlimited number of times.
   </br>The syntax:

   ![java method declaration image](https://www.w3resource.com/w3r_images/declaration-of-methodes.png)
## **Access modifiers** :
   Each object has members (members can be variable and methods) which can be declared to have specific access. Java has 4 access level and 3 access modifiers. 
   </br>Access levels with there features are given below in the table:
   
   ![](https://media.geeksforgeeks.org/wp-content/cdn-uploads/Access-Modifiers-in-Java.png)
   
   `public: (Example code)`
   
   ```
   public class Vehicle {
   public int doors;
   public int speed;
   public String color;
   
   public void run(){
    //Run method implementation 
   }
   }
   ```
   
   `protected: (Example code)`
   ```
   public class Vehicle{
   protected int doors;
   protected String color;
   
   protected void run(){
    //Run method implementation
   }
   }
   ```
   `Default (no value): (Example code)`
   ```
   class Vehicle {
   int doors;
   int speed;
   String color;
   void run(){
     //Run method implementation.
   }
   }
   ```
   `private: (Example code)`
   ```
   public class Vehicle {
     private int doors;
     private int speed;
     private String color;

     public void run{
        //Run method implementation
     }
   }
   ```
   > Java has modifiers other than access modifiers listed below:
   > `static` : static can be used for members of a class. The static members of the class can be accessed without creating an object of a class. Static members are shared by all the objects of a class which mean it is property of class rather then object.
     `Example code`
     
     ```
     public class Vehicle {
     private int doors;
     private int speed;
     private String color;
     
     public static void run(){
     // Static Run method implementation.
     }
     public void stop (){
      //Implementation of Stop method
     }
     }
     class Maruti{
     public void TestVehicleClass(){
     //To Access run() method we don't need object of Vehicle class
     Vehicle.run();
     //To Access stop() method we need object of Vehicle class, else compilation fails.
     new Vehicle().stop();
     }
     }
     ```
 >In the Example in the Vehicle class run() is a static method and stop() is a non-static method. In Maruti class we can see how to access static method run () and non-static method stop ().
 > `final` : This modifier applicable to class, method, and variables. This modifier tells the compiler not to change the value of a variable once assigned. If applied to class, it cannot be sub-classed. If applied to a method, the method cannot be overridden in sub-class.
   `Example code`
   ```
   public class Person{
   private String name = "Amit";
   private final int age = 30;
   
   public void finaldemo(){
   name = "Amit Himani";
   //age = 35 ; this line will give you compile time error
   }
   }
   ```
   > `abstract`: There are situations in which you will want to define a superclass that declares the structure of a given abstraction without providing a complete implementation of every method. This modifier is applicable to class and methods only.
   
