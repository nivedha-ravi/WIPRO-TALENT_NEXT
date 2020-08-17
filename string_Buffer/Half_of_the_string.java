package string_Buffer;

import java.util.Scanner;

public class Half_of_the_string {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int n=s.length();
		if(n%2==0)
		{
			System.out.println(s.substring(0,n/2));
		}
		else
		{
			System.out.println("Null");
		}

	}

}
