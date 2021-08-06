# if
* Java uses if statement , the execution should has to follow the specific condition  .
* If the condition specified is true then only the code of the block gets executed .
* If the condition is false program stop .
#### Syntax
```java
if (condition)
{
  ---- body statements -----
}
```

# if -else
* Java uses if - else statement to perform conditions .
*The condition specified is true then only the code of if block gets  executed . Otherwise the code of else gets executed .
* else statement does not work without  existence  of its corresponding if statement .
* else gets executed if the condition is false .

#### Syntax
```java
if (condition)
{
  ---- body statements -----
}

else
{
  ---- body statements ------
}
```

## Example
```java
import java.util.Scanner ;
class Main //class name
{
	public static void main(String[] args) {
	    Scanner in =new Scanner(System.in);
	    int i=in.nextInt();                 // Accept the value of i from the user .

	     if(i==1)                      // if condition i==1
	     {
	         System.out.println("Hello World ! "); // if the condition i==1 is true .
	     }
	     else                   // if the condition i==1 is false .
	     {
	         System.out.println(" Exit from else block .  "); // This code will get executed .
	     }
	}
}
```

# if else -if
* The java uses else if statements like another if condition .
* It's used in the program when if statement having multiple decisions.
* The condition of if is true then only  the execution of that block inside the else can be there .

#### Syntax
```java
if (condition 1)
{
  ---- body statements  -----
}

else
{
  if (condition 2)
      {
        ------ body statements  ------
      }
}

```



```java
if (condition 1)
{
  ---- body statements -----
}

else
{
  if (condition 2)
      {
        ------ body statements ------
      }
  else
      {
        ------ body statements ------
       }

}

```


## Example
```java
import java.util.Scanner ;  //library
class else-if //class name
{
	public static void main(String[] args) {
	    Scanner in =new Scanner(System.in);
	    int i=in.nextInt();                 // Accept the value of i from the user .

	     if(i==2)                      // if condition i==2 .
	     {
	         System.out.println("Hello World ! "); // if the condition i==2 is true .
	     }
	     else                   // if the condition i==2 is false  .
	     {                     // It will enter the else block .
	         if (i<10)           // The specified codition has to be true to perform the following execution .
	         {
	             System.out.println(" Exit from else - if  block .  "); // This  will be executed if the value of i is  .
	                                                              // lesser than 10 only .
	             }
	     }                                         //if the condition i<10 is not true . No execution .
	}
}
```
