package dump3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class FileClasses4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = null;
		
		file = new File(System.getProperty("user.dir")+"/src/allDir/output.txt");
		System.out.println(file.exists());
		file.createNewFile();
		FileOutputStream fos = new FileOutputStream(file);
		fos.write(new byte[] {65,68,69,88});
		fos.flush();
		fos.close();
	}

}
