package javaFundamentals;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int y=in.nextInt();
		if(y%400==0 || (y%100!=0 && y%4==0))
		{
			System.out.print("Leap Year");
		}
		else
		{
			System.out.print("Not a Leap Year");
		}

	}

}
