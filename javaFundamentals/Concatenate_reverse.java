package javaFundamentals;

import java.util.Scanner;

public class Concatenate_reverse {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		String s1=in.next();
		StringBuilder sb=new StringBuilder(s1);
		System.out.print(s+sb.reverse());
	}

}
