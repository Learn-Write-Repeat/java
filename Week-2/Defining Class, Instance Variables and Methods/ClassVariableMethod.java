/**
 * This file contains the example of Class, Instance Variables and Methods.
 * It contains a example class Student and main class ClassVariableMethod.
 * 
 * @author nknantha <https://github.com/nknantha>
 * @date 2021/08/09
 */

// Default class Student contains example attributes and methods.
class Student {
    
    // Defining private student name instance variable.
    private String name;

    // A method to get student name.
    public String getName() {
        return this.name;
    }

    // A method to set student name. Takes a parameter name to get assigned.
    public void setName(String name) {
        this.name = name;
    }
}

// Public class ClassVariableMethod for example demonstration.
public class ClassVariableMethod {

    // Public main() contains example code.
    public static void main(String[] args) {

        // Creating object for student class.
        Student Obj = new Student();

        // Checking initial name of Obj.
        System.out.println("Initially, name is " + Obj.getName());

        // Changing name to Steve.
        // Obj.name = "Steve"; // this creates error because of private modifier.
        Obj.setName("Steve");

        // After changing name accessing name of Obj.
        System.out.println("After name change, name is " + Obj.getName());
    }
}

/**
 * Output:
 * Initially, name is null
 * After name change, name is Steve
 * 
 */
