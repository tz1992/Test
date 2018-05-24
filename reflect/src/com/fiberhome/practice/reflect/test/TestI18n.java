package com.fiberhome.practice.reflect.test;

import java.util.Locale;

import org.junit.Test;

public class TestI18n {
	@Test
	public void testI18N() {
		Locale[] locales = Locale.getAvailableLocales();
		for (int i = 0; i < locales.length; i++) {
			System.out.println(locales[i].getDisplayCountry());
		}
	}
}
