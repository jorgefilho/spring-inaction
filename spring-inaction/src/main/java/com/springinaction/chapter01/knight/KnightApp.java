package com.springinaction.chapter01.knight;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class KnightApp {
	public static void main(String[] args) throws QuestFailException {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("knight.xml"));
		
		Knight knight = (Knight) factory.getBean("knight");
		
		knight.embarkOnQuest();

	}
}
