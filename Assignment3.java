package stringtasks;

import java.util.*;

public class Assignment3 {
	
public static void main(String[] args) {
		String name = "careertuner";
		String s = "java standard edition";
		String s1 = "b.v.raju college";
		String s2 = "welcome to careertuner";
		String s3 = "careertuner";
		String s4 =  "career";
		StringTokenizer st = new StringTokenizer(s);
		System.out.println("Total no. of words in string:" + st.countTokens());
		char ch = name.charAt(4);
		System.out.println(ch);
		System.out.println(s.toUpperCase());
		String substr = s1.substring(4, 8);
		System.out.println(substr.toUpperCase());
		System.out.println(s2.endsWith(s3));
		System.out.println(s3.contains(s4));
		System.out.println(s1.replace("ll","lL" ));
		
	}

}