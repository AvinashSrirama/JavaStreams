package com.streams.problems;
import java.util.Arrays;

public class StringMirror {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String s = "abcxyzcba";  // output abc
		  String s1 = "abcpabcsdba";  // output ab
		  String s2 = "abcefabda" ;  // output a
		  String s3 = "abcdabcgh";  // output null
		  
		  System.out.println(mirror(s1));

	}
	
	public static String mirror(String str) {
		
		String[] stringArray = str.split("");
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<stringArray.length;i++) {
			if(stringArray[i].equals(stringArray[stringArray.length-i-1])) {
				sb.append(stringArray[i]);
			}
			else 
				break;
		}
		return sb.toString();
		
	}

}
