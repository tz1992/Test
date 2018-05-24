package com.fiberhome.practice.reflect.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.fiberhome.practice.reflect.entity.Person;
import com.fiberhome.practice.reflect.entity.Xperson;

public class TestProxy {
	public static void main(String[] args) {
		//测试类获取xperson对象
		Person person = new Xperson();
		//形成代理对象
		Person person2 = (Person) ProxyFactory.getProxy(person);
		person2.say("xixi");
		person2.walk();
	}
}
