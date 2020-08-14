package javaFundamentals;

import java.util.Scanner;

public class Convert_case {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char ch=in.next().charAt(0);
		if(Character.isLowerCase(ch))
		{
			System.out.print(Character.toUpperCase(ch));
		}
		else
		{
			System.out.print(Character.toLowerCase(ch));
		}

	}

}
