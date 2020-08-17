package string_Buffer;

import java.util.Scanner;

public class Remove_x {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		if(s.indexOf('x')==0 && s.lastIndexOf('x')==s.length()-1)
		{
			System.out.print(s.substring(1,s.length()-1));
		}
		else
		{
			System.out.println(s);
		}

	}

}
