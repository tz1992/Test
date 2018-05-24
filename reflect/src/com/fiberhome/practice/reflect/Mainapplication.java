package com.fiberhome.practice.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.junit.Test;
import org.junit.validator.PublicClassValidator;

import com.fiberhome.practice.reflect.entity.User;

public class Mainapplication {
	
	@Test
	public void test(){
		String os = System.getProperty("os.name");
		System.out.println(os);
	}
	
	@Test
	public void test1() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
	Class<?> clazz=Class.forName("com.fiberhome.practice.reflect.entity.User");
	User   user  =  (User) clazz.newInstance();
	user.setId("1");
	System.out.println(user.getId());
	}
	
	public static void main(String[] args)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		User user = new User();
		user.setId("2");
		user.setName("xixi");
		user.setSex("male");

		// 获取user对象的所有方法
		Method[] methods = user.getClass().getMethods();

		for (Method method : methods) {
			if (method.getName().startsWith("get") && !(method.getName().equals("getClass"))) {
				// 调用方法
				System.out.println(method.invoke(user));
			}

		}
	}
}
