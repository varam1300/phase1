package string;

import java.util.Date;

public class StringExp {

final String s ="";
	
	public void finalize() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello World";
		System.out.println(s1.length());
		
		String sub = new String("Welcome");
		System.out.println(sub.substring(0,0));
		
		String s2 = s1.concat(" Hari");
		System.out.println(s2);
		
		s2 += " From school";
		System.out.println(s2);
		
		System.out.println(s2.charAt(0));

		
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println(str1.compareTo(str2));
		
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str2);
		
		String st1 = new String("Hello");
		String st2 = new String("Hello");
		
		System.out.println(st1 == st2); 
		System.out.println(st1.equals(st2));
		
	
		System.out.println(st1.toUpperCase());
		
		System.out.println(st2.replace("H", "H"));
		
		String test = "Hell0! Hari";
		
		String[] str = test.split("!");
	
	
		StringBuffer sb = new StringBuffer();
		sb.append("Hello ");
		sb.append("world ");
		sb.append("Sweety!");
		sb.append("Prashu");
		
		
		System.out.println(sb.toString());
		
		
		String t1 = "Sweety";
		String t2 = "Prashu";
				
		System.out.println(t1.equalsIgnoreCase(t2));
		
		String a1 = "hari";
		
		String a2 = a1;
		
		System.out.println(a1 == a2);
		

	}
	
}
