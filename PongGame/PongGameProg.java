/*
* Program: PongGameProg.java
* Description:  A remake of the classic arcade game Pong.
* Author: Christian Vance
* Version: 1.0
* Last Modified: 07-23-2016
*/

// Imports:
// Import java.awt.*;
import javax.swing.JFrame;

// Program:
public class PongGameProg{
	// Variables:
	public static final int WIDTH = 1000, HEIGHT = 700;

	// Main:
	public static void main(String[] args){
		// Local Variables:
		JFrame f = new JFrame("Pong by Christian Vance");
		PongPanel _pp = new PongPanel();

		// Construction:
		f.getContentPane().add(_pp);
		f.setSize(WIDTH, HEIGHT);
		f.setLocation(300, 150);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.setResizable(false);

		// Starts the game.
		_pp.play();
	}
}//End
