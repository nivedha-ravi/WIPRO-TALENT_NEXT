package javaFundamentals;

import java.util.Scanner;

public class Character_count {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char[] ch=in.next().toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!='\0')
			{
			int count=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]='\0';
				}
			}
			System.out.println(ch[i]+" "+count);
			}
		}
	}

}
