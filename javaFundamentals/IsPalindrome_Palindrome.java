package javaFundamentals;

import java.util.Scanner;

public class IsPalindrome_Palindrome {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] freqarr=new int[256];
		char[] arr=String.valueOf(n).toCharArray();
		for(char ch:arr)
		{
			freqarr[ch]++;
		}
		int oddcharcount=0;
		for(int ch:freqarr)
		{
			if(ch%2!=0)
			{
				oddcharcount++;
			}
			if(oddcharcount>1)
			{
				System.out.print("Not Possible");
				return;
			}
		}
		System.out.println("Palindrome possible");

	}

}
