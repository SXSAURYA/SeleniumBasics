package filesHandling;

import java.io.File;
import java.io.IOException;

public class FilesHandlings {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("D:\\tutor\\javaExamples\\src\\allSources\\input.txt");
		
		if (file.exists()) {
			System.out.println("file is present");
		}else {
			System.out.println("...file is not present...create a new...");
		}
		
		//We have one method in file 
		
		file.createNewFile();
		
		
		if (file.exists()) {
			System.out.println("file is present");
		}else {
			System.out.println("...file is not present...create a new...");
		}

	}

}
