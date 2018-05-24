package com.tz.concurrent;

public class Stage extends Thread {
@Override
public void run() {
	System.out.println("开始");
	
	try {
		Thread.sleep(3000);
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Army po=new Army(); 
	Army ne=new Army(); 
	Thread t1=new Thread(po,"正");
	Thread t2=new Thread(ne,"反");
	t1.start();
	t2.start();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	Thread thread=new keyPerson();
	thread.setName("cyj");
	thread.start();
	try {
		thread.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	ne.setFlag(false);
	po.setFlag(false);
    try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    System.out.println("结束");
}
public static void main(String[] args) {
	new Stage().start();
}
}
