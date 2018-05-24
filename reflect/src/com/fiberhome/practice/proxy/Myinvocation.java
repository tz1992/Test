package com.fiberhome.practice.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.junit.experimental.theories.Theories;

public class Myinvocation implements InvocationHandler {
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object,
	 * java.lang.reflect.Method, java.lang.Object[]) proxy:产生的代理对象
	 * method：代表正在执行的方法  args:表示调用方法的时候传入的实参
	 */
	private Object target;

	public Myinvocation(Object target) {

		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("正在执行的方法是：" + method);
		if (args != null) {
			for (Object value : args) {
				System.out.println(value);

			}
		} else {
			System.out.println("该方法没有参数");
		}
		System.out.println("before");
		Object result = method.invoke(target, args);
		System.out.println("after");
		return result;
	}
	
	public Object getNewInstance(){
		return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
				this.target.getClass().getInterfaces() , this);
	}

}
