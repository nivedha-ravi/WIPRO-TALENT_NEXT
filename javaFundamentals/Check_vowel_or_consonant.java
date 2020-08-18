package javaFundamentals;

import java.util.Scanner;

public class Check_vowel_or_consonant {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char ch=Character.toLowerCase(in.next().charAt(0));
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.print("Vowel");
		}
		else
		{
			System.out.print("Consonant");
		}

	}

}
