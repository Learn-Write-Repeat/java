# Rule for coding Exceptions
### What is an Exception?
> An exception is an unwanted or unexpected event, which occurs during the execution of a program i.e at run time, that disrupts the normal flow of the program’s instructions.
### Error vs Exception

|Key|Error|Exception|
|---|----|-----|
|Type | Classified as an unchecked type | Classified as checked and unchecked |
|Package | It belongs to java.lang.error | It belongs to java.lang.Exception |
|Recoverable/ Irrecoverable| It is irrecoverable | It is recoverable |
|Example | OutOfMemoryError ,IOError | NullPointerException , SqlException |

### Exception Hierarchy
> All exception and errors types are sub classes of class Throwable, which is base class of hierarchy.One branch is headed by Exception. This class is used for exceptional conditions that user programs should catch. NullPointerException is an example of such an exception.Another branch,Error are used by the Java run-time system(JVM) to indicate errors having to do with the run-time environment itself(JRE). StackOverflowError is an example of such an error.

![](https://media.geeksforgeeks.org/wp-content/uploads/Exception-in-java1.png)

### How JVM handle an Exception?
>Default Exception Handling : Whenever inside a method, if an exception has occurred, the method creates an Object known as Exception Object and hands it off to the run-time system(JVM). The exception object contains name and description of the exception, and current state of the program where exception has occurred. Creating the Exception Object and handling it to the run-time system is called throwing an Exception.There might be the list of the methods that had been called to get to the method where exception was occurred. This ordered list of the methods is called `Call Stack`.

### How Programmer handles an exception?
> `Customized Exception Handling` : Program statements that can raise exceptions are contained within a try block. If an exception occurs within the try block, it is thrown. These exceptions can be catched by catch block and handle in some rational manner. System-generated exceptions are automatically thrown by the Java run-time system. To manually throw an exception, throw keyword is used.
> Any exception that is thrown out of a method must be specified as such by a throws clause.

### Rules:
> `Catching multiple exceptions`</br>
> There are as many catch blocks as the number of exceptions which can be thrown from the code
> `The order of catch blocks does matter`</br>
> If the protected code can throw different exceptions which are not in the same inheritance tree, i.e. they don’t have parent-child relationship, the catch blocks can be sorted any order but ` if the exceptions have parent-child relationship, the catch blocks must be sorted by the most specific exceptions first, then by the most general ones`.
> `Catching one exception for all`</br>
> If we catch the most general exception first, then we also catch other exceptions which are subtypes of the general exception. It means if there are two different catch blocks then catching parent exception can handle both the exception together.
> `Grouping multiple exceptions in one catch`</br>
> Since Java 7, we can combine multiple exceptions in a single catch clause.</br>
> Note that we can group only un-related exceptions together. That means it’s illegal to group exceptions which have parent-child relationship.
> Example:

```
public static void doCrypto(int cipherMode, String key, File inputFile,
        File outputFile) throws CryptoException {
    try {
        Key secretKey = new SecretKeySpec(key.getBytes(), “AES”);
        Cipher cipher = Cipher.getInstance(“AES”);
        cipher.init(cipherMode, secretKey);
 
        FileInputStream inputStream = new FileInputStream(inputFile);
        byte[] inputBytes = new byte[(int) inputFile.length()];
        inputStream.read(inputBytes);
 
        byte[] outputBytes = cipher.doFinal(inputBytes);
 
        FileOutputStream outputStream = new FileOutputStream(outputFile);
        outputStream.write(outputBytes);
 
        inputStream.close();
        outputStream.close();
 
    } catch (NoSuchPaddingException | NoSuchAlgorithmException
            | InvalidKeyException | BadPaddingException
            | IllegalBlockSizeException | IOException ex) {
        System.err.println("error");
    }
}

```
> `What should you do in the catch blocks?`</br>
> It’s up to user to write anything inside the catch blocks.the main purpose of the catch blocks is to recover the program from the exceptions and continue execution, such as notifying the user about the error, ask the user to wait, try again or exit, etc.

#### Points to remember :
* In a method, there can be more than one statements that might throw exception, So put all these statements within its own `try` block and provide separate exception handler within own catch block for each of them.
* If an exception occurs within the try block, that exception is handled by the exception handler associated with it. To associate exception handler, we must put catch block after it. There can be more than one exception handlers. Each catch block is a exception handler that handles the exception of the type indicated by its argument. The argument, ExceptionType declares the type of the exception that it can handle and must be the name of the class that inherits from Throwable class.
* For each try block there can be zero or more catch blocks, but only one finally block.
* The finally block is optional.It always gets executed whether an exception occurred in try block or not . If exception occurs, then it will be executed after try and catch blocks. And if exception does not occur then it will be executed after the try block. The finally block in java is used to put important codes such as clean up code e.g. closing the file or closing the connection.

 
