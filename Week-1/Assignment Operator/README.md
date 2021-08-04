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
| &= | Compound bitwise AND Assignment operator. |
| \|= | Compound bitwise OR Assignment operator. |
| ^= | Compound bitwise XOR assignment operator. |
| >>= | Compound right shift assignment operator. |
| >>>= | Compound right shift assignment (Unsigned) operator. |
| <<= | Compound left shift assignment operator. |


## Example
```java
// Public class contains main method.
public class AssignmentOperator {
    
    // main() method to run this program.
    public static void main(String[] args) {
        
        // Declaring integer variable and initializing 10
        // using simple assignment operator.
        int Value = 1;
        System.out.println("Initially, Value = " + Value);

        // Compound additional assignment operator.
        Value += 10;
        System.out.println("Adding 10, Value = " + Value);

        // Compound subtraction assignment operator.
        Value -= 8;
        System.out.println("Subracting 8, Value = " + Value);

        // Compound multiplication assignment operator.
        Value *= 8;
        System.out.println("Multiplying 8, Value = " + Value);

        // Compound division assignment operator.
        Value /= 4;
        System.out.println("Dividing 4, Value = " + Value);

        // Compound Modulo Assignment operator.
        Value %= 99;
        System.out.println("Modulo with 99, Value = " + Value);

        // Compound bitwise AND Assignment operator.
        Value &= 7;
        System.out.println("Bitwise AND with 7, Value = " + Value);

        // Compound bitwise OR Assignment operator.
        Value |= 13;
        System.out.println("Bitwise OR with 13, Value = " + Value);

        // Compound bitwise XOR Assignment operator.
        Value ^= 17;
        System.out.println("Bitwise XOR with 17, Value = " + Value);

        // Changing value to 2021 for easy understanding of left and right shift.
        Value = 2021;

        // Compound left shift assignment operator.
        Value <<= 2;
        System.out.println("Left shit with 2, Value = " + Value);

        // Compound right shift assignment operator.
        Value >>= 2;
        System.out.println("Right shift with 2, Value = " + Value);

        // Compound right shift assignment (Unsigned) operator.
        Value >>>= 2;
        System.out.println("Right shift (unsigned) with 2, Value = " + Value);
    }
}
```
> *Note: The above code added in [AssignmentOperator.java](AssignmentOperator.java) file.*


## Output
```
Initially, Value = 1
Adding 10, Value = 11
Subracting 8, Value = 3
Multiplying 8, Value = 24
Dividing 4, Value = 6
Modulo with 99, Value = 6
Bitwise AND with 7, Value = 6
Bitwise OR with 13, Value = 15
Bitwise XOR with 17, Value = 30
Left shit with 2, Value = 8084
Right shift with 2, Value = 2021
Right shift (unsigned) with 2, Value = 505
```


## Author
[NanthaKumar](https://github.com/nknantha "Nanthakumar's Profile")
