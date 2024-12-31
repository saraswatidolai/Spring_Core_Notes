package com.nit.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.sbeans.WishMessageGenerator;

public class GeneratorTest {
///src/com/nit/cfgs/AppConfig.xml
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nit/cfgs/AppConfig.xml");
		WishMessageGenerator bean = (WishMessageGenerator)ctx.getBean("wmg");
		System.out.println(bean.getMessage("Raja"));
		
	}
}
