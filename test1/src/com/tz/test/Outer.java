package com.tz.test;

public class Outer {
private int a=8;
public void say(){
	System.out.println(a);
}

class Inner{
	private int b=9;
	
	public void says(){
		System.out.println(Outer.this.a);
		System.out.println(b);
		say();
	}
}


public static void main(String[] args) {
	Outer.Inner inner=new Outer().new Inner();
	inner.says();
}
}
