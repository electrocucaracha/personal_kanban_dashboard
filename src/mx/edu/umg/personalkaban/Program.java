package mx.edu.umg.personalkaban;

import mx.edu.umg.personalkaban.model.Task;

public class Program {

	public static void main(String[] args) throws Exception {

		Task t1 = new Task();
		Task t2 = new Task();
		Task t3 = new Task();

		t1.setTitle("Title1");
		t2.setTitle("Title1");
		t3.setTitle("Title1");

		System.out.println(t1.toString());
		System.out.println(t2.toString());
		System.out.println(t3.toString());

		// It is reflexive. For any reference value x, x.equals(x) should return
		// true.
		if (t1.equals(t1)) {
			System.out.println("Reflexive!!!");
		} else {
			throw new Exception("No Reflexive");
		}

		// It is symmetric. For any reference values x and y, x.equals(y) should
		// return true if and only if y.equals(x) returns true.
		if (t1.equals(t2) == t2.equals(t1)) {
			System.out.println("Symmetric!!!");
		} else {
			throw new Exception("Asymmetric.");
		}

		// It is transitive. For any reference values x, y, and z, if
		// x.equals(y)
		// returns true and y.equals(z) returns true, then x.equals(z) must
		// return true.
		if (t1.equals(t2) && t2.equals(t3)) {
			if (t1.equals(t3)) {
				System.out.println("Transitive!!!");
			} else {
				throw new Exception("Intransitive.");
			}
		}

		// It is consistent. For any reference values x and y, multiple
		// invocations
		// of x.equals(y) consistently return true or consistently return false,
		// provided no information used in equals comparisons on the object is
		// modified.
		boolean result = t1.equals(t2);
		for (int i = 0; i < 100; i++) {
			if (result != t1.equals(t2)) {
				throw new Exception("Inconsistent.");
			}
		}
		System.out.println("Consistent!!!");

		// For any non-null reference value x, x.equals(null) should return
		// false.
		if (t1.equals(null)) {
			throw new Exception("Returned true.");
		}
		System.out.println("Returned false!!!");
	}

}
