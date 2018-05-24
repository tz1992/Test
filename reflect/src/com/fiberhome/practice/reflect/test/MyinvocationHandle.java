package com.fiberhome.practice.reflect.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyinvocationHandle implements InvocationHandler {
	
	/*
	 * proxy:动态代理对象
	 * method:正在执行的方法
	 * args:调用目标方法时传入的实参
	 * 
	 */
	
	private Object target;
	public void setTarget(Object target){
		this.target=target;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		PersonUntil until = new PersonUntil();
		until.name();
		//调用一次方法，就会调用一次invoke函数，此时的target就是xperson对象
		Object result = method.invoke(target, args);

		until.name1();
		return result;
	}
		// TODO Auto-generated method stub
	
}
