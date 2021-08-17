# Memory Allocation in Java.
  
  
## Memory Allocation
The memory needed by a process or thread is being allocated in main memory is known as
memory allocation. Java Virtual Machine has 2 types of memories Stack Memory and
Heap Space.
  
  
## Stack Memory
Stack memory is used for static memory and thread execution. It contains method specific
values and references of objects in heap. It works on the principle of FIFO (Fist In 
First Out). Whenever a method is invoked, a new block of memory get allocated in stack
memory, it holds local primitive values and reference of other objects. After the method
ends, the block of memory is released for another process.
  
### Characteristics of Stack Memory
- It grows and shrinks as new methods are called and returned respectively.
- Variables of the method is only live in stack until it get finished.
- It gets auto-allocation and deallocation on a method execution.
- If the memory is full, JVM throws `java.lang.StackOverFlowError`.
- Accessing memory is faster than heap.
- The memory is thread safe as each thread operates in its own Stack.
  
### Methods in Stack Class
- **Object push(Object element):** Pushes given element onto the stack.
- **Object pop():** Removes and return the top element in the stack. If stack
is empty it throws `EmptyStackException`.
- **Object peek():** Returns the top element in the stack, without removing.
- **Boolean empty():** Returns `true` if stack is empty, else it gives `false`.
- **int search(Object element):** Searches given element inside stack and gives
the position of that element inside stack. If element not found it gives `-1`.
  
  
## Heap Space
This memory used to allocate memory for objects in runtime. It is mainly used in
runtime of a program. The discrete function like Garbage Collection, keeps
flushing the memory used by previous objects that hold no reference. The memory
allocated for objects can accessible across all programs.
  
### Characteristics of Heap Space
- Heap space accessed via complex memory allocation techniques that includes
Young Generation, Old or Tenured Generation and Permanent Generation.
- If heap space becomes full, java throws `java.lang.OutOfMemoryError`.
- Access in heap space comparatively slower than Stack Memory access.
- It needs Garbage Collector functions to deallocate memory of unused objects
and keep the efficiency of memory usage.
- It is not thread safe and needs to be guarded by properly synchronizing
the code.
  
  
## Stack vs Heap
|                      Stack                      |                    Heap                     |
| :---------------------------------------------: | :-----------------------------------------: |
| Memory allocation happens in contiguous manner. | Memory allocation happens in random manner. |
|    Memory managed automatically by compiler.    |   Memory managed manually by programmer.    |
|                 Access is fast.                 |               Access is slow.               |
|                 Hard to resize.                 |               Easy to resize.               |
|             Access only by threads.             |         Access across applications.         |
|              Memory based on FIFO.              |        Memory based on Generations.         |
|            Static memory allocation.            |         Dynamic memory allocation.          |
  
  
## Example
```java
// Class Fruit contains attributes and a method.
class Fruit {

    // While creating object for this class it acquire its
    // memory for attributes and methods in its own Stack memory.

    // Creating attributes.
    String color = "Red";
    int weight = 2;

    // method toString() gives color and weight.
    public String toString() {
        return "Color: " + this.color + ", Weight: " + 2;
    }
}

// Main class MemoryAllocation.
public class MemoryAllocation {

    // main() method contains the driver code.
    public static void main(String[] args) {
        
        // Here we're creating object for Fruit class.
        // The object created and stored in Heap memory while
        // their attributes, methods are stored in Stack memory.
        
        // Creating object for fruit.
        System.out.println("Creating object for Fruit...");
        Fruit apple = new Fruit();

        // Printing apple object.
        System.out.println("Object Apple: " + apple.toString());
    }
}
```
> *You can find the above code on [MemoryAllocation.java](MemoryAllocation.java).*
  
  
## Output
```
Creating object for Fruit...
Object Apple: Color: Red, Weight: 2
```
  
  
## Author
[NanthaKumar](https://github.com/nknantha "NanthaKumar's Profile")
