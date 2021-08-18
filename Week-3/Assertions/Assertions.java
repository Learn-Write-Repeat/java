/**
 * This file contains the example for assertion in Java.
 * 
 * @author NanthaKumar <https://github.com/nknantha>
 * @date 2021/08/18
 */

// Main class contains main method.
public class Assertions {
    
    // method to check minimum.
    public static void checkMinimum(int num) {
        assert num > 21: "Value under minimum";
        System.out.println("Given Value: " + num);
    }

    // main() method contains example.
    public static void main(String[] args) {
        
        // Invoking assertion.
        checkMinimum(7);

        // Value > 21
        checkMinimum(25);
    }
}

/**
 * Output:
 * 
 */
