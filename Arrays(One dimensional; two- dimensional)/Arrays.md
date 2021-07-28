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

<img src = "![image](https://user-images.githubusercontent.com/81172589/127369432-abf6cc4b-1553-4a56-8ada-f7e5e0fea7df.png)">

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
<img src = "![image](https://user-images.githubusercontent.com/81172589/127370435-23a10b71-7cb2-4696-89ad-1c9ddeb6d891.png)">

#### Using For Loop – One Dimensional Array

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

<img src ="![image](https://user-images.githubusercontent.com/81172589/127370635-ff65f132-ce27-4830-81c0-d2599f554085.png)">
