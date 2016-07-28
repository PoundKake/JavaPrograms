/*
* Program: PongGameProg.java
* Description:  A remake of the classic arcade game Pong.
* Author: Christian Vance
* Version: 1.0
* Last Modified: 07-23-2016
*/
// Imports:
import java.awt.*;
import java.applet.*;
import javax.swing.*;

// Program:
public class PongGameProg extends JFrame{

	// Variables:
	private LeftPaddle lp = new LeftPaddle();
	private RightPaddle rp = new RightPaddle();
	private PongBall pb = new PongBall();
	private JFrame f;
	private static final int WIDTH = 1000, HEIGHT = 700;

	//Construction:
	public void initiate(){
		// Game board:
		f = new JFrame();
		f.setTitle("Pong by Christian Vance");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(WIDTH, HEIGHT);
		f.setLocation(300, 150);
		f.setVisible(true);
		f.setResizable(false);
		f.getContentPane().setBackground(Color.BLACK);
		f.getContentPane().add(lp);
		f.getContentPane().add(lp);
		// f.getContentPane().add(new RightPaddle());
	}

	// Main:
	public static void main(String[] args){	
		new PongGameProg().initiate();
	}
}
//End 
