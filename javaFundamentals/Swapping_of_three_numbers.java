package javaFundamentals;

import java.util.Scanner;

public class Swapping_of_three_numbers {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		a=a+b+c;
		b=a-b-c;
		c=a-b-c;
		a=a-b-c;
		System.out.format("a: %d b: %d c: %d",a,b,c);
	}

}
