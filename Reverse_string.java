package javaFundamentals;

import java.util.Scanner;

public class Reverse_string {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char[] s=in.next().toCharArray();
		int len=s.length;
		for(int i=len-1;i>=0;i--)
		{
			System.out.print(s[i]);
		}

	}

}
