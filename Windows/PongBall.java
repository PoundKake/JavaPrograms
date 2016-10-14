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
	private LeftPaddle lp = new LeftPaddle();
	private RightPaddle rp = new RightPaddle();

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
		x += dx;
		y += dy;

		if(x < 0){
			dx = -dx;
		}

		if(y < 0){
			dy = -dy;
		}

		if(x > PongGameProg.WIDTH - 26){
			dx = -dx;	
		}
		
		if(y > PongGameProg.HEIGHT - 50){
			dy = -dy;
		}

		if(rpcollision()){
			dx = -dx;
			dy = -dy;
		}

		if(lpcollision()){
			dx = -dx;
			dy = -dy;
		}
	}

	// Draw:
	public void draw(Graphics2D g){
		g.setColor(Color.CYAN.darker());
		g.fillOval(x, y, bsize, bsize);
	}

	// // Left Paddle Collision:
	// public boolean lpcollision(){
	// 	return lp.getBounds().intersects(lp.getBounds());
	// }

	// // Right Paddle Collision:
	// public boolean rpcollision(){
	// 	return rp.getBounds().intersects(lp.getBounds());
	// }
}//End 