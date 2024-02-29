package com.in28minutes.learnspringframework.example.d1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component
class ClassB{
	
}
@Component
@Lazy
class ClassA{
	ClassB classB;
	
	ClassA(ClassB classB){
		System.out.println("classB");
		this.classB = classB;
	}
	
	void doSomething() {
		System.out.println("Doing");
	}
	
}
@Configuration
@ComponentScan
public class LazyInitializationLauncher {
	

	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(LazyInitializationLauncher.class)){
			
//			for(String p: context.getBeanDefinitionNames()) {
//				System.out.println(p);
//			}
			context.getBean(ClassA.class).doSomething();
			
		}


	}

}
