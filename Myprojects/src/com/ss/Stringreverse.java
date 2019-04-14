package com.ss;

import java.util.Arrays;

public class Stringreverse {
	
	public static void main(String[] args) {
		
		String s="i am suneel",str1="";
		
String	[]b	=s.split(" ");

for(String c:b){
	//System.out.println(c);
str1=str1+c;
}
StringBuffer sb=new StringBuffer(str1);


sb.reverse();
String str=sb.toString();
int start=0,end=0;;
System.out.println("b:"+Arrays.toString(b));
System.out.println("str:"+str);

for(int i=0;i<b.length;i++){
	
	end=end+b[i].length();
	
	System.out.print(str.substring(start,end)+" ");
	//System.out.println("start::"+start+"::end::"+end);
		
	
	start=end;
	//System.out.print(start );
	
	
}
	}
}		