package com.tz.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main4 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int num=in.nextInt();
	int len=num/2;
	List<Integer[]> list=new ArrayList<Integer[]>();
	for (int i = 0; i < len; i++) {
		if(isTrueNum(i+1)&&isTrueNum(num-i-1)){
			list.add(new Integer[]{i+1,num-i-1});
		}
	}
	System.out.println(list.size());
}




public static boolean isTrueNum(int n){
	int temp=n;
	for(int i=2;i<n;i++){
		if(n%i==0){
			temp--;
		}
	}
	if(temp==n){
		return true;
	}else{
		return false;
	}
}
}
