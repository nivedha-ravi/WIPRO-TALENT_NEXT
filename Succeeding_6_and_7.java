package javaFundamentals;

import java.util.ArrayList;
import java.util.Scanner;

public class Succeeding_6_and_7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); {
			ArrayList<Integer> a=new ArrayList<>();
			int n=in.nextInt();
			for(int i=0;i<n;i++)
			{
				a.add(in.nextInt());
			}
			int index_six=a.indexOf(6);
			int index_seven=a.indexOf(7);
			int sum=0;
			if(index_six<index_seven)
			{
				for(int i=0;i<a.size();i++)
				{
					if(a.get(i)!=6 && a.get(i)!=7)
					{
					sum+=a.get(i);
					}
				}
				System.out.println(sum);
			}
			else
			{
				for(int i=0;i<a.size();i++)
				{
					sum+=a.get(i);
				}
				System.out.print(sum);
			}
		}
		
	}

}
