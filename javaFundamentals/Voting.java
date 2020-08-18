package javaFundamentals;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		System.out.print((n>=18)?"Eligible for voting":"Not Eligible for voting");
	}

}
