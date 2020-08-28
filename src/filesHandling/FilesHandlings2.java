package filesHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.print.DocFlavor.BYTE_ARRAY;
import javax.xml.stream.XMLStreamReader;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import pojo.FindPersonResult;

public class FilesHandlings2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("D:\\tutor\\javaExamples\\src\\allDir\\Payload1.xml");
//		
		FileInputStream fis = new FileInputStream(file);
		
		byte[] bytesarray = new byte[Byte.MAX_VALUE];
		
		fis.read(bytesarray);
		int ch;
		StringBuilder stringbuild = new StringBuilder();
		while ((ch=fis.read())!=-1) {
			stringbuild.append((char)ch);
		}
		
		
	}

}
