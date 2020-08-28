package dump3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Logger;

public class FileClasses {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = null;
		
		file = new File(System.getProperty("user.dir")+"/src/allSources/input.txt");
		System.out.println(file.exists());
		file.createNewFile();
		System.out.println(file.exists());
		FileInputStream fis = new FileInputStream(file);
		int data = fis.read();
		while (data!=-1) {
			data =fis.read();
		}
		
		FileInputStream fileInputStream = new FileInputStream(file);

		byte[] databy      = new byte[1024];
		int    bytesRead = fileInputStream.read(databy, 0, databy.length);

		while(bytesRead != -1) {

		  bytesRead = fileInputStream.read(databy, 0, databy.length);
		}
		fileInputStream.close();
		System.out.println(new String(databy));
		file.renameTo(new File(System.getProperty("user.dir")+"/src/allDir/input.txt"));
		System.out.println(new File(System.getProperty("user.dir")+"/src/allDir/input.txt").exists());
		fileInputStream = new FileInputStream(file);
		fileInputStream.read(databy);
		byte[] databyy      = new byte[1024];
		System.out.println(new String(databyy));
		
		//Using Input Streams
		//FileInputStream fis = new FileInputStream(file);
	}

}
