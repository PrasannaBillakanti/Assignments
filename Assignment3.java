package stringtasks;

import java.util.*;

public class Assignment3 {
	String name = "Prasanna";
	String s = "java standard edition";
	String s1 = "b.v.raju college";
	String s2 = "welcome to careertuner";
	String s3 = "careertuner";
	String s4 =  "career";
	String s5= "bvrit college";
	Scanner scan=new Scanner(System.in);
	public void Charatindex()
	{
		System.out.println("char at given index");
		System.out.println("enter the index number:");
		int a=scan.nextInt();
		if(a>=0&&a<name.length())
		{
			System.out.println(name.charAt(a));
		}
		else
		{
			System.out.println("The name has "+name.length()+"characters");
		}
		
	}
	public void string1stlettercapital()
	{
		System.out.println("Given string:"+s);
		String sub = s.substring(0,1).toUpperCase();
		String sub0 = s.substring(1,5);
		String sub1 = s.substring(5,6).toUpperCase();
		String sub11 = s.substring(6,14);
		String sub2 = s.substring(14, 15).toUpperCase();
		String substr = s.substring(15);
		System.out.println("String after conversion:"+sub+sub0+sub1+sub11+sub2+substr);
	}
	public void stringcontains()
	{
		System.out.println("String:"+s2);
		System.out.println("specified sequence of char values:"+s4);
		System.out.println(s2.contains(s4));
	}
	
	public void stringends()
	{
		System.out.println("string ends with the contents of other string");
		System.out.println(s2.endsWith(s3));
	}
	public void countwords()
	{
		StringTokenizer st=new StringTokenizer(s);
		System.out.println("Given String:"+s);
		System.out.println("Total no. of words in the string:"+st.countTokens());
	}
	public void smalltocapital()
	{
		System.out.println("Given string:"+s);
		System.out.println("String after conversion:"+s.toUpperCase());
	}
	public void stringreplace()
	{
		//converting second occurrence of l into L from s1
		System.out.println("Given string:"+s5);
		System.out.println("String after converting:"+s5.replace("ll", "lL"));
		
	}
	public void capital()

	{
			System.out.println("given string:"+s1);
			String sub = s1.substring(4, 8).toUpperCase();
			String sub1 = s1.substring(0,4);
			String sub2=s1.substring(8);
			System.out.println("string after conversion:"+sub1+sub+sub2);
	}
	
public static void main(String[] args) {
		Assignment3 obj=new Assignment3();
		obj.Charatindex();
		obj.string1stlettercapital();
		obj.stringcontains();
		obj.stringends();
		obj.countwords();
		obj.smalltocapital();
		obj.stringreplace();
		obj.capital();
		
		
	}

}