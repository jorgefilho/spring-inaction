package com.springinaction.chapter01.hello;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class HelloApp {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("hello.xml"));
		
		GrettingService grettingService = (GrettingService) factory.getBean("grettingService");
		
		grettingService.sayGretting();
	}

}
