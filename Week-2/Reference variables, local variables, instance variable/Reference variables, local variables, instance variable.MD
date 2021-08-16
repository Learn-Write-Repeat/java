# Types of variables :
There are three types of variables in Java: 
 

* Local Variables
* Instance Variables
* Reference variables

### Local Variables: 
A variable defined within a block or method or constructor is called local variable. 
These variable are created when the block is entered or the function is called and destroyed after exiting from the block or when the call returns from the function.
The scope of these variables exists only within the block in which the variable is declared. i.e. we can access these variable only within that block.
Initilisation of Local Variable is Mandatory.

### Instance Variables: 
Instance variables are non-static variables and are declared in a class outside any method, constructor or block. 
As instance variables are declared in a class, these variables are created when an object of the class is created and destroyed when the object is destroyed.
Unlike local variables, we may use access specifiers for instance variables. If we do not specify any access specifier then the default access specifier will be used.
Initilisation of Instance Variable is not Mandatory. Its default value is 0
Instance Variable can be accessed only by creating objects.
### Reference variables:
When we create an object (instance) of class then space is reserved in heap memory. To access that allocated space we use a pointer variable this pointer variable is also known as reference variable. Classes, interfaces, arrays, enumerations, and, annotations are reference types in Java. Reference variables hold the objects/values of reference types in Java.
Reference variable can also store null value. By default, if no object is passed to a reference variable then it will store a null value.




```Example :```
```
public class VariableExample{
   int myVariable;
   static int data = 30;
   
   public static void main(String args[]){
      int a = 100;
      VariableExample obj = new VariableExample();
      VariableExample obj1 = obj ; //pointer or Reference variables
      
      System.out.println("Value of instance variable myVariable: "+obj.myVariable);
      System.out.println("Value of Reference variables myVariable: "+obj1.myVariable);
      System.out.println("Value of local variable a: "+a);
   }
}
```
`Output :`
```
Value of instance variable myVariable: 0
Value of Reference variables myVariable: 0
Value of local variable a: 100
```
