# Heap

### In Java, a heap is a chunk of memory which is shared among all threads. In a heap, all class instances and the array is allocated. It is created when JVM starts-up. An automatic storage management system reclaims heap. It may be of fixed and variable size. It does not need to be contiguous.

#### Heap Structure:

![Heap Structure](https://static.javatpoint.com/images/java-heap.png)

### The heap is divided into two parts (or generations):

1) **Young Generation (or Young Space or Nursery):** It is the part of the heap. It is reserved for allocation of objects. When it becomes full, the minor GC collects the garbage from Eden to one of the survivor spaces. Objects that are available for garbage in one of the survivor spaces are cleared, and remaining objects move to the other survivor space. Hence, there is always one empty survivor space. All objects that live long in the young space are transfers to old space. The recent release of Java has a part of the nursery called keep area. It contains the most recently allocated object in the nursery. It does not collect garbage until the next young generation.
* **Eden:** All objects are first created here. It is bigger than the two survivor spaces. It consumes 76% space of the young               generation. When Eden becomes full, a minor GC is triggered.
* **Survivor Spaces:** It is a pool of objects that have survived the garbage collection of the Eden space. There are two                              survivor spaces called survivor from (S0) and survivor to (S1). It avoids memory fragmentation. The                            important point about the survivor is one of the two survivors is always empty.
### All the live objects from the whole young generation (Eden space + Survivor from space) are moved to the Survivor To space. After completion of this process, a survivor from space is empty. The process of copying the live objects between survivor spaces is repeated several times until some objects are considered to have matured and old enough. Such objects can thus move to old space instead of move into other survivor space. To determine whether the object is ready to move into old space, GC counts the total number of collections an object survived. The life of the objects increased if it does not collect.

2) **Old Generation (or Old Space or Tenured):** It contains objects that are lives long. This process is called an old collection. Long-lived objects survived after many rounds of minor GC. When the old space is about to reach its limit, major resources of old memory are cleared. Usually, the garbage collector is performed in the old generation when it reaches its limit. An old generation garbage collector is called a major GC. It takes a too long time to remove the objects.

#### Here a question arises "what happens if an object in the old generation needs to reference an object in the young generation?"

#### To handle this type of cases, JVM manages a table in the old generation called card table. It is a memory chunk of 512 bytes. When an object in the old generation references an object in the young generation, it records in the card table. When minor GC executes for the young generation, GC search for this table only. It determines whether or not it is subject for GC, instead of checking the reference of all the objects in the old generation. Write barrier manage the card table. It is a device that allows faster performance for minor GC.

## Non-heap memory
### It includes a method area shared among all threads. It stores the structure of each class. It may be of fixed or variable size. It does not need to be contiguous.

### **Permanent Generation (PermGen)**
### JVM generates it at runtime. It contains the application metadata required by JVM. Metadata includes the classes and methods used in the application. It also includes the Java SE library classes and methods.
### Metaspace replaced it in Java 8. It means java.lang.OutOfMemoryError does not occur in Java 8. Two new flag introduced in metaspace they are: -XXMetasapceSize and ?XXMaxMetaspaceSize. The main motive of metaspace is that, as long as the classloader is alive, the metadata remains alive in the metaspace.

### The main difference between PermGen and metaspace is: PermGen is a part of heap while the metaspace is a part of native memory.

![Java & Memory Management](https://static.javatpoint.com/images/java-heap2.png)

### **Code Cache:** It is a memory area separate from the heap. It is used for compilation and storage of native code. It is a fixed size space. If it became full, the JVM would not compile any additional code. To avoid this, you can tune the code cache with the following size options:

* **InitialCodeCacheSize:** Its default size (bytes) is 160K.
* **ReservedCacheSize:** Its default maximum size is 48M.
* **CodeCacheExpansionSize:** Its default size is 32K or 64K.

#### JVM uses a Use Code Cache Flushing option to control the flushing of the code cache area. Its default value is false. Just-in-time (JIT) compiler is the biggest user of the code cache area.

### **Causes of java.lang.OutOfMemoryError**
### The error triggers when the application attempts to add more data into the heap space area, but there is not enough space for it. JVM throws Java heap space error whenever it reaches the heap size limit.

* **Spike in data volumes:** It is a situation when the application attempts to add more data into the heap space, but there is                              not enough space for it.
* **Memory Leaks:** It is a programming error that leads your application to consume more memory continuously. It can occur in                     many ways. It is a condition when objects are no longer used by the application but garbage collector                           unable to recognize it. You can use the memory management tool (like HP jmeter, JProbe, and IBM Tivoli)                         which identifies useless objects and memory leaks.

![Memory Leak](https://static.javatpoint.com/images/java-heap3.png)

#### Example:
```python
public class MemoryLeaksDemo    
{   
public static void main(String[] args)    
{   
int[] arr = new int[999999999];     //allocating memory to array  
System.out.println("OutOfMemoryError");   
}   
}  
```
#### Output:
`Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
at MemoryLeaksDemo.main(MemoryLeaksDemo.java:5)`



```python

```
