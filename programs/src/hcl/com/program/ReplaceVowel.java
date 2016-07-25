package hcl.com.program;

import java.util.Scanner;

public class ReplaceVowel {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		
		String result=str.replaceAll("[aeiouAEIOU]", "");
		
		System.out.println(result);
		
		in.close();
	}
}
