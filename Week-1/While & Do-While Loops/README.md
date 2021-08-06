# While loops

The Java while loop is used to iterate a part of the program repeatedly until the specified Boolean condition is true. As soon as the Boolean condition becomes false, the loop automatically stops.

Java while loop is called an entry control loop because condition is specified at the start itself.

Loops consists of 3 parts:
- initialization expression (initializing the loop variable)
- conditional expression  (limit for the loop to run )
- increment/decrement of looping variable

### *initialization expression*
Initialization occurs once, as the loop begins.
Initialization usually consists of a single variable declaration 
Eg: int x = 0

### *conditional expression/ termination expression*
The termination expression is evaluated and if true, execution continues with the statement (loop body).
The loop body will never be executed if the termination expression is immediately false.
The loop terminates when the termination expression evaluates to false.

### *increment/decrement of looping variable*
The increment expression is invoked after each iteration of the loop.


### Syntax
```java
while(condition){

----body statements----

};
```
# Do while loops

The Java do-while loop is used to iterate a part of the program repeatedly, until the specified condition is true. If the number of iteration is not fixed and you must have to execute the loop at least once, it is recommended to use a do-while loop.

Java do-while loop is called an exit control loop because condition is specified at the end of the loop.

### Syntax
```java
do{

----body statements----

}while(condition);
```

## Example
```java
/**********************************While loop-Section**********************************/

// class name (While)
class While {

    // Static method contains example code.
    public static void run() {
            int i=1;            // initialization expression
            while(i<=3)                 // while starts(conditional expression in the brackets)
            {
                System.out.println("HI");   // prints 'HI' three times since i iterates from 1 to 3
                i=i+1;              //increment of looping variable
            }       
            
    }
}

// class name (DoWhile)
class DoWhile {

    // Static method contains example code.
    public static void run() {
            int i=1;                // initialization expression
             do               // dowhile starts
            {
                System.out.println("HI");   // prints 'HI' three times since i iterates from 1 to 3
                i=i+1;              //increment of looping variable
            }while(i<=3);               // conditional expression in the brackets
            
    }
}
```
