# Assignment Operator

We can separate Assignment operator into 2 categories,
- [Simple Assignment Operator](#simple-assignment-operator "Simple Assignment Operator")
- [Compound Assignment Operator](#compound-assignment-operator "Compound Assignment Operator")


## Simple Assignment Operator
Simple assignment operator used to assign a value in a variable.
It is used to assign the value on its right to the operand on its left.

### Syntax
```java
VariableName = Value;
```


## Compound Assignment Operator
Compound assignment operator is also known as shorthand operator.
It provides a shorter way to assign an expression to a variable.
In other words it's do some operation before the assignment.

### Syntax
```
VariableName [CompoundAssignmentOperator] Value;
```

For example,
```java
a += 1;
// Above is equivalent to below.
a = a + 1; 
// This type of equivalence also applies for below Compound Assignment
// Operators in table.
```

### Various Compound Assignment Operator
| Operators | Description |
|:---:|:---:|
| += | Compound additional assignment operator. |
| -= | Compound subtraction assignment operator. |
| *= | Compound multiplication assignment operator. |
| /= | Compound division assignment operator. |
| %= | Compound Modulo Assignment operator. |
| &= | Compound bitwise Assignment operator. |
| ^= | Compound bitwise ^ assignment operator. |
| >>= | Compound right shift assignment operator. |
| >>>= | Compound right shift filled 0 assignment operator. |
| <<= | Compound left shift assignment operator. |


## Example
```java
// Public class contains main method.
public class AssignmentOperator {
    
    // main() method to run this program.
    public static void main(String[] args) {
        
        // Declaring 2 integer variables and initializing with 1 and 10
        // using simple assignment operator.
        int a = 1;
        int b = 10;

        // Then we incrementing variable "a" and decrementing variable "b"
        // with compound assignement operators.
        a += 1;
        b -= 5;

        // Finally we're printing the values stored in both variables.
        System.out.println("After simple assignment and compound assignment,");
        System.out.println("Variable a contains: " + a + "\nVariable b contains: " + b);
    }
}
```
> *Note: The above code added in [AssignmentOperator.java](AssignmentOperator.java) file.*


## Output
```
After simple assignment and compound assignment,
Variable a contains: 2
Variable b contains: 5
```


## Author
[NanthaKumar](https://github.com/nknantha "Nanthakumar's Profile")
