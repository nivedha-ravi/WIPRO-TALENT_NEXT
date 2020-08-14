package javaFundamentals;

import java.util.Scanner;

public class Positive_negative_zero {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		if(n<0)
		{
			System.out.print("Negative");
		}
		else if(n>0)
		{
			System.out.print("Positive");
		}
		else
		{
			System.out.print("Zero");
		}

	}

}
