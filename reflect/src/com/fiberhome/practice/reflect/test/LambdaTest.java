package com.fiberhome.practice.reflect.test;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class LambdaTest {
	
	
	@Test
public void tedtLambda(){
		List features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
		features.forEach((n)->{
			System.out.println(n);
		});
		
};
}
