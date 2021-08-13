/**
 * This file is the example of method overloading and overriding.
 * It contains the Animal and Dog classes that is used here for 
 * demonstrating Overloading. And main class have methods sum()
 * that is used for demonstrating Overriding.
 * 
 * @author NanthaKumar <https://github.com/nknantha>
 * @date 2021/08/10
 */

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

/**
 * Output:
 * From Dog: Bow Bow...
 * From Animal: Base Animal Sound...
 * Integer Addition, 5 + 4 : 9      
 * Float Addition, 5.0 + 4.0 : 9.0  
 */
