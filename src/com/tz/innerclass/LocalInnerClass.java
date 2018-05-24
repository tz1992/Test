package com.tz.innerclass;
/*
 * 在方法中定义的内部类，与局部变量类似，范围为定义它的代码块
 * 需要使用内部类的时候，需要先生成对象，然后通过对象调用方法
 */
public class LocalInnerClass {
	int d=10;
	
public void f(int c){
	class Inner{
	//	static int a; 编译错误，在局部内部类中不能声明静态变量
		
		int a;
		 public Inner(int c) {
			f1(c);
		}
		public void f1(int c){
			System.out.println(c);
			System.out.println(d);
		}
	}
	new Inner(c);
}

public static void main(String[] args) {
	LocalInnerClass localInnerClass=new LocalInnerClass();
	localInnerClass.f(9);
}
}
