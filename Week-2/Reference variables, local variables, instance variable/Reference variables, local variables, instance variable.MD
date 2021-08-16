# Types of variables :
There are three types of variables in Java: 
 

* Local Variables
* Instance Variables
* Static Variables

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
### Static Variables:
Static variables are also known as Class variables. 
These variables are declared similarly as instance variables, the difference is that static variables are declared using the static keyword within a class outside any method constructor or block.
Unlike instance variables, we can only have one copy of a static variable per class irrespective of how many objects we create.
Static variables are created at the start of program execution and destroyed automatically when execution ends.
Initilisation of Static Variable is not Mandatory. Its default value is 0
If we access the static variable like Instance variable (through an object), the compiler will show the warning message and it won’t halt the program. The compiler will replace the object name to class name automatically.
If we access the static variable without the class name, Compiler will automatically append the class name.


```Example :```
```
public class VariableExample{
   int myVariable;
   static int data = 30;
   
   public static void main(String args[]){
      int a = 100;
      VariableExample obj = new VariableExample();
      
      System.out.println("Value of instance variable myVariable: "+obj.myVariable);
      System.out.println("Value of static variable data: "+VariableExample.data);
      System.out.println("Value of local variable a: "+a);
   }
}
```
`Output :`
```
Value of instance variable myVariable: 0
Value of static variable data: 30
Value of local variable a: 100
```
