package stringExamples;

public class Examples {

	public void stringsExamples() {
		String s8 = "c";
		String s1 = "Automation";
		char[] charArray = new char[5];
		
		String s4 = "automation";
		System.out.println("Equal Ignore case:::"+(s1.equalsIgnoreCase(s4)));
		String s2 = "Automation";
		//How many object will be going to created
		//Why string is immutable
		//intern()
		String s3 = new String("Automation");
		String s5 = s3.intern();
		// "==" : it will check reference as well value
		System.out.println("Compare s3 and s5"+(s3.equals(s5)));
		//equalsTo --> s1.equalsTo(s2)
		//compareTo --> s1.compareTo(s2) : ASCI  cde
		//equalIgnoreCase() --> 
		System.out.println("Comparision using equals with double quoate::"+(s1==s2));
		System.out.println("With new:::"+(s1==s3));
		System.out.println("Using compare to:::"+(s1.compareTo(s2)));
		System.out.println("Wit using compare to with cases:::"+(s1.compareTo(s4)));
		
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		char[] c = new char[3];
		c[0]= 'F';
		c[1]= 'R';
		c[2]='A';
		//c[3]='M';
		
		String s6 = new String(c);
		System.out.println();
		for (int i=0;i<s6.length();i++) {
			
		}
		System.out.println(s6);
		byte[] b = new byte[2];
		b[0] = 65;
		b[1]= 97;
		//b[2]=88;
		String s7 = new String(b);
		System.out.println(s7);
		//Operator "="
		//Interview Question
		String s10 = "Automation ";
		String s11 ="framework";
		//System.out.println("Assignment Operator:::"+(s10=s11));
		//We have function concat
		s10 = s10.concat(s11);
		System.out.println(s10);
		//split 
		String[] sArray = s10.split(" ");
		System.out.println(sArray[0]);
		System.out.println(sArray[1]);
		//Stringbuilder and Stringbuffer and String
		String s12 = "jahaj";
		StringBuilder sbuilder = new StringBuilder(s12);
		StringBuffer buffer = new StringBuffer(s12);
		//How can we verify Palindrom using function and without function
		//Using Without function : Palindrome 
		System.out.println(sbuilder.toString());
		String reverseString = sbuilder.reverse().toString();
		System.out.println(reverseString.equals(s12));
		
		String s13 = "Automation framework for UI";
		System.out.println(s13.indexOf("UI"));
		System.out.println(s13.indexOf('o'));
		System.out.println(s13.contains("framework"));
	}
}
