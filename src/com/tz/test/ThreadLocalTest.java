package com.tz.test;

public class ThreadLocalTest {
	
private static	long a =100L;
private static String bString="aa";
ThreadLocal<Long> threadLocal1=new ThreadLocal<>();
ThreadLocal<String>threadLocal2=new ThreadLocal<>();
public void set(){
	threadLocal1.set(a);
	threadLocal2.set(bString);
}
public long longGet(){
	return threadLocal1.get();
}
public String stringGet(){
	return threadLocal2.get();
}



public static void main(String[] args) throws InterruptedException {
	ThreadLocalTest test=new ThreadLocalTest();
	test.set();
	Thread thread=new Thread(new Runnable() {
		
		@Override
		public void run() {
			test.set();
	
		System.out.println(Thread.currentThread().getName()+test.longGet());
			System.out.println(Thread.currentThread().getName()+test.stringGet());
		}
	},"ni");
	thread.start();
	thread.join();
	System.out.println(Thread.currentThread().getName()+test.longGet());
	System.out.println(Thread.currentThread().getName()+test.stringGet());
}
}
