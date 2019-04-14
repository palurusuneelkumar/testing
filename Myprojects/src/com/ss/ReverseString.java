package com.ss;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String d="",h="hi bbbb hhhk";
		
		    String[] arr = h.split(" ");
		    StringBuffer sb = new StringBuffer();

		    for (int i = 0; i < arr.length; i++) {
d =""+(sb.append(Character.toUpperCase(arr[i].charAt(0)))
		            .append(arr[i].substring(1)).append(" "));
		    }          
		  System.out.println(d);    
	}
	   
   
}