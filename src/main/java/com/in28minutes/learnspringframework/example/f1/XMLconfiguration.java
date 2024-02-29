package com.in28minutes.learnspringframework.example.f1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;


 class XMLconfiguration {
	

	public static void main(String[] args) {
		
		try(var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")){
			
			for(String p: context.getBeanDefinitionNames()) {
				System.out.println(p);
			}
			
			
		}


	}

}
