# Keywords in Exception API: try, catch, finally, throw, throws
### Exceptions
> In Java, an exception is an event that disrupts the normal flow of the program. It is an object which is thrown at runtime.
### What is Exception Handling?
> Exception Handling is a mechanism to handle runtime errors such as ClassNotFoundException, IOException, SQLException, RemoteException, etc.
### Java Exception Keywords
> The following table describes the keywords used in `Exception Handling`:

|Keyword|Description|
|-------|-----------|
| try | The `try` keyword is used to specify a block where we should place an exception code. It means we can't use try block alone. The try block must be followed by either catch or finally.|
| catch | The `catch` block is used to handle the exception. It must be preceded by try block which means we can't use catch block alone. It can be followed by finally block later.|
| finally | The `finally` block is used to execute the necessary code of the program. It is executed whether an exception is handled or not. |
| throw | The `throw` keyword is used to throw an exception. |
| throws | The `throws` keyword is used to declare exceptions. It specifies that there may occur an exception in the method. It doesn't throw an exception. It is always used with method signature. |

#### Difference between throw and throws

| throw | throws |
| ------|--------|
|throw keyword is used to throw an exception explicitly.| throws keyword is used to declare an exception possible during its execution.|
| throw keyword is followed by an instance of Throwable class or one of its sub-classes.|throws keyword is followed by one or more Exception class names separated by commas.|
| throw keyword is declared inside a method body.| throws keyword is used with method signature (method declaration). |
| We cannot throw multiple exceptions using throw keyword.| We can declare multiple exceptions (separated by commas) using throws keyword. |

### Example throw Exception
```
class Test
{
  static void avg()
  {
    try
    {
      throw new ArithmeticException("demo");
    }
    catch(ArithmeticException e)
    {
      System.out.println("Exception caught");
    }
 }

 public static void main(String args[])
 {
    avg();
 }
}  
```
### Example throws Keyword

```
class Test
{
  static void check() throws ArithmeticException
  {  
    System.out.println("Inside check function");
    throw new ArithmeticException("demo");
  }

  public static void main(String args[])
  {
    try
    {
      check();
    }
    catch(ArithmeticException e)
    {
      System.out.println("caught" + e);
    }
  }
}
```
### Example finally Block With try , catch
```
class Demo
{
  public static void main(String[] args)
  {
    int a[] = new int[2];
    try
    {
      System.out.println("Access invalid element"+ a[3]);
      /* the above statement will throw ArrayIndexOutOfBoundException */
    }
    catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("Exception caught");
    }
    finally
    {
      System.out.println("finally is always executed.");
    }
  }
}
```





