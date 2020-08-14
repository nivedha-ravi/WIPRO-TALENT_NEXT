package javaFundamentals;

import java.util.Scanner;

public class Sum_of_two_numbers_odd_or_even {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		System.out.print(((a+b)%2==0)?"Even":"Odd");
	}

}
