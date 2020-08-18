package javaFundamentals;

import java.util.Scanner;

public class Type_of_triangle {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		if(a==b && b==c && c==a)
		{
			System.out.println("Equilateral Triangle");
		}
		else if(a==b||b==c||c==a)
		{
			System.out.print("Isoceles Triangle");
		}
		else
		{
			System.out.println("Scalene Triangle");
		}
	}

}
