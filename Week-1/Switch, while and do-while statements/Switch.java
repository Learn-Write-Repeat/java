
// libraries
import java.util.*;

class Switch {
	public static void main(String args[]) {
		float res;
		Scanner sc = new Scanner(System.in); // to take i/p from user
		System.out.println("Enter 1st number: ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int b = sc.nextInt();

		System.out.println("1.Add\t 2.Subtract\t 3.Multiply\t 4.Divide\t 5.Exit: ");
		int opt = sc.nextInt();
		switch (opt) // switch case starts
		{
			case 1:
				res = a + b;
				System.out.println("Addition = " + res);
				break;

			case 2:
				res = a - b;
				System.out.println("Subtraction = " + res);
				break;

			case 3:
				res = a * b;
				System.out.println("Multiplication = " + res);
				break;

			case 4:
				res = a / b;
				System.out.println("Division = " + res);
				break;

			default:
				break;

		} // switch case ends
	}
}