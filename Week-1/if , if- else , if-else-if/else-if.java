import java.util.Scanner ;  //library
class else-if //class name
{
	    public static void main(String[] args) 
	  {
	    Scanner in =new Scanner(System.in);
	    int i=in.nextInt();                 // Accept the value of i from the user .

	     if(i==2)                         // if condition is  i==2 .
	     {
	         System.out.println("Even Number"); // if the condition i==2 is true .
	     }
	     else if(i==3)                  // else if condition is i==3  .
	     {                             // The specified codition has to be true to perform the following execution .

	            System.out.println("\nOdd Number \nExit from else - if  block .  ");

             }

             else if(i==5)                 // else if condition is  i==5 .
             {
	            System.out.println(" Five : Prime Number ."); // if the condition i==5 is true .
	     }

	     else
	     // if neither of the conditions are true .
	     {
	         System.out.println(" \n else-if conditions are found false . \n Exit from else ."); // else block will be executed .
	     }
	}
}
