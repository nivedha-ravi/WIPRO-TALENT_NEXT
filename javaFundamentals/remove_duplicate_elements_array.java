package javaFundamentals;


import java.util.*;

public class remove_duplicate_elements_array {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=-1;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]!=-1)
			{
			System.out.println(a[i]+" ");
			}
		}
		
	}

}
