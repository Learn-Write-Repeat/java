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
