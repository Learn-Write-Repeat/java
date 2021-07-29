/**
 * It's a example program for Array of Objects.
 * 
 * Contains:
 * - class Person: example class for demonstration.
 * - Public class ArrayOfObjects: main class for running the program.
 * 
 * @author nknantha <https://github.com/nknantha>
 * @date 2021/07/29 
 */

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

/**
 * Output:
 * FirstName: Nikola, LastName: Tesla
 * FirstName: Albert, LastName: Einstein
 * FirstName: Isaac, LastName: Newton
 * 
 */