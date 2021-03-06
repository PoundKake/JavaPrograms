// Imports:
import java.awt.*;
import java.applet.*;
import javax.swing.*;

/**
 * Program: RightPaddle.java
 * Description: Right paddle for Pong Game.
 * Author: Christian Vance
 * Version: 1.1
 * Last Modified: 09-04-2018
 */

// Program:
public class RightPaddle
{
	//Variables:
	private int y, dy;
	private final int WIDTH = 30, HEIGHT = 150;

	//Construction:
	public RightPaddle(){
		y = 30;
		dy = 4;
	}

	// Update:
	public void move(){
		setPosition();
	}

	// Set Position:
	public void setPosition(){
		y += dy;

		if(y < 0){
			dy = -dy;
		}

		if(y > PongGameProg.HEIGHT - 175){
			dy = -dy;
		}
	}

	// Draw:
	public void draw(Graphics2D g){
		g.setColor(Color.CYAN.darker());
		g.fillRect(940, y, WIDTH, HEIGHT);
	}
}
//End
