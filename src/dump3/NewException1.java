package dump3;

import java.util.Enumeration;

public class NewException1 {

	public static void main(String[] args) {
		System.out.println("args");
		try {
			ArithmeticException ae = new ArithmeticException();
			int b = 7 / 0;
		} catch (ArithmeticException e) {
			e.printStackTrace();
			int[] a = new int[3];
			a[5] = 8;
		} catch (IndexOutOfBoundsException  e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
