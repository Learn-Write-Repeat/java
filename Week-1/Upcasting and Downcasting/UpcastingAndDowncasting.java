/**
 * This file contains example for Upcasting and Downcasting.
 * It contains a Parent class, Child class and a main class.
 * It demonstrate Upcasting and Downcasting.
 * 
 * @author nknantha <https://github.com/nknantha>
 * @date 2021/07/30
 */

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

/**
 * Output:
 * Parent
 * Child Method
 * Child Method
 * 
 */
