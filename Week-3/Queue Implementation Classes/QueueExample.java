/**
 * This file contains the example for Queue.
 * It uses LinkedList and Queue classes.
 * 
 * @author NanthaKumar <https://github.com/nknantha>
 * @date 2021/08/18
 */

// Importing Queue and LinkedList.
import java.util.Queue;
import java.util.LinkedList;

// Main class contains the main method.
public class QueueExample {
    
    // main() method contains the example.
    public static void main(String[] args) {
        
        // Creating Queue with List.
        Queue<Integer> q = new LinkedList<>();

        // Adding elements in queue.
        for (int i = 1; i < 8; ++i) {
            q.add(i);
        }

        // Printing queue.
        System.out.println("Queue: " + q.toString());

        // Printing Peek element.
        System.out.println("Peek Element: " + q.peek());

        // Printing the size and empty.
        System.out.println("Size: " + q.size() + ", Empty: " + q.isEmpty());

        // Removing elements and printing it.
        System.out.println("Removing Elements: ");
        while (q.size() > 0) {
            System.out.println("Removed: " + q.poll());
        }

        // Printing queue.
        System.out.println("Queue: " + q.toString());

        // Printing the size and empty.
        System.out.println("Size: " + q.size() + ", Empty: " + q.isEmpty());
    }
}

/**
 * Output:
 * Queue: [1, 2, 3, 4, 5, 6, 7]
 * Peek Element: 1
 * Size: 7, Empty: false
 * Removing Elements:
 * Removed: 1
 * Removed: 2
 * Removed: 3
 * Removed: 4
 * Removed: 5
 * Removed: 6
 * Removed: 7
 * Queue: []
 * Size: 0, Empty: true
 */
