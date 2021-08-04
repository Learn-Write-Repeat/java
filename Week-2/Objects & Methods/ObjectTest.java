import java.util.*;

// Creating Student class
class Student {

	private int phy, chem, maths; // defining fields

	public void setInfo(int phy, int maths, int chem) {
		this.phy = phy;
		this.maths = maths;
		this.chem = chem;
	}

	public void avgMks() {
		int sum = 0;
		double avg = 0;
		sum = phy + maths + chem;
		avg = sum / 3;
		System.out.println("Avg marks: " + avg);

	}
}

// Creating another class ObjectTest which contains the main method
class ObjectTest {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter physics marks: ");
		int phy = sc.nextInt();

		System.out.println("Enter maths marks: ");
		int maths = sc.nextInt();

		System.out.println("Enter chemistry marks: ");
		int chem = sc.nextInt();

		Student s = new Student(); // Creating an object or instance
		s.setInfo(phy, maths, chem); // initializing the value to these objects by invoking the setInfo method
		s.avgMks(); // calculates avg using avgMks method

	}
}