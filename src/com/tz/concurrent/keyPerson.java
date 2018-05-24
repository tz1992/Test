package com.tz.concurrent;

public class keyPerson extends Thread {
@Override
public void run() {
	System.out.println("主角开始进攻");
	for(int i=0;i<10;i++){
		System.out.println(getName()+"fighting"+i);
	}
}
}
