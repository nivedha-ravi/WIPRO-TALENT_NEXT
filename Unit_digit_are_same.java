package javaFundamentals;

import java.util.Scanner;

public class Unit_digit_are_same {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		if(a%10==b%10)
		{
			System.out.print("True");
		}
		else
		{
			System.out.print("False");
		}
	}

}
