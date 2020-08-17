package string_Buffer;

import java.util.Scanner;

public class Delete_before_and_after_asterisk {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int asteriskindex=s.indexOf('*');
		StringBuffer sb=new StringBuffer(s);
		sb.delete(asteriskindex-1,asteriskindex+2);
		System.out.print(sb);
	}

}
