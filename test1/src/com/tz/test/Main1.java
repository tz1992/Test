package com.tz.test;

import java.util.Scanner;

public class Main1 {
	
			
	
public static void main(String[] args) {
	System.out.println(produceNewString(1, "abc"));
	System.out.println(backString("abc"));
}

public static String produceNewString(int i,String s){
    String s1=s.substring(0,i);
    String s2=s.substring(i);
    return s1+"_"+s2;
}

public static String backString(String s){
	char[]arr=s.toCharArray();
	String back="";
	for (int i = arr.length-1; i >= 0; i--) {
		back+=arr[i];
	}
	return back;
}

}
