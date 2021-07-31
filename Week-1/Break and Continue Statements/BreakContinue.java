/**
 * This is the example file for demonstrating break and continue
 * statements.
 * It contains ...
 * 
 * @author nknantha <https://github.com/nknantha>
 * @date 2021/07/30
 */


/**********************************Break-Section**********************************/

// default class for break example.
class BreakExample {

    // Static method contains example code.
    public static void run() {
        // Iterating from 1 to 5.
        for (int i = 1; i < 6; ++i) {

            // Printing the iteration count.
            System.out.println("Iteration: " + i);

            // If iteration reaches 3 then we break the loop.
            if (i == 3) {
                System.out.println("Executing break on iteation " + i + "...");
                break;
            }
        }
    }
}

// defalut class for Labelled Break example.
class LabelledBreakExample {

    // Static method contains example code.
    public static void run() {
        // Creating first layer of code.
        label1:
            // Iterating from 1 to 3.
            for (int i = 1; i < 4; ++i) {

                // Creating second layer of code.
                label2:
                    // Iterating from 1 to 3.
                    for (int j = 1; j < 4; ++j) {
                        
                        // Printing second layer iteration count.
                        System.out.println("OuterLoop: " + i +", InnerLoop: " + j);

                        // break the label1 if j == 3
                        if (j == 3) {
                            System.out.println("Breaking OuterLoop...");
                            break label1;
                        }
                    }
            }
    }
} 


/********************************Continue-Section*********************************/

// default class for continue example.
class ContinueExample {

    // Static run() method contains continue example code.
    public static void run() {
        // Iterating from 1 to 5
        for (int i = 1; i < 6; ++i) {
            
            // If iteration reached 2 we trigger continue.
            if (i == 2) {
                System.out.println("Executing continue...");
                continue;
            }

            // Printing iteration count.
            System.out.println("Iteration: " + i);
        }
    }
}

// default class for labelled continue example.
class LabelledContinueExample {

    // Static run() method contains example code.
    public static void run() {
        // First layer of code.
        label1:
            // Iterating from 1 to 3.
            for (int i = 1; i < 4; ++i) {

                // Second layer of code.
                label2:
                // Iterating from 1 to 3.
                for (int j = 1; j < 4; ++j) {

                    // Executing continue if j == 2.
                    if (j == 2) {
                        System.out.println("Executing continue to OuterLoop...");
                        continue label1;
                    }

                    // Printing iteration count.
                    System.out.println("OuterLoop: " + i + ", InnerLoop: " + j);
                }
            }
    }
}


/***********************************DRIVER-CODE***********************************/

// Public class containing the DRIVER-CODE.
public class BreakContinue {
   
    // main() method for execution entry.
    public static void main(String[] args) {
        
        // First executing BreakExample.
        System.out.println("BreakExample:");
        BreakExample.run();

        // Second executing LabelledBreakExample.
        System.out.println("\nLabelledBreakExample:");
        LabelledBreakExample.run();

        // Third executing ContinueExample.
        System.out.println("\nContinueExample:");
        ContinueExample.run();

        // Finally executing LabelledContinueExample.
        System.out.println("\nLablledContinueExample:");
        LabelledContinueExample.run();
    }
}

/**
 * Output:
 * BreakExample:
 * Iteration: 1
 * Iteration: 2
 * Iteration: 3
 * Executing break on iteation 3...
 * 
 * LabelledBreakExample:
 * OuterLoop: 1, InnerLoop: 1
 * OuterLoop: 1, InnerLoop: 2
 * OuterLoop: 1, InnerLoop: 3
 * Breaking OuterLoop...     
 * 
 * ContinueExample:
 * Iteration: 1
 * Executing continue...  
 * Iteration: 3
 * Iteration: 4
 * Iteration: 5
 * 
 * LablledContinueExample:
 * OuterLoop: 1, InnerLoop: 1
 * Executing continue to OuterLoop...
 * OuterLoop: 2, InnerLoop: 1        
 * Executing continue to OuterLoop...
 * OuterLoop: 3, InnerLoop: 1        
 * Executing continue to OuterLoop...
 * 
 */
