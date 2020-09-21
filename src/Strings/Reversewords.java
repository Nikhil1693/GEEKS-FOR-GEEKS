package Strings;

import java.util.regex.Pattern;

public class Reversewords {
	
	public static void Reverse(String s) {
		
		Pattern p=Pattern.compile("\\s");
		
		String [] temp=p.split(s);
		String result="";
		
		for(int i=temp.length-1;i>=0;i--) {
			result=result+" "+temp[i];
		}
		
		System.out.println(result.toLowerCase());
		
	}

	public static void main(String[] args) {
		
		String str="Welcome to geeks for geeks";
		Reverse(str);

	}

}
