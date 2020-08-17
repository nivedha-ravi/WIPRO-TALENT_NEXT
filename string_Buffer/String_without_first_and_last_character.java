package string_Buffer;

import java.util.Scanner;

public class String_without_first_and_last_character {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		System.out.print(s.substring(1,s.length()-1));

	}

}
