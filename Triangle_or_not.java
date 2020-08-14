package javaFundamentals;

import java.util.Scanner;

public class Triangle_or_not {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		if(a+b>c || b+c>a || c+a>b)
		{
			System.out.print("Triangle");
		}
		else
		{
			System.out.print("Not a Triangle");
		}
	}

}
