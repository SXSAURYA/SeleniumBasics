package exceptionsInJava;

import java.io.File;
import java.io.IOException;

public class ExceptionHandlings2 {

	public static void main(String[] args) throws IOException {
	 //throw and throws ?
		int b = 4;
		int a = 0;
		File file = new File("//dsd");
		file.createNewFile();
		if (a==0) {
			int c = b/a;
			throw new ArithmeticException("Divide by zero");
		}
		//Dummy 
		//if(login())
		//throw new Exception("User is able to login");
	}

}
