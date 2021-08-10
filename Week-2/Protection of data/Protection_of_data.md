# Protection of data

Classes, variables, methods, and constructors can be given different levels of access using Java's various access modifiers for **protection of data**.

- ### **Each of the four levels of access is described below.**
    - This is the default visibility setting for a given package. There is no need for modifiers.
    - Only class members can see this (private).
    - Everyone can see you (public).
    - The package and all its subclasses can see this information (protected).
- ### **Default Access Modifier - No Keyword**

    > We do not declare an access modifier explicitly for a class, field, method, etc. This is known as a default access modifier. Unprotected variables and methods are available to any other class in the same package. In an interface, the fields and methods are implicitly public static final. Modifierless variables and methods can be declared, as shown in the examples below.

    ```java
    String DevIncept= "contribution";
    int DevIncept()
    {
       return 0;
    }
    ```

- ### **Private Access Modifier - Private**

    > It is only possible to access methods, variables and constructors that are declared private from within the class that they are part of. As the most restrictive access level, the Private Access Modifier (PAM) is enabled. It is impossible for classes and interfaces to be private. Public getter methods in a class allow access to private variables. The private modifier is the primary means by which an object isolates itself from the outside world and hides data.

    ```java
    public class DevIncept
    {
    	private String s;
    	public String OpenSource()
    	{
    		return this.s;
    	}
    	public void Contributions(String s)
    	{
    		this.s = s;
    	}
    }
    ```

    > This class's format variable is private, so other classes cannot directly access or modify its value. For this reason, we defined two public methods: *OpenSource()* and *Contributions(String)*.

- ### **Public Access Modifier - Public**

    > Any class can access a public class, method, function Object(), interface, etc. Any class in the Java universe can access fields, methods, and blocks declared in public classes. As long as our public class is not in the same package as our private class, it still needs to be imported. By virtue of class inheritance, subclasses inherit all public methods and variables from their parent class. Publicity is required for the *main()* method in an application. As a result, the class could not be run by a Java interpreter.

    ```java
    public static void main(String[] arguments)
    {
       // ...
    }
    ```

- ### **Protected Access Modifier - Protected**

    > The protected members of a superclass can only be accessed by subclasses of the superclass or by classes within the superclass' package. On classes and interfaces, the protected access modifier cannot be applied. Methods and fields in an interface, however, cannot be declared protected. In contrast, protected access prevents non-related classes from trying to access the helper method or variable.

    ```java
    class DevIncept
    {
    	protected boolean Suvra(Speaker DI)
    	{
          // code block
      }
    }
    class Contributions extends DevIncept
    {
      boolean Shaw(Speaker DI)
    	{
          // code block
      }
    }
    ```

    > *DevIncept* is the only class that can access the *Suvra()* method if it is declared private. As soon as we define it as public, it will be available to the entire outside world for use. As a result of using the protected modifier, this method will only be available to its subclass.

- ### **When it comes to inheritance, the following rules are enforced:**
    - Private methods are not inherited at all, so there is no rule for them.
    - Methods declared public in a superclass must also be declared public in all subclasses.
    - Methods declared protected in a superclass must be public or protected in subclasses; they cannot be private
