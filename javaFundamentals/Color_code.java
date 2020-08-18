package javaFundamentals;

import java.util.Scanner;

public class Color_code {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char ch=in.next().charAt(0);
		switch(Character.toLowerCase(ch))
		{
		case 'g':
			System.out.print("Green");
			break;
		case 'w':
			System.out.print("White");
			break;
		case 'r':
			System.out.print("Red");
			break;
		case 'b':
			System.out.print("Blue");
			break;
		case 'o':
			System.out.print("Orange");
			break;
		case 'y':
			System.out.print("Yellow");
			break;
		default:
			System.out.print("Invalid Code");
			break;
		}

	}

}
