package practice;

import java.util.Scanner;

public class CheckStringRev {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter input string");
		String inputStr = sc.nextLine();
	    char[] strInChar = inputStr.toCharArray();
	    String revStr = "";
	    for(int i=strInChar.length-1;i>=0;i--)
	    {
	    	 revStr = revStr + strInChar[i];
	    	 System.out.println(revStr);
	    }
	    System.out.println("reverse string is "+revStr);
		
	}

}
