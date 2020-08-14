package javaFundamentals;

import java.util.Scanner;

public class Display_number_in_words {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char[] ch=in.next().toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			switch(ch[i])
			{
			case '1':
				System.out.print("one ");
				break;
			case '2':
				System.out.print("two ");
				break;
			case '3':
				System.out.print("three ");
				break;
			case '4':
				System.out.print("four");
				break;
			case '5':
				System.out.print("five ");
				break;
			case '6':
				System.out.print("six ");
				break;
			case '7':
				System.out.print("seven ");
				break;
			case '8':
				System.out.print("eight ");
				break;
			case '9':
				System.out.print("nine");
				break;
			default:
				System.out.print("zero ");
				break;
			}
		}
	}

}
