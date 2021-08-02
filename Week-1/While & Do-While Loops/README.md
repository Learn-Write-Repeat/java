# While loops

The Java while loop is used to iterate a part of the program repeatedly until the specified Boolean condition is true. As soon as the Boolean condition becomes false, the loop automatically stops.

Java while loop is called an entry control loop because condition is specified at the start itself.


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
            int i=1;
            while(i<=3)                 // while starts
            {
                System.out.println("HI");     // prints 'HI' three times since i iterates from 1 to 3
            }
            
    }
}

// class name (DoWhile)
class DoWhile {

    // Static method contains example code.
    public static void run() {
            int i=1;
             do               // dowhile starts
            {
                System.out.println("HI");     // prints 'HI' three times since i iterates from 1 to 3
            }while(i<=3);               // condition
            
    }
}
```
