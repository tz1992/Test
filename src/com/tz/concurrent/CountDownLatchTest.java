package com.tz.concurrent;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {
private static CountDownLatch countDownLatch=new CountDownLatch(5);
static class Boss extends Thread{
	@Override
	public void run() {
		System.out.println("老板已到，一共有"+countDownLatch.getCount()+"人参会");
		try {
			countDownLatch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("人已经到齐，开始开会");
	}
}

static class Worker extends Thread{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"已来");
		countDownLatch.countDown();
	}
}

public static void main(String[] args) throws InterruptedException {
	new Boss().start();
	Thread.sleep(1000);
	for(int i=0;i<countDownLatch.getCount();i++){
		new Worker().start();
	}
}
}
