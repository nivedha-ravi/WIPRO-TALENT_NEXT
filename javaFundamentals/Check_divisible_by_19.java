package javaFundamentals;

import java.util.Scanner;

public class Check_divisible_by_19 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		System.out.print((n%19==0)?"Divisible by 19":"Not divisible by 19");

	}

}
