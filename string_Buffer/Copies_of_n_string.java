package string_Buffer;

import java.util.Scanner;

public class Copies_of_n_string {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int n=s.length();
		for(int i=0;i<n;i++)
		{
			System.out.print(s.substring(0,2));
		}

	}

}
