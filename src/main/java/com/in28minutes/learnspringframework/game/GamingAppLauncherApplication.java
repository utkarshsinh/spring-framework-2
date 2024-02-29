package com.in28minutes.learnspringframework.game;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.in28minutes.learnspringframework.game")
public class GamingAppLauncherApplication {
	
//	@Bean
//	public GamingConsole game() {
//		var game = new MarioGame();
//		return game;
//	}

	
//	@Bean
//	public GameRunner gameRunner(GamingConsole game) {
//		var gameRunner = new GameRunner(game);
//		return gameRunner;
//	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		var game = new MarioGame();
//		var game  = new Pacman(); // Creation of object
		
		try(var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)){
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
			
			for(String p: context.getBeanDefinitionNames()) {
				System.out.println(p);
			}
		}
		
		
		
		
		
		
//		var game = new SuperContraGame();
//		var gameRunner = new GameRunner(game);
//		
////		Object Creation + Wiring
////		game is a dependency of gameRunner 
//		gameRunner.run();
		

	}

}
