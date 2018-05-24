package com.tz.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static class Dog {
		int age;
		String name;

		public Dog(int age, String name) {
			this.age = age;
			this.name = name;
		}

	}

	public static void main(String[] args) {
       Dog[]dogs=new Dog[3];
       dogs[0]=new Dog(5, "a");
       dogs[1]=new Dog(3, "b");
       dogs[2]=new Dog(3, "c");
       Arrays.sort(dogs, new Comparator<Dog>(){

		@Override
		public int compare(Dog o1, Dog o2) {
			// TODO Auto-generated method stub
			return o1.age-o2.age;
		}
		
    	   
       });
       for (int i = 0; i < dogs.length; i++) {
		System.out.println(dogs[i].age+dogs[i].name);
	}
	}

}
