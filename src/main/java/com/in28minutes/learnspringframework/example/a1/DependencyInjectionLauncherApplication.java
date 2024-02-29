package com.in28minutes.learnspringframework.example.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;



@Component
class YourBusinessClass{
	//Field Injection
	
	Dependency1 dependency1;
	
	Dependency2 dependency2;
	
@Autowired
public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}


//	@Autowired
//	public void setDependency1(Dependency1 dependency1) {
//		this.dependency1 = dependency1;
//	}
//
//
//	@Autowired
//	public void setDependency2(Dependency2 dependency2) {
//		this.dependency2 = dependency2;
//	}
//


	public String toString() {
		return "Using Dependency" + " " + dependency1 + " " + dependency2;
		
	}
	
}

@Component
class Dependency1{

}

@Component
class Dependency2{

}



@Configuration
@ComponentScan
public class DependencyInjectionLauncherApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		var game = new MarioGame();
//		var game  = new Pacman(); // Creation of object
		
		try(var context = new AnnotationConfigApplicationContext(DependencyInjectionLauncherApplication.class)){
			
			for(String p: context.getBeanDefinitionNames()) {
				System.out.println(p);
			}
			
			System.out.println(context.getBean(YourBusinessClass.class));
			
		}
		
		
		
		
		
		
//		var game = new SuperContraGame();
//		var gameRunner = new GameRunner(game);
//		
////		Object Creation + Wiring
////		game is a dependency of gameRunner 
//		gameRunner.run();
		

	}

}
