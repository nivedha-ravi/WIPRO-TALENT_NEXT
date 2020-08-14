package javaFundamentals;

import java.util.Scanner;

public class Profit_or_Loss {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int sp=in.nextInt();
		int cp=in.nextInt();
		if(sp==cp)
		{
			System.out.print("No Profit or Loss");
		}
		else if(sp>cp)
		{
			System.out.println("Profit");
		}
		else
		{
			System.out.println("Loss");
		}

	}

}
