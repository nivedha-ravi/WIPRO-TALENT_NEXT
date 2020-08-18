package javaFundamentals;

import java.util.Scanner;

public class Positive_negative_count {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int pos=0,neg=0;
		while(n>=1)
		{
			int num=in.nextInt();
			if(num>0)
			{
				pos++;
			}
			else
			{
				neg++;
			}
			n--;
		}
		System.out.format("Positive: %d Negative: %d",pos,neg);

	}

}
