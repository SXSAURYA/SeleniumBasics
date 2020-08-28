package dump3;

public class NewException2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] a = new int[2];
			int i = 5;
			if (i>a.length) {
				throw new NewException(i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
