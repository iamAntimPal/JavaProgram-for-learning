
// Importing all classes from the antim package
import antim.even;
import antim.odd;


public class Main4 {
	public static void main(String ar[]) {
		// Creating instances of the even and odd classes from the antim package
		even m1 = new even();
		odd m2 = new odd();

		// Starting the threads
		m1.start();
		m2.start();
	}
}
