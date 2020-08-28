package otpretrieved;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class OTP {

	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println(new GetOTP().OutlookMailReader("INBOX", "Verify your identity in  ", "Please find", 6));;

	}

}
