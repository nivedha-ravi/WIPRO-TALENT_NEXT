package javaFundamentals;

import java.util.Scanner;

public class Characters_alphabetical_order {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char a=in.next().charAt(0);
		char b=in.next().charAt(0);
		if(a>b)
		{
			System.out.print(b+" "+a);
		}
		else
		{
			System.out.print(a+" "+b);
		}

	}

}
