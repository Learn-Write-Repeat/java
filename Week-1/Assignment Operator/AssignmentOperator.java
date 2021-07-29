/**
 * @title Assignment Operator
 * @desc It's an example program for Assignment Operator.
 * @author nknantha <https://github.com/nknantha>
 * @date 2021/07/29 
 */

// Public class contains main method.
public class AssignmentOperator {
    
    // main() method to run this program.
    public static void main(String[] args) {
        
        // Declaring 2 integer variables and initializing with 1 and 10
        // using simple assignment operator.
        int a = 1;
        int b = 10;

        // Then we incrementing variable "a" and decrementing variable "b"
        // with compound assignement operators.
        a += 1;
        b -= 5;

        // Finally we're printing the values stored in both variables.
        System.out.println("After simple assignment and compound assignment,");
        System.out.println("Variable a contains: " + a + "\nVariable b contains: " + b);
    }
}

/**
 * Output:
 * After simple assignment and compound assignment,
 * Variable a contains: 2
 * Variable b contains: 5
 * 
 */
