package string_Buffer;

import java.util.Scanner;

public class N_repetitions_N_lastCharacters {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print(s.substring(s.length()-3,s.length()));
		}

	}

}
