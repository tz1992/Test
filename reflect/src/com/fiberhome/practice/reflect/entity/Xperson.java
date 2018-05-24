package com.fiberhome.practice.reflect.entity;

public class Xperson implements Person {

	@Override
	public void walk() {
		System.out.println("123");

	}

	@Override
	public void say(String hello) {
		System.out.println("456");

	}

}
