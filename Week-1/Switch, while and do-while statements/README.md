### Switch statement

Switch statements are used when you have to take multiple cases into consideration. It is like if-else-if ladder statement. 

# Syntax
switch(expression) {
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
    // code block
}

*Note: * We need to use a break statement in each case so that the control comes out of the switch statements.

## Example
```java
/**********************************Switch-Section**********************************/
class SwitchExample {

    // Static method contains example code.
    public static void main(String args[]) {
        

            Scanner sc= new Scanner(System.in);	

            System.out.println("1.To say hello\t 2.To say bye\t 3.Exit: ");
		    int opt =sc.nextInt();
		    switch(opt)					// switch case starts
		{
			case 1:                         // case 1 runs if opt == 1 is selected
				System.out.println("Hello");        
				break;

			case 2: res = a-b;              // case 2 runs if opt == 2 is selected
				System.out.println("Bye");
				break;

			default: break;                 // else this will run

		}				                // switch case ends
    }
}

 ```


