/*
* Program: board.java
* Description: Game board for Pong.
* Author: Christian Vance
* Version: 1.0
* Last Modified: 07-23-2016
*/
// Imports:
import java.awt.*;
import java.applet.*;
import javax.swing.*;

// Program:
public class GameBoard extends JFrame{

	// Variables:
	private LeftPaddle lp = new LeftPaddle();
	private RightPaddle rp = new RightPaddle();
	private PongBall pb = new PongBall();
	// private JFrame f;
	private static final int WIDTH = 1000, HEIGHT = 700;

	public initiate(){
		super();
		setTitle("Pong by Christian Vance");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(WIDTH, HEIGHT);
		setLocation(300, 150);
		setVisible(true);
		setResizable(false);
		getContentPane().setBackground(Color.BLACK);
		getContentPane().add(lp);
		// f.getContentPane().add(new RightPaddle());
	}

	// Main:
	public static void main(String[] args){	
		new PongGameProg().initiate();
	}
}
//End 