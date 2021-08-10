# **Array Operations in Java**

> Array operations are notoriously difficult for Java developers to implement in a clean, efficient manner. We will have to deal with them on a number of occasions. In order to solve the puzzle quickly, it is helpful to have a 'cheat sheet' – a summary of the most common procedures.

> In a certain sense, array operations are limited. For this reason, we'll be using Java's Arrays class and Apache's ArrayUtils class for most of our operations.

```java
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;
```

- ### What are arrays in Java?

    > An array in Java is an object that contains elements of the same data type. Furthermore, array elements are stored in a contiguous memory location. It is a data structure in which similar elements are stored. A Java array can only hold a fixed number of elements. This int array will be used in all of our examples (unless otherwise specified) so let's declare it and initialize it:

    ```java
    int[] array = new int[] { 3, 5, 2, 5, 14, 4 };
    ```

- ### **Obtain the first and last elements of an array**

    > This is easy to figure out once we know that the first item in an array is associated with the index value 0 and that the array has a length attribute that we can use:

    ```java
    int firstItem = array[0];
    int lastItem = array[array.length - 1];
    ```

- ### **Obtain a value at random from an array**

    > We can easily retrieve any value from our array by using the java.util.Random object:

    ```java
    array[new Random().nextInt(array.length)];
    ```

- ### **Insert a new item into an array**

    > Arrays, as we all know, have a fixed number of values. As a result, we are unable to simply add an item to our list and exceed this limit. Starting with a larger array, we'll need to copy the elements of the base array into it. There is a method in the Arrays class for replicating the values of an array into a new structure of a different size:

    ```java
    **int**[] newArray = Arrays.copyOf(array, array.length + 1);
    newArray[newArray.length - 1] = newIem;
    ```

    > A one-line statement can be used to accomplish our goal by using the add method of the ArrayUtils class if it is available in our project:

    ```java
    ArrayUtils.add(array, newItem);
    ```

- ### **Adding a value to the middle of two other values**

    > Due to its indexed-values nature, inserting an item between two other items in an array is not a simple task. To simplify the solution, Apache added a method to its ArrayUtils class:

    ```java
    ArrayUtils.insert(2, array, 77);
    ```

- ### **Compare two arrays**

    > The default implementation of equals is used by arrays, despite the fact that arrays are Objects and therefore have an equals method, which relies on reference equality only.

    ```java
    Arrays.equals(array1, array2);
    Arrays.deepEquals(array1, array2); // for multi-dimensional or nested arrays
    ```

- ### **Check to see if an array is empty**

    > Assuming that arrays have a length attribute, this is a simple assignment.

    ```java
    boolean isEmpty = array == null || array.length == 0;
    ```

    > ArrayUtils also provides a null-safe method:

    ```java
    ArrayUtils.isEmpty(array);
    ```

- ### **How to rearrange the elements of an array**

    > We can use ArrayUtil's feature to shuffle the items in an array:

    ```java
    ArrayUtils.shuffle(array);
    ```

- ### **Box and unbox arrays**

    > Object-based arrays are often the only array types supported by methods. A boxed version of our primitive array can be obtained by using the ArrayUtils helper class.

    ```java
    ArrayUtils.toObject(array);
    ```

- ### **Get rid of duplicates in an array**

    > Transforming the array into a Set implementation removes duplicates the easiest way possible. Our values will need to be boxed if we're not working with object-based arrays, which is the case in this example.

    ```java
    Integer[] list = ArrayUtils.toObject(array); // Remove duplicates
    Set<Integer> set = new HashSet<Integer>(Arrays.asList(list)); // Create array and unbox
    return ArrayUtils.toPrimitive(set.toArray(new Integer[set.size()]));
    ```

- ### **Array to String**

    > Both the Arrays and ArrayUtils classes include implementations for converting data structures to readable Strings. The most significant difference, aside from the slightly different format, is how they treat multi-dimensional objects.

    - We can use two static methods provided by the **Java** Util class, *toString()* (doesn't work well with multi-dimensional arrays) or *deepToString()* (supports all Object-based arrays but will not compile with primitive array arguments).
    - In contrast, **Apache's** implementation provides a single function *toString()* that works in all cases.

- ### **Values in an Array Can Be Filtered**

    Many of us will have to perform the task of filtering out values from a collection on multiple occasions. We don't know the final size of the array when we create it. In order to do this, we'll have to use the Streams approach once.
