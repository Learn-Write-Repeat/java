# List Interface
The List interface provides a way to store the ordered collection. It is a child interface of Collection. It is an ordered collection of objects in which duplicate values can be stored. Since List preserves the insertion order, it allows positional access and insertion of elements. 
##### Declaration: The List interface is declared as:

```
public abstract interface List extends Collection ; 
```
```
Note: Obj is the type of the object to be stored in List
```
### Example:

```
// Java program to Demonstrate List Interface
 
// Importing alll utility classes
import java.util.*;
 
// Main class
// ListDemo class
class ListDemo {
 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Creating an object of List class
        List<Integer> l1 = new ArrayList<Integer>();
 
        // Adding elements to object of Lsit class
        // Custom inputs
 
        l1.add(0, 1);
        l1.add(1, 2);
 
        // Print the elemnets inside the object
        System.out.println(l1);
 
        // Now creating another List class object
        // Declaring object of integer type
        List<Integer> l2 = new ArrayList<Integer>();
 
        // Again adding elements to object of Lsit class
        // Custom inputs
        l2.add(1);
        l2.add(2);
        l2.add(3);
 
        // Will add list l2 from 1 index
        l1.addAll(1, l2);
 
        System.out.println(l1);
 
        // Removes element from index 1
        l1.remove(1);
 
        // Printing the updated List 1
        System.out.println(l1);
 
        // Prints element at index 3 in list 1
        // using get() method
        System.out.println(l1.get(3));
 
        // Replace 0th element with 5
        // in List 1
        l1.set(0, 5);
 
        // Again printing the updated List 1
        System.out.println(l1);
    }
}
```
*Output* :
```
[1, 2]
[1, 1, 2, 3, 2]
[1, 2, 3, 2]
2
[5, 2, 3, 2]
```
### Operations in a List interface:
List is an interface, it can be used only with a class that implements this interface. Some of the importent operations are as given below :

1. Adding elements to List class using add() method
2. Updating elements in List class using set() method
3. Removing elements using remove() method
`Adding elements to List class using add() method`
> In order to add an element to the list, we can use the add() method. This method is overloaded to perform multiple operations based on different parameters.
####    *Parameters:  It takes 2 parameters namely as follows:*

add(Object): This method is used to add an element at the end of the List.</br>
add(int index, Object): This method is used to add an element at a specific index in the List

Example:
```
// Java Program to Add Elements to a List

// Importing all utility classes
import java.util.*;

// Main class
class demo {

	// Main driver method
	public static void main(String args[])
	{
		// Creating an object of List class
		List<String> al = new ArrayList<>();

		// Adding elements to object of List class
		// Custom elements
		al.add("D");
		al.add("P21");
		al.add(1, "C");

		// Print all the elements inside the List class
		// object
		System.out.println(al);
	}
}
```
*Output*:</br>
```
[D, C, P21]
```
### Updating elements:

After adding the elements, if we wish to change the element, it can be done using the set() method. Since List is indexed, the element which we wish to change is referenced by the index of the element. Therefore, this method takes an index and the updated element which needs to be inserted at that index.

Example:
```
import java.util.*;

class DEMO {

	// Main driver method
	public static void main(String args[])
	{
		// Creating an object of List class
		List<String> al = new ArrayList<>();

		// Adding elements to object of List class
		al.add("D");
		al.add("C");
		al.add(2, "21");

		// Display theinitial elements in List
		System.out.println("Initial ArrayList " + al);

		// Setting (updating) element at 1st index
		// using set() method
		al.set(1, "CP");

		// Print and display the updated List
		System.out.println("Updated ArrayList " + al);
	}
}
```
*Output*:</br>
```
Initial ArrayList [D, C, 21]
Updated ArrayList [D, CP, 21]
```
### Removing Elements:
In order to remove an element from a List, we can use the remove() method. This method is overloaded to perform multiple operations based on different parameters.</BR> 
1. remove(Object): This method is used to simply remove an object from the List. If there are multiple such objects, then the first occurrence of the object is removed.</BR>
2. remove(int index): Since a List is indexed, this method takes an integer value which simply removes the element present at that specific index in the List. After removing the element, all the elements are moved to the left to fill the space and the indices of the objects are updated.
```
// Java Program to Remove Elements from a List

// Importing List and ArrayList classes
// from java.util package
import java.util.ArrayList;
import java.util.List;

// Main class
class DEMO {

	// Main driver method
	public static void main(String args[])
	{

		// Creating List class object
		List<String> al = new ArrayList<>();

		// Addding elements to the object
		// Custom inputs
		al.add("DCP");
		al.add("20");
        al.add("21");

		

		// Print the initialArrayList
		System.out.println("Initial ArrayList " + al);

		// Now remove element from the above list
		// present at 1st index
		al.remove(1);

		// Print the List after removal of element
		System.out.println("After the Index Removal " + al);

		// Now remove the current object from the updated
		// List
		al.remove("21");

		// Finally print the updated List now
		System.out.println("After the Object Removal "
						+ al);
	}
}
```
*Output*:</br>
```
Initial ArrayList [DCP, 20, 21]
After the Index Removal [DCP, 21]
After the Object Removal [DCP]
```
### Iterating over List:
Methods: There are multiple ways to iterate through the List. The most famous ways are by using the basic for loop in combination with a get() method to get the element at a specific index and the advanced for loop. 

Example 

```
// Java program to iterate the elements
// in an ArrayList

import java.util.*;


public class Demo {

	public static void main(String args[])
	{
		List<String> al
			= new ArrayList<>();

		al.add("DCP");
		al.add("21");

		// Using the Get method and the
		// for loop
		for (int i = 0; i < al.size(); i++) {

			System.out.print(al.get(i) + " ");
		}

		System.out.println();

		// Using the for each loop
		for (String str : al)
			System.out.print(str + " ");
	}
}
```
*Output*:</br>
```
DCP 21 
DCP 21 
```

