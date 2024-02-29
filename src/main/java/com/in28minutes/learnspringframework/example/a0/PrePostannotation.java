package com.in28minutes.learnspringframework.example.a0;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


@Component
class SomeClass{
	SomeDependency somedependency;
	
	public SomeClass(SomeDependency somedependency) {
		this.somedependency = somedependency;
		System.out.println("All dependencies are ready");
	}
	
	@PostConstruct
	public void initialize() {
		somedependency.getReady();
	}
	
	@PreDestroy
	public void cleanup() {
		System.out.println("Cleaning up");
	}
}

@Component
class SomeDependency{
	public void getReady() {
		System.out.println("somedependency get ready");
	}
}

@Configuration
@ComponentScan
public class PrePostannotation {
	

	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(PrePostannotation.class)){
			
			for(String p: context.getBeanDefinitionNames()) {
				System.out.println(p);
			}
			
			
		}


	}

}
