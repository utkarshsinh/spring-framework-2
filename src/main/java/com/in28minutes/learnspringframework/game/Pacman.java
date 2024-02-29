package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pacman implements GamingConsole{
	public void up() {
		System.out.println("Pacman Jump");
	}

	public void down() {
		System.out.println(" Pacman Go into a hole");
	}
	
	public void left() {
		System.out.println(" Pacman Go back");
	}

	public void right() {
		System.out.println(" Pacman Accelerate");
	}


}
