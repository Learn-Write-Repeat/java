# Array of Object References


## Array
- Array is a data structure.
- It is a collection of items stored in contiguous memory locations.
- It is used to store multiple items of the same data type together.


## Object
- An object is an instance of a class.
- It contains state and behavior.
- It is also known as a real-world entity.


## Array of Objects
The Array of Objects the name itself suggests that it stores an array of objects.
Like in traditional array we store integers, floats, boolean, etc. here we store objects 
in an array. Storing objects means that we're storing their references.


## Creation of Array of Objects
We can use the object class(Base class) in Java to create Array of Objects. 
Object class in java is the root of all classes.

### Syntax
```java
ClassName[] ObjectArrayName;
```
OR
```java
ClassName ObjectArrayName[];
```
***Explanation:***  
**ClassName:** the class of which objects going to be stored.  
**ObjectArrayName:** the name for your object array.


## Instantiating Object Array
We're instantiating array with new keyword along with array size.

### Syntax
```java
ClassName[] ObjectArrayName = new ClassName[size];
```
***Explanation:***  
**size:** the count of the objects we store in array.


## Initializing Objects Array
After instantiating, We need to initialize them with its values.
For that, first we have to create each object then we store the 
reference of those in array.

### Syntax of Object Creation
```java
ClassName ObjectName = new ClassName();
```


## Example
```java
// Example class for demonstrating array of objects.
// It contains attributes firstName and lastName.
class Person {

    // Creating attributes.
    public String firstName, lastName;

    // Person class constructor
    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Overriding toString() method for object representation.
    @Override
    public String toString() {
        // It represent firstName and lastName of this object.
        return "FirstName: " + this.firstName + ", LastName: " + this.lastName;
    }
}

// Public class that contains main method.
public class ArrayOfObjects {

    // Main method for run this program.
    public static void main(String[] args) {
        // First, we're declaring array for objects.
        Person[] personArray;

        // Second, we instantiate it.
        personArray = new Person[3];

        // Third, we creating object and storing it in array.
        personArray[0] = new Person("Nikola", "Tesla");
        personArray[1] = new Person("Albert", "Einstein");
        personArray[2] = new Person("Isaac", "Newton");

        // Finally we're printing the stored element.
        for(Person person: personArray) {
            System.out.println(person);
        }
    }
}
```
> Note: I also added [ArrayOfObjects.java](ArrayOfObjects.java) file which contains above code.


## Output
```
FirstName: Nikola, LastName: Tesla
FirstName: Albert, LastName: Einstein
FirstName: Isaac, LastName: Newton
```


## Author
[NanthaKumar](https://github.com/nknantha "Nanthakumar's Profile")
