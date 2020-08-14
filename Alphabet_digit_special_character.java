package javaFundamentals;

import java.util.Scanner;

public class Alphabet_digit_special_character {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char ch=in.next().charAt(0);
		if(Character.isAlphabetic(ch))
		{
			System.out.print("Alphabet");
		}
		else if(Character.isDigit(ch))
		{
			System.out.print("Digit");
		}
		else
		{
			System.out.print("Special Character");
		}
	}

}
