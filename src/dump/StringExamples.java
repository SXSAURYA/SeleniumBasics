package dump;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringExamples {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		System.out.println("Ullas".subSequence("Ullas".length()-2, "Ullas".length()));
		System.out.println("Ullas".equalsIgnoreCase("Ullas"));
		System.out.println("Ullas".compareTo("ullas"));
		System.out.println("Ullas".compareTo("Ullas"));
		String str = "Batman";
		char[] charArray = str.toCharArray();
		System.out.println(charArray.length);
		char[] char1 = new char[3];
		str.getChars(3, 6, char1, 0);
		System.out.println(char1);
		//Using
		String str2 = "Ullas";
		byte[] byteArray = str2.getBytes();
		System.out.println(Arrays.toString(byteArray));
		byte[] byteArr = str2.getBytes("UTF-8");
		System.out.println(Arrays.toString(byteArr));
		System.out.println(new String(byteArr));
		byte[] byteArray1 = { 80, 65, 78, 75, 65, 74 };
		String str4 = new String(byteArray1, 0, 3, StandardCharsets.UTF_8);
		System.out.println(str4);

	}

}
