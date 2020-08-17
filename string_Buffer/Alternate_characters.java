package string_Buffer;

import java.util.Scanner;

public class Alternate_characters {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char[] s1=in.next().toCharArray();
		char[] s2=in.next().toCharArray();
		int printed=0,prints1=0,prints2=0;
		while(printed<s1.length+s2.length)
		{
			if(prints1<s1.length)
			{
				System.out.print(s1[prints1]);
				prints1++;
				printed++;
			}
			if(prints2<s2.length)
			{
				System.out.print(s2[prints2]);
				prints2++;
				printed++;
			}
		}

	}

}
