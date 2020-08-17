package string_Buffer;

import java.util.Scanner;

public class Short_and_Long {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String a=in.next();
		String b=in.next();
		String sho=(a.length()<b.length())?a:b;
		String lo=(a.length()>b.length())?a:b;
		System.out.print(sho+lo+sho);
	}

}
