package com.tz.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
public static void main(String[] args) {
	/*
	 * 当使用FixedThreadPool的时候，核心线程数等于最大线程数，当submit的线程数量大于指定的核心数的时候
	 * 多余core的线程会进入阻塞队列等待
	 * 当core==2的时候，两个线程会交替执行
	 * 输出线程二正在执行第0此任务
                   线程一正在执行第0此任务
                   线程二正在执行第1此任务
                   线程一正在执行第1此任务
        当core==1的时候，会执行core里面的线程，当这个线程执行结束之后，才会执行队列的线程
       输出：
      线程一正在执行第0此任务
      线程一正在执行第1此任务
      线程二正在执行第0此任务
      线程二正在执行第1此任务
 
	 */
ExecutorService executorService=Executors.newFixedThreadPool(1);
MyThread t1=new MyThread("线程一");
MyThread t2=new MyThread("线程二");
MyThread t3=new MyThread("线程三");
MyThread t4=new MyThread("线程四");
MyThread t5=new MyThread("线程五");
executorService.submit(t1);
executorService.submit(t2);
executorService.shutdown();

}


private static class MyThread implements Runnable{
	String name;
	
	 public MyThread(String name) {
		// TODO Auto-generated constructor stub
		 this.name=name;
		 
	}

	@Override
	public void run() {
		while (true) {
			for(int i=0;i<2;i++){
				System.out.println(name+"正在执行第"+i+"此任务");
			}
			
		}
		
		
		
		
	}
	
}
}
