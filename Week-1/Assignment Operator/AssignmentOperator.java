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
        
        // Declaring integer variable and initializing 10
        // using simple assignment operator.
        int Value = 1;
        System.out.println("Initially, Value = " + Value);

        // Compound additional assignment operator.
        Value += 10;
        System.out.println("Adding 10, Value = " + Value);

        // Compound subtraction assignment operator.
        Value -= 8;
        System.out.println("Subracting 8, Value = " + Value);

        // Compound multiplication assignment operator.
        Value *= 8;
        System.out.println("Multiplying 8, Value = " + Value);

        // Compound division assignment operator.
        Value /= 4;
        System.out.println("Dividing 4, Value = " + Value);

        // Compound Modulo Assignment operator.
        Value %= 99;
        System.out.println("Modulo with 99, Value = " + Value);

        // Compound bitwise AND Assignment operator.
        Value &= 7;
        System.out.println("Bitwise AND with 7, Value = " + Value);

        // Compound bitwise OR Assignment operator.
        Value |= 13;
        System.out.println("Bitwise OR with 13, Value = " + Value);

        // Compound bitwise XOR Assignment operator.
        Value ^= 17;
        System.out.println("Bitwise XOR with 17, Value = " + Value);

        // Changing value to 2021 for easy understanding of left and right shift.
        Value = 2021;

        // Compound left shift assignment operator.
        Value <<= 2;
        System.out.println("Left shit with 2, Value = " + Value);

        // Compound right shift assignment operator.
        Value >>= 2;
        System.out.println("Right shift with 2, Value = " + Value);

        // Compound right shift assignment (Unsigned) operator.
        Value >>>= 2;
        System.out.println("Right shift (unsigned) with 2, Value = " + Value);
    }
}

/**
 * Output:
 * Initially, Value = 1
 * Adding 10, Value = 11
 * Subracting 8, Value = 3
 * Multiplying 8, Value = 24
 * Dividing 4, Value = 6
 * Modulo with 99, Value = 6
 * Bitwise AND with 7, Value = 6
 * Bitwise OR with 13, Value = 15
 * Bitwise XOR with 17, Value = 30
 * Left shit with 2, Value = 8084
 * Right shift with 2, Value = 2021
 * Right shift (unsigned) with 2, Value = 505
 * 
 */
