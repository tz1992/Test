package com.tz.innerclass;
/*成员内部类的优点
 * 1，内部类作为外部类的成员，可以访问外部类的私有成员和属性
 * 2，
 * 
 * 
 */
public class MemberInnerClass {
	private int i=10;
	private static int j=100;
	
	int k=98;
	public static void opt3(){
		System.out.println("static");
	}
	public static void opt1(){
		System.out.println("static");
	}
	
	public void opt11(){
		System.out.println(" not static");
	}
	//外部类的非静态方法访问内部类的
	public void say(){
		Inner inner=new Inner();
		inner.opt1();
	}
	//外部静态方法访问成员内部类
	public static void says(){
		Inner inner=new MemberInnerClass().new Inner();
		inner.opt1();
	}
	
class Inner{
	public int i=19;
	//public static int p=0; 这样编译直接没有过，表明成员内部类是不能声明为static的
	public void opt1(){
		System.out.println(i);//直接访问内部的i
		System.out.println(MemberInnerClass.this.i);//访问外部的i
		System.out.println(k);//成员内部类可以直接访问成员变量
		System.out.println(j);//成员内部类可以访问外部类的static属性
		MemberInnerClass.opt1();//通过外部类.静态方法，可以访问外部类的静态方法
		opt3();//不论外面是静态方法还是成员方法都可以直接访问
		opt11();
	}
	
}


}
