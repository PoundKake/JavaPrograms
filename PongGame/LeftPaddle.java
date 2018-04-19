/*
* Program: LeftPaddle.java
* Description: Left paddle for Pong Game.
* Author: Christian Vance
* Version: 1.0
* Last Modified: 07-23-2016
*/
// Imports:
import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.util.*;

// Program:
public class LeftPaddle extends JComponent{
	//Variables:
	private LeftPaddle paddle;
	private int y, dy;
	private final int WIDTH = 30, HEIGHT = 150;

	//Construction:
	public LeftPaddle(){
		y = 30;
		dy = 4;

		paddle = new LeftPaddle();
		paddle.setSize(WIDTH, HEIGHT);
		paddle.setLocation(30, y);
		paddle.setColor( Color.CYAN.darker() );
		this.add(paddle);
	}

	// Update:
	public void move(){
		setPosition();
	}

	// Set Postion:
	public void setPosition(){
		y += dy;

		if(y < 0){
			dy = -dy;
		}

		if(y > PongGameProg.HEIGHT - 175){
			dy = -dy;
		}
	}

	private Rectangle _bounds = null;
	public void add(JComponent comp){
		super.add(comp);
		if( _bounds == null )
			_bounds = new Rectangle( comp.getBounds() );
		else
			_bounds = _bounds.union(comp.getBounds() );
		super.setBounds( _bounds );
	}

	// Draw:
	public void draw(Graphics2D g){
		g.setColor(Color.CYAN.darker());
		g.fillRect(30, y, WIDTH, HEIGHT);
		// g.drawLine();
	}
}//End
