package javaFundamentals;

import java.util.Scanner;

public class Comma_separated_string {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int flag=0;
		while(in.hasNext())
		{
			System.out.print(in.next());
			if(in.hasNext())
			{
				System.out.print(",");
			}
			flag=1;
		}
		if(flag==0)
		{
			System.out.print("No Values");
		}
		

	}

}
