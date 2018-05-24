package com.tz.test;

import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
	
	public ReentrantLock lock=new ReentrantLock();
	
	public  void insert(){
		try {
			lock.lock();
			System.out.println("获取锁"+Thread.currentThread().getName());
		} finally {
			// TODO: handle finally clause
			
			lock.unlock();
			System.out.println("释放锁"+Thread.currentThread().getName());
		}
	}
	
	
public static void main(String[] args) {
	LockTest lockTest=new LockTest();
	for(int i=0;i<3;i++){
		new Thread(i+""){
			@Override
			public void run() {
				lockTest.insert();
			}
		}.start();;
	}
	
	
}
}
