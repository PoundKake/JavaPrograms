/*
* Program: PongBall.java
* Description:  Pong ball for Pong Game.
* Author: Christian Vance
* Version: 1.0
* Last Modified: 07-23-2016
*/
// Imports:
import java.awt.Color;
import java.awt.BasicStroke;
import java.awt.Graphics2D;

// Program:
public class PongBall{
	// Variables:
	private int x, y, dx, dy;
	private final int bsize = 20;
	private int switchCase;

	// Construction:
	public PongBall(){
		x = 500;
		y = 350;
		dx = 1;
		dy = 4;
	}

	// Update:
	public void move(){
		setPosition();
	}

	// Set Position:
	public void setPosition(){
		/**
		* TODO fix the switch case so it resets after exectuting.
		*/
		x += dx;	y += dy;

		if(x < 0){
			switchCase = 1;
		}
		if(y < 0){
			switchCase = 2;
		}
		if(x > PongGameProg.WIDTH - 26){
			switchCase = 1;
		}
		if(y > PongGameProg.HEIGHT - 50){
		 	switchCase = 2;
		}
		// if(x <= RightPaddle.getClipBounds() || y <= RightPaddle.getClipBounds()){
		// 	switchCase = 3;
		// }
		if(x <= LeftPaddle.getBorder() || y <= LeftPaddle.getBorder()){
			switchCase = 3;
		}

		else {
			switchCase = 0;
		}

		switch(switchCase){
			case 1: dx = -dx;
			break;

			case 2: dy = -dy;
			break;

			case 3: dx = -dx;	dy = -dy;
			break;
		}
	}

	// Draw:
	public void draw(Graphics2D g){
		g.setColor(Color.CYAN.darker());
		g.fillOval(x, y, bsize, bsize);
	}

}//End
