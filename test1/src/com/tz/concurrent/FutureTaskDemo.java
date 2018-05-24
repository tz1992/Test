package com.tz.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureTaskDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		FutureTask<Integer>futureTask=new FutureTask<>(new Task());
		Thread thread=new Thread(futureTask,"taskThread");
		thread.start();
		Thread.sleep(3000);
		System.out.println(Thread.currentThread().getName()+"正在运行");
		
		if(futureTask.isDone()){
			System.out.println(futureTask.get());
		}
	}
	
	  
	
	
	
	
	
	
private static class Task implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+"正在运行");
		int result=0;
		for(int i=0;i<10;i++){
			result+=i;
		}
		return result;
	}
	
}
}
