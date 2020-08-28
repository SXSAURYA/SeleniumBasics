package dump3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;

public class FileClasses2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = null;
		
		file = new File(System.getProperty("user.dir")+"/src/allSources/input.txt");
		System.out.println(file.exists());
		file.createNewFile();
		FileReader fr = new FileReader(file);
		
		int data = 0;
		while (data!=-1) {
			data = fr.read();
			System.out.println((char)data);
		}
	}

}
