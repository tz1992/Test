package com.tz.concurrent;

public class Army implements Runnable{
volatile boolean flag=true;
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+  "开始进攻");
		while(flag){
			for(int i=0;i<5;i++){
				System.out.println(Thread.currentThread().getName()+ "进攻"+i);
				Thread.yield();
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
