# Arithmetic Operators

> Symbol for performing operations in Java is called a "operator." As an example, +, -, *, /, etc. can be used. As well as addition, subtraction, multiplication, and division, the Java arithmetic operators can be used. Essentially, they are mathematical operations of the most basic kind.

- ### **Example 1**

```java
//Source Code

public class DevIncept{  
	public static void main(String args[])
	{  
		int a = 10;  
		int b = 5;  
		System.out.println(a+b); //addition operator, returns the sum
		System.out.println(a-b); //multiplication operator, returns the difference
		System.out.println(a*b); //multiplication operator, returns the product
		System.out.println(a/b); //division operator, returns the quotient
		System.out.println(a%b); //modulous operator, returns the remainder of an integer division
	}
}
```

```java
//Output

15
5
50
2 
0
```
> Here you can see ```/``` and ```%``` are two sides of the same coin. 10 ÷ 5 gives 2 as the quotient (given by ```/```) and 0 as the remainder (given by ```%```). Also, the real-life mathematical symbol '✖' or cross is not used in computing language due to its similarity with the English alphabet 'X' or 'x'. Instead, ```*``` is used to denote multiplication.

- ### **Example 2**
Here we are using an arithmatic expression using all the operators listed above.

```java
//Source Code

public class DevIncept
{  
	public static void main(String args[])
	{  
		System.out.println(10*10/5+3-1*4/2);  
	}
}
```

```java
//Output

21
```
