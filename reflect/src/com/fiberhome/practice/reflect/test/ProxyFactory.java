package com.fiberhome.practice.reflect.test;

import java.lang.reflect.Proxy;

public class ProxyFactory {
public static Object getProxy(Object target){
	MyinvocationHandle invocationHandler=new MyinvocationHandle();
	invocationHandler.setTarget(target);
	return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), 
			invocationHandler);
}
}
