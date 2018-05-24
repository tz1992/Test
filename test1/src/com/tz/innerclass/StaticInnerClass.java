package com.tz.innerclass;

public class StaticInnerClass {
	
	int i=0;
 static int j=1;
//静态内部类可以使用public protected private 修饰	
 
 public static void main(String[] args) {
	 //新建静态内部类对象
	Inner inner=new StaticInnerClass.Inner();
	inner.s();
	System.out.println(inner.j);
	System.out.println(inner.i);
}
public static class Inner{
	//静态内部类可以定义静态或非静态成员
	static int j=0;
	int i=1;
	
	public void s(){
		System.out.println("外部："+StaticInnerClass.j);
		System.out.println("内部："+j);
		//  System.out.println(StaticInnerClass.i); 编译错误，内部静态类不能访问非静态成员
	}
}
}
