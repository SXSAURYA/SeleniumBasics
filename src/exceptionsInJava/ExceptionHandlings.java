package exceptionsInJava;

public class ExceptionHandlings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Interview Questions
		// Checked and Unchecked
		// Checked Exception : The exception which we caught during Compile
		// Unchecked Exception : Which we caught using Run time
		// What is the Superclass in Exception?
		// Can we have more than one catch block for one try block?
		//finally block : 
//		File file = new File("//AllDir");
//		int b = "sdsd";
//		file.createNewFile();
		
		//Driver 
		
		
		try {
			int b = 7/0;
			int[] array = new int[1];
			array[1] = 3;
			array[2] = 4;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Ï will always execute");
		}
		// int b = 7/0;

		System.out.println("Let's execute after line number 18");
	}

}
