package com.tz.test;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class A {
	
	private static String b;
	{
		System.out.println("A1");
		
		
	}
	
	static{
		System.out.println("A2");
	}
	
	public A(){
		System.out.println("A3");
	}
	
	public static void get(){
		System.out.println("xixi");
	}
	public static void main(String[] args) {
	A a=null;
	a.get();
	}
}
