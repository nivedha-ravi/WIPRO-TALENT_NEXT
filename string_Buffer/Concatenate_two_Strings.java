package string_Buffer;

import java.util.Scanner;

public class Concatenate_two_Strings {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		String s1=in.next();
		if(s1.charAt(0)==s.charAt(s.length()-1))
		{
			System.out.print((s.substring(0,s.length()-1)+s1).toLowerCase());
		}
		else
		{
			System.out.print((s+" "+s1).toLowerCase());
		}

	}

}
