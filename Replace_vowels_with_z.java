package javaFundamentals;

import java.util.Scanner;


public class Replace_vowels_with_z {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char[] ch=in.next().toCharArray();
		int flag=0;
		for(int i=0;i<ch.length;i++)
		{
			if(isVowel(Character.toLowerCase(ch[i])))
			{
				ch[i]='z';
				flag=1;
			}
		}
		System.out.println((flag==0)?new String(ch)+" No vowels":new String(ch));
	}

	public static boolean isVowel(char lowerCase) {
	
		return lowerCase=='a'||lowerCase=='e'||lowerCase=='i'||lowerCase=='o'||lowerCase=='u';
	}

}
