package dump3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class FileClasses3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = null;
		
		file = new File(System.getProperty("user.dir")+"/src/allSources/output.txt");
		System.out.println(file.exists());
		file.createNewFile();
		FileWriter fw = new FileWriter(file, false);
		fw.write("Added Some write text");
		fw.flush();
		fw.close();
	}

}
