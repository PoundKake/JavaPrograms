// Imports:
import java.awt.Color;
import java.awt.BasicStroke;
import java.awt.Graphics2D;

/**
 * Program: PongBall.java
 * Description: Pong ball for Pong Game.
 * Author: Christian Vance
 * Version: 1.1
 * Last Modified: 09-04-2018
 */

// Program:
public class PongBall
{
	// Variables:
    private static final int ball_size = 20;

	private int x, y, dx, dy;
	private int switch_case;

	// Construction:
	public PongBall()
    {
		x = 500;
		y = 350;
		dx = 1;
		dy = 4;
	}

	// // Update:
	// public void move()
    // {
	// 	setPosition();
	// }
    //
	// // Set Position:
	// public void setPosition()
    // {
	// 	/**
	// 	* TODO fix the switch case so it resets after exectuting.
	// 	*/
	// 	x += dx;	y += dy;
    //
	// 	if( x < 0 )
    //     {
	// 		switch_case = 1;
	// 	}
    //
	// 	if( y < 0 )
    //     {
	// 		switch_case = 2;
	// 	}
    //
	// 	if( x > main.getWidth() - 26 ){
	// 		switch_case = 1;
	// 	}
    //
	// 	if( y > main.getHeight() - 50 )
    //     {
	// 	 	switch_case = 2;
	// 	}
    //
	// 	// if(x <= RightPaddle.getClipBounds() || y <= RightPaddle.getClipBounds()){
	// 	// 	switch_case = 3;
	// 	// }
    //
	// 	if( x <= LeftPaddle.getBorder() || y <= LeftPaddle.getBorder() )
    //     {
	// 		switch_case = 3;
	// 	}
    //
	// 	else
    //     {
	// 		switch_case = 0;
	// 	}
    //
	// 	switch( switch_case )
    //     {
	// 		case 1: dx = -dx;
	// 		break;
    //
	// 		case 2: dy = -dy;
	// 		break;
    //
	// 		case 3: dx = -dx; dy = -dy;
	// 		break;
	// 	}
	// }

	// Draw:
	public void draw( Graphics2D g )
    {
		g.setColor( Color.CYAN.darker() );
		g.fillOval( x, y, ball_size, ball_size );
	}

} //End
