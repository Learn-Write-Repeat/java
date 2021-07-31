### Expressions

* A Java expression consists of variables, operators, literals, and method calls. To know more about method calls, visit Java methods.

* For example :

```
int score; 
score = 90;
```
* Here, score = 90 is an expression that returns an int

* Consider another example,

```
Double a = 2.2, b = 3.4, result;
result = a + b - 3.4;
```
* Here, a + b - 3.4 is an expression.

### Operators

* Operator in Java is a symbol that is used to perform operations. For example: +, -, *, / etc.

* There are many types of operators in Java which are given below:
   
    * Unary Operator,

    * Arithmetic Operator,

    * Shift Operator,

    * Relational Operator,

    * Bitwise Operator,

    * Logical Operator,

    * Ternary Operator and

    * Assignment Operator.

#### Unary Operator

* Java unary operators require only one operand
 
* Unary operators are used to perform various operations i.e.:
  
   * incrementing/decrementing a value by one

   * negating an expression

   * inverting the value of a boolean

```
public class OperatorExample{  
public static void main(String args[]){  
int x=10;  
System.out.println(x++);//10 (11)  
System.out.println(++x);//12  
System.out.println(x--);//12 (11)  
System.out.println(--x);//10  
}}
```
<img src = "https://user-images.githubusercontent.com/81172589/127395181-f562f84f-f5eb-47ed-be4d-3426d50bfc82.png">

#### Arithmetic Operator

* Java arithmetic operators are used to perform addition, subtraction, multiplication, and division.

* They act as basic mathematical operations.

```
public class OperatorExample{  
public static void main(String args[]){  
int a=10;  
int b=5;  
System.out.println(a+b);//15  
System.out.println(a-b);//5  
System.out.println(a*b);//50  
System.out.println(a/b);//2  
System.out.println(a%b);//0  
}}  
```
<img src ="https://user-images.githubusercontent.com/81172589/127395768-aa244b9f-f80d-4ad8-86e4-08db8697835a.png">

#### Shift Operator

* Java left shift operator << is used to shift all of the bits in a value to the left side of a specified number of times.

```
public class OperatorExample{  
public static void main(String args[]){  
System.out.println(10<<2);//10*2^2=10*4=40  
System.out.println(10<<3);//10*2^3=10*8=80  
System.out.println(20<<2);//20*2^2=20*4=80  
System.out.println(15<<4);//15*2^4=15*16=240  
}}  
```
<img src ="https://user-images.githubusercontent.com/81172589/127396271-66fedd75-f144-4249-895e-bfd763ea9b03.png">

* Java right shift operator >> is used to move the value of the left operand to right by the number of bits specified by the right operand.

```
public OperatorExample{  
public static void main(String args[]){  
System.out.println(10>>2);//10/2^2=10/4=2  
System.out.println(20>>2);//20/2^2=20/4=5  
System.out.println(20>>3);//20/2^3=20/8=2  
}}  
```
<img src ="https://user-images.githubusercontent.com/81172589/127396519-5f93aad5-a997-4b67-828b-a6d9d080a62c.png">

#### Logical && and Bitwise &

* The logical && operator doesn't check the second condition if the first condition is false.

* It checks the second condition only if the first one is true.

* The bitwise & operator always checks both conditions whether first condition is true or false.

```
public class OperatorExample{  
public static void main(String args[]){  
int a=10;  
int b=5;  
int c=20;  
System.out.println(a<b&&a<c);//false && true = false  
System.out.println(a<b&a<c);//false & true = false  
}}  
```
<img src ="https://user-images.githubusercontent.com/81172589/127401422-aa8c1ff5-8b6c-456e-b61b-b10a18fceaca.png">

```
public class OperatorExample{  
public static void main(String args[]){  
int a=10;  
int b=5;  
int c=20;  
System.out.println(a<b&&a++<c);//false && true = false  
System.out.println(a);//10 because second condition is not checked  
System.out.println(a<b&a++<c);//false && true = false  
System.out.println(a);//11 because second condition is checked  
}}  
```
<img src="https://user-images.githubusercontent.com/81172589/127401805-5e611c45-49be-4dfc-985e-4deeaf92d56f.png">

#### Ternary Operator

* Java Ternary operator is used as one line replacement for if-then-else statement and used a lot in Java programming. 

* It is the only conditional operator which takes three operands.

```
public class OperatorExample{  
public static void main(String args[]){  
int a=2;  
int b=5;  
int min=(a<b)?a:b;  
System.out.println(min);  
}}  
```
<img src ="https://user-images.githubusercontent.com/81172589/127401954-f089e47f-4e52-4a46-861d-47427f896866.png">

#### Assignment Operator

* Java assignment operator is one of the most common operators.

* It is used to assign the value on its right to the operand on its left.

```
public class OperatorExample{  
public static void main(String args[]){  
int a=10;  
int b=20;  
a+=4;//a=a+4 (a=10+4)  
b-=4;//b=b-4 (b=20-4)  
System.out.println(a);  
System.out.println(b);  
}}  
```
![image](https://user-images.githubusercontent.com/81172589/127402080-b353e659-2e00-4286-a490-7184e3462760.png)
