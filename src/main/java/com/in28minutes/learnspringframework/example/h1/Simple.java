package com.in28minutes.learnspringframework.example.h1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class Simple {
	

	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(Simple.class)){
			
			for(String p: context.getBeanDefinitionNames()) {
				System.out.println(p);
			}
			
			
		}


	}

}
