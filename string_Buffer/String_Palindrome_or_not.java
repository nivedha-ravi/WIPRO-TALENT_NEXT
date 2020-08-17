package string_Buffer;

import java.util.Scanner;

public class String_Palindrome_or_not {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		StringBuffer sb=new StringBuffer(s);
		if(sb.toString().equalsIgnoreCase(sb.reverse().toString()))
		{
			System.out.print("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}

}
