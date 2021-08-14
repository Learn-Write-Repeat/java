# Operator Precedence

> Operator Precedence is a topic that is linked with Mathematics and Computer programming. The order of operation is collection of rules that reflect convertions about which procedures to perform first in order to evaluate a given mathematical expression.
- ### **For Example (Mathematical point of View:)**
```
   4+2/2 must be equal to 5
   But 4+2/2 will be equal to 3 if we evaluate it left to right blindly(without) and it is an incorrect output
```
So there are some rules or the order of operations that has to be followed in order to get correct output also Known as ``Operator Precedence``.
> **_NOTE_** :
> - **parentheses()** and **Array subscript[]** have the highest precedence in Java
> - **Addition and Subtraction** have higher precedence than the **Left shift and Right shift operators**

Below is a table defined in which the lowest precedence operator show at the top of it.

| Precedence | Operator | Associativity |
| ----------- | ----------- | ----------- |
| 1) | ``=`` ``+=`` ``-=`` ``*=`` ``/=`` ``%=`` | Right to left |
| 2) | `` ?: `` | Right to left |
| 3) | `` || `` | Left to right |
| 4) | `` && `` | Left to right |
| 5) | `` | `` | Left to right |
| 6) | `` ^ `` | Left to right |
| 7) | `` != `` `` == ``| Left to right |
| 8) | `` < `` ``<=`` ``>`` ``>=`` ``instanceof (type comparision (objects only))`` |  Left to right |
| 9) | `` & ``| Left to right |
| 10) | `` >> `` `` << `` ```>>>```| Left to right |
| 11) | `` - `` `` + `` | Left to right |
| 12) | `` * `` `` / `` `` % ``| Left to right |
| 13) | `` - `` `` + `` `` ~ `` `` ! `` `` (type)-typecast `` | Left to right |
| 14) | `` ++ `` ``--`` | Right to left |
| 15) | ``.`` ``()`` ``[]`` | Left to Right |
### Precedence order
> When two operators share a single operand, the operator having the highest precedence goes first.
``` 
For example, x + y * z is treated as x + (y * z), whereas x * y + z is treated as (x * y) + z because * operator has highest precedence in comparison of + operator. 
```
### Associativity
> Associative is a concept related to the operators applied when two operators with the same precedence come in an expression. The associativity concept is very helpful to goes from that situation. Suppose we have an expression `a + b - c` **(+ and - operators have the same priority)**, and this expression will be treated as `(a + (b - c))` because these operators are right to left-associative. On the other hand, `a+++--b+c++` will be treated as `((a++)+((--b)+(c++)))` because the unary post-increment and decrement operators are right to left-associative.

> An example is defined below to understand how an expression is evaluated using precedence order and associativity?

| Steps | Expression | result | Description |
| ----------- | -------------- | ------ |----- |
| 1) | x = 4 / 2 + 8 * 4 - ( 5+ 2 ) % 3 | x = 4 / 2 + 8 * 4 - 7 % 3  | `In the above expression, the highest precedence operator is (). So, the parenthesis goes first and calculates first.` |
| 2) | x = 4 / 2 + 8 * 4 - 7 % 3 | x = 2 + 8 * 4 - 7 % 3  | `Now, /, * and % operators have the same precedence and highest from the + and - Here, we use the associativity concept to solve them. The associative of these operators are from left to right. So, / operator goes first and then * and % simultaneously.` |
| 3) | x = 2 + 32 - 1 | x = 34 - 1 </br> x = 33 | `Now, + and - operators both also have the same precedence, and the associativity of these operators lest to the right. So, + operator will go first, and then - will go.` |

### HighestPrecedence.java
```

//java Source Code
//import classes  
import java.util.*;  
  
//creating HighestPrecedence class to evaluate the expression  
public class HighestPrecedence {  
      
    //main() method starts  
    public static void main(String[] args) {  
          
        //initialize variables with default values  
        int x = 2;  
        int y = 5;  
        int z = 12;  
          
        //calculating exp1, exp2, and exp3   
        int exp1 = x +(z/x+(z%y)*(z-x)^2);  
        int exp2 = z/x+y*x-(y+x)%z;  
        int exp3 = 4/2+8*4-(5+2)%3;  
          
        //printing the result  
        System.out.println(exp1);  
        System.out.println(exp2);  
        System.out.println(exp3);  
    }  
} 

```
### Output
![output](https://static.javatpoint.com/core/images/highest-precedence-in-java2.png)
### Related Topics :</br>
<https://www.tutorialspoint.com/prefix-and-postfix-expressions-in-data-structure>
<https://www.geeksforgeeks.org/stack-set-4-evaluation-postfix-expression/>
