package com.fiberhome.practice.test;

import java.lang.reflect.Proxy;

import com.fiberhome.practice.proxy.Myinvocation;
import com.fiberhome.practice.reflect.test.MyinvocationHandle;
import com.fiberhome.practice.service.UserService;
import com.fiberhome.practice.service.impl.UserServiceImpl;

public class ProxyTest {
public static void main(String[] args) {
	UserService userService=new UserServiceImpl();
	Myinvocation myinvocation=new Myinvocation(userService);
	UserService proxy=(UserService) myinvocation.getNewInstance();
	proxy.say();
}
}
