package com.in28minutes.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	private GamingConsole game;
	
	public GameRunner( @Qualifier("Contra") GamingConsole game) {
		this.game = game;
		
	}
	
	@Bean
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running-" + game);
		game.up();
		game.down();
		game.left();
		game.right();
		
		
	}
	

}
