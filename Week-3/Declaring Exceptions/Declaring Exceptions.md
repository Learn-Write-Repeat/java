# Declaring Exceptions
> An exception (or exceptional event) is a problem that arises during the execution of a program. When an Exception occurs the normal flow of the program is disrupted and the program/Application terminates abnormally, which is not recommended, therefore, these exceptions are to be handled.
> An exception can occur for many different reasons. Following are some scenarios where an exception occurs.
* A user has entered an invalid data.
* A file that needs to be opened cannot be found.
* A network connection has been lost in the middle of communications or the JVM has run out of memory.
#### How JVM handle an Exception?
* The run-time system searches the call stack to find the method that contains block of code that can handle the occurred exception. The block of the code is called Exception handler.
* The run-time system starts searching from the method in which exception occurred, proceeds through call stack in the reverse order in which methods were called.
* If it finds  appropriate handler then it passes the occurred exception to it. Appropriate handler means the type of the exception object thrown matches the type of the exception object it can handle.
* If run-time system searches all the methods on call stack and couldn’t have found the appropriate handler then run-time system handover the Exception Object to default exception handler , which is part of run-time system. This handler prints the exception information in the following format and terminates program abnormally.
### Types of exceptions
> Java defines several types of exceptions that relate to its various class libraries. Java also allows users to define their own exceptions. 
![](https://media.geeksforgeeks.org/wp-content/cdn-uploads/Exceptions-in-Java.png)
#### Built-in Exceptions

>Built-in exceptions are the exceptions which are available in Java libraries. These exceptions are suitable to explain certain error situations. Below is the list of important built-in exceptions in Java. 

`ArithmeticException`</br> 
> It is thrown when an exceptional condition has occurred in an arithmetic operation.

`ArrayIndexOutOfBoundsException`</br>
> It is thrown to indicate that an array has been accessed with an illegal index. The index is either negative or greater than or equal to the size of the array.


`ClassNotFoundException` </br>
> This Exception is raised when we try to access a class whose definition is not found

`FileNotFoundException` </br>
> This Exception is raised when a file is not accessible or does not open.

`IOException` </br>
> It is thrown when an input-output operation failed or interrupted

`InterruptedException` </br>
> It is thrown when a thread is waiting, sleeping, or doing some processing, and it is interrupted.

`NoSuchFieldException` </br>
> It is thrown when a class does not contain the field (or variable) specified

`NoSuchMethodException`</br>
> It is thrown when accessing a method which is not found.

`NullPointerException `</br>
> This exception is raised when referring to the members of a null object. Null represents nothing

`NumberFormatException `</br>
> This exception is raised when a method could not convert a string into a numeric format.

`RuntimeException `</br>
> This represents any exception which occurs during runtime.

`StringIndexOutOfBoundsException `</br>
> It is thrown by String class methods to indicate that an index is either negative or greater than the size of the string
#### Example of Exceptions Declartion
```
//Java program to demonstrate FileNotFoundException
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
class File_notFound_Demo {

	public static void main(String args[]) {
		try {

			// Following file does not exist
			File file = new File("E://file.txt");

			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
		System.out.println("File does not exist");
		}
	}
}

```
