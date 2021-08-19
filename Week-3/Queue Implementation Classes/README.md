# Queue Implementation Classes
  
  
## Queue
Queue is an abstract data type, and it is a linear data structure. It works on the 
principle FIFO (First In First Out). In Java, `java.util` package contains the interface
of Queue.  
The Queue implementations are grouped into general-purpose and concurrent implementations.
  

## General-Purpose Queue Implementations
- `LinkedList` implements the `Queue` interface, providing first in, first out (FIFO)
queue operations for `add`, `poll`, and so on.
- `PriorityQueue` class is a priority queue based on the heap data structure. This queue
orders elements according to the order specified at construction time, which can be the
elements natural ordering or the ordering imposed by an explicit `Comparator`.
  
  
## Concurrent Queue Implementations
The `java.util.concurrent` package contains a set of synchronized Queue interfaces and
classes.  
`BlockingQueue` extends Queue with operations that wait for the queue to become nonempty
when retrieving an element and for space to become available in the queue when storing an
element. This interface is implemented by the following classes:
- `LinkedBlockingQueue` \- an optionally bounded FIFO blocking queue backed by linked nodes.
- `ArrayBlockingQueue` \- a bounded FIFO blocking queue backed by an array.
- `PriorityBlockingQueue` \- an unbounded blocking priority queue backed by a heap.
- `DelayQueue` \- a time-based scheduling queue backed by a heap.
- `SynchronousQueue` \- a simple rendezvous mechanism that uses the `BlockingQueue` interface.
  

## Methods in Queue Interface
| Methods | Description |
|---|---|
| `add(element)` | Adds the given element at the end of the queue. |
| `isEmpty()` | Gives `true` when queue is empty, otherwise `false`. |
| `peek()` | Returns the top element in the Queue without removing. |
| `poll()` | Removes top given element in the queue. Returns `null` if queue is empty. |
| `remove()` | Removes the top element in the queue. Throws `NoSuchElementException` when the queue is empty. |
| `size()` | Returns the size of the queue. |
  
  
## Example
Here we can see `LinkedList` implementation,
```java
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
```
> *Note: For compile & run use file [QueueExample.java](QueueExample.java).*
  
  
## Output
```
Queue: [1, 2, 3, 4, 5, 6, 7]
Peek Element: 1
Size: 7, Empty: false
Removing Elements:
Removed: 1
Removed: 2
Removed: 3
Removed: 4
Removed: 5
Removed: 6
Removed: 7
Queue: []
Size: 0, Empty: true
```
  
  
**Reference:**  
https://docs.oracle.com/javase/tutorial/collections/implementations/queue.html
## Author
[NanthaKumar](https://github.com/nknantha "NanthaKumar's Profile")
