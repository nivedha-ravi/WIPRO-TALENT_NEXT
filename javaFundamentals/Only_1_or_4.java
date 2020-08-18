package javaFundamentals;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Only_1_or_4 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		Set<Integer> a=new HashSet<>();
		for(int i=0;i<n;i++)
		{
			a.add(in.nextInt());
		}
		if(a.contains(1) && a.contains(4) && a.size()==2)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}

	}

}
