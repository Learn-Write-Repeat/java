### Arrays

* An <b>array</b> is a collection of variables that are of similar data types and are alluded by a common name.

* Arrays in Java work differently as compared to C++. 

* C++ do not have bound checking on arrays whereas, Java have strict bound checking on arrays.

* Arrays in Java are classified into :
 
   * One dimensional arrays

   * Two dimensional arrays

* A one-dimensional array is a list of variables with the same data type, whereas the two-Dimensional array is ‘array of arrays’ having similar data types.

### One Dimensional Arrays

* One-dimensional array in Java programming is an array with a bunch of values having been declared with a single index.

<img src ="![image](https://user-images.githubusercontent.com/81172589/127368555-5af28f0d-f99e-490f-ba94-768b94cf476f.png)">

* As you can see in the example given above, firstly, you need to declare the elements that you want to be in the specified array.

* Secondly, the location of each element needs to particularized as well, since that is where the elements will be stored respectively.

* Thirdly, you need to declare the array accordingly.


#### Declaring and initialising arrays

```
{
	public static void main(String args[])
	{    
	int[] a=new int[3];//declaration   
	a[0]=10;//initialization  
	a[1]=20;  
	a[2]=30;  
	//printing array  
	System.out.println("One dimensional array elements are");    
	System.out.println(a[0]);    
	System.out.println(a[1]);    
	System.out.println(a[2]);    
	}
}
```

<img src = "https://user-images.githubusercontent.com/81172589/127369432-abf6cc4b-1553-4a56-8ada-f7e5e0fea7df.png">

#### Getting input for arrays using Scanner class

* Read the array length as sc.nextInt() and store it in the variable len and declare an array int[len].

* To store elements in to the array for i=0 to i<length of an array read the element using sc.nextInt() and store the element at the index a[i].

* Display the elements of an array for loop iterates from i=0 to i<length of an array print the array element a[i].
   
```
import java.util.*;
class OnedimensionalScanner
{
   public static void main(String args[])
   {    
	int len;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Array length : ");
	len=sc.nextInt();
	int a[]=new int[len];//declaration    	 
	System.out.print("Enter " + len + " Element to Store in Array :\n");
        for(int i=0; i<len; i++)
        {
           a[i] = sc.nextInt();
        }   
        System.out.print("Elements in Array are :\n");
        for(int i=0; i<len; i++)
        {
           System.out.print(a[i] + "  ");
        }  
   }
}
```
<img src = "https://user-images.githubusercontent.com/81172589/127370435-23a10b71-7cb2-4696-89ad-1c9ddeb6d891.png">

#### Using For Loop – One Dimensional Array

```
class OnedimensionalLoop
{
	public static void main(String args[])
	{    
	   int a[]={10,20,30,40,50};//declaration and initialization  	  
	   System.out.println("One dimensional array elements are :\n");    
	   for(int i=0;i<a.length;i++)  
	   {
		System.out.println("a["+i+"]:"+a[i]);    
	   }	
	}
}
```

<img src ="https://user-images.githubusercontent.com/81172589/127370635-ff65f132-ce27-4830-81c0-d2599f554085.png">

### Two Dimensional Arrays

* Two Dimensional Array in Java programming language is nothing but an Array of Arrays

*  In Java's Two Dimensional Arrays, data stored in row and columns, and we can access the record using both the row index and column index 

* To work with multi-level data, we have to use the Multi-Dimensional Array. 

#### Declaring a two dimensional array

```
class TwodimensionalStandard
{
	public static void main(String args[])
	{    
	int[][] a={{10,20},{30,40}};//declaration and initialization   
	System.out.println("Two dimensional array elements are");    
	System.out.println(a[0][0]);    
	System.out.println(a[0][1]);    
	System.out.println(a[1][0]);    
	System.out.println(a[1][1]);    	
	}
}
```
<img src = "https://user-images.githubusercontent.com/81172589/127374955-418b7152-9711-4b29-aba6-78910338d308.png" >

#### Using for loop

```
class TwodimensionalLoop
{
	public static void main(String args[])
	{    
	int[][] a={{10,20},{30,40},{50,60}};//declaration and initialization   
	System.out.println("Two dimensional array elements are");    
	for (int i = 0; i < 3; i++) 
	{
            for (int j = 0; j < 2; j++) 
	    {
                System.out.println(a[i][j]);
            }
	}
	}
}
```

<img src ="https://user-images.githubusercontent.com/81172589/127375067-515e0de3-1c44-4236-9528-292a30c661f8.png">

#### Using Scanner class

* Read the row length, column length of an array using sc.nextInt() method of Scanner class.

* Declare the array with the dimension row, column.

* for i=0 to i<row for j=0 to j<column sc.nextInt() reads the entered number and insert the element at a[i][j]

```

1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
import java.util.*;
class TwoDimensionalScanner
{
   public static void main(String args[])
   {    
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Row length of an array : ");
	int row=sc.nextInt();
	System.out.println("Enter column length of an array : ");
	int column=sc.nextInt();
	int a[][]=new int[row][column];//declaration    	 
	System.out.print("Enter " + row*column + " Elements to Store in Array :\n");
        for (int i = 0; i < row; i++)
	{
	    for(int j = 0; j < column; j++)
	    {
           	a[i][j] = sc.nextInt();
	    }
	}   
        System.out.print("Elements in Array are :\n");
        for (int i = 0; i < row; i++)
	{
	    for(int j = 0; j < column; j++)
	    {
	       System.out.println("Row ["+i+"]:  Column ["+j+"] :"+a[i][j]);
 	    }
	}  
   }
}
```

<img src ="https://user-images.githubusercontent.com/81172589/127375287-a7d97189-5c5e-4b28-be03-591f16b1c0bc.png">

