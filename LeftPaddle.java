/*
* Program: LeftPaddle.java
* Description: Left paddle for Pong Game.
* Author: Christian Vance
* Last Modified: 07-23-2016
*/
// Imports:
import java.awt.*;
import java.applet.*;
import javax.swing.*;

// Program:
public class LeftPaddle extends Applet{
	//Variables:
	private static final int X_BOUND = 30, Y_BOUND = 30, WIDTH = 30, HEIGHT = 150;
	private Rectangle leftP, rightP;
	private int lx, rx, ly, ry;

	//Construction: 
	public void paint(Graphics l){	
		l.setColor(Color.WHITE);
		l.fillRect(970 - X_BOUND, Y_BOUND, WIDTH, HEIGHT);		//Right Rectangle 
		l.fillRect(X_BOUND, Y_BOUND,WIDTH, HEIGHT);			//Left Rectangle
	}	
}
//End 