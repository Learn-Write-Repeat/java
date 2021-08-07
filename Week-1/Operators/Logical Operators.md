# Logical operators

### Logical operators are generally used for combining two or more relational statements. They return Boolean values. The logical operators are used primarily in the expression evaluation to make a decision. These operators allow the evaluation and manipulation of specific bits within the integer.

### The types of Logical operators with their description are tabulated as follows -

| **Operators**        | **Description**                                                                                    |
|----------------------|----------------------------------------------------------------------------------------------------|
| **&& (Logical AND)** | This operator returns true if all relational statements combined with && are true, else it returns |  |                      | false.                                                                                             |
| **|| (Logical OR)**  | This operator returns true if at least one of the relational statements combined with || is true,  |   |                      | else it returns false.                                                                             |
| **! (logical NOT)**  | It returns the inverse of the statement's result.                                                  |
| **xor (Logical XOR** | This operator returns true if either statement one is true or statement two is true but not both.  |
| **operators)**       |                                                                                                    |
| **and (Logical AND)**| This operator returns true if all relational statements combined with it are true, else it returns |
|                      | false.                                                                                             |
| **or (Logical OR)**  | This operator returns true if atleast one of the relational statements combined with it is true,   |
|                      | else it returns false.                                                                             |

# && (Logical AND)
### The logical && operator doesn't check the second condition if first condition is false. It checks the second condition only if the first one is true. The evaluation in logical && expression is left to right. With the help of other Logical operators, we can convert Logical AND to Logical OR. This operator accepts two operands.
### Suppose we have two conditions A and B. So, we can see the possible values of A && B in the below table:-
| **A** | **B** | **A && B** |
|-------|-------|------------|
| True  | True  | True       |
| False | True  | False      |
| True  | False | False      |
| False | False | False      |

# || (Logical OR)
### The Logical OR operator is represented with the two vertical line symbols. It works opposite to the logical AND operator, as it only gives false when both statements of the expression are not true. Otherwise, it returns true. The logical || operator doesn't check the second condition if first condition is true. It checks the second condition only if the first one is false. The logical || operator accepts two operands.
### Suppose we have two conditions A and B. We can see the possible values of A || B in the following table:-
| **A** | **B** | **A || B** |
|-------|-------|------------|
| True  | True  | True       |
| False | True  | True       |
| True  | False | True       |
| False | False | False      |

# ! (Logical NOT operator)
### This logical operator is represented as an exclamation sign (!). This operator accepts a single argument and returns the inverse value of the corresponding argument. Suppose we have an operand A. So, the Logical NOT operator will return the opposite possible values of A.
| **A** | **!A** |
|-------|--------|
| True  | False  |
| False | True   |

# xor (Logical XOR operator)
### XOR stands for "Exclusive-OR". It returns true when either statemen1 is true, or statement2 is true, but not both. The xor operator will return true only when one of the statements is true and another one is false. If both of the statements are true, the xor operator will return false. The xor operator takes two operands and returns false when both operands have the same value.
### Suppose we have two conditions A and B. So, we can see the possible values of A xor B.
| **A** | **B** | **A xor B** |
|-------|-------|-------------|
| True  | True  | False       |
| False | True  | True        |
| True  | False | True        |
| False | False | False       |

# and operator
### This operator works similar to the && operator. Although both 'and' and '&&' works similar, the difference is of precedence. Precedence decides which operation should be performed first. The precedence of the '&&' operator is higher than the precedence of the '=' operator, whereas the precedence of 'and' is lower than the '=' operator.

# or operator
### This operator works similar to the || operator. Although both 'or' and 'II' works similar, the difference is of precedence. Precedence decides which operation should be performed first. The precedence of the 'II' operator is higher than the precedence of the '=' operator, and the precedence of 'or' is lower than the '=' operator.


```

```
