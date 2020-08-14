package javaFundamentals;

import java.util.Scanner;

public class Odd_or_Even {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		System.out.print((n%2!=0)?"Odd":"Even");
	}

}
