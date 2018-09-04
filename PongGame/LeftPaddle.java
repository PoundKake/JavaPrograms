// Imports:
import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.util.*;

/*
 * Program: LeftPaddle.java
 * Description: Left paddle for Pong Game.
 * Author: Christian Vance
 * Version: 1.1
 * Last Modified: 09-04-2018
 */

// Program:
public class LeftPaddle extends JComponent
{
	//Variables:
    private static final int PADDLE_WIDTH = 30;
    private static final int PADDLE_HEIGHT = 150;
    // private Rectangle _bounds;

	public LeftPaddle paddle;
	private int y, dy;

	//Construction:
	public LeftPaddle()
    {
		y = 30;
		dy = 4;

		paddle = new LeftPaddle();
		paddle.setSize( PADDLE_WIDTH, PADDLE_HEIGHT );
		paddle.setLocation( 30, y );
		// paddle.setColor( Color.CYAN.darker() );
		this.add( paddle );

        // _bounds = new Rectangle( paddle.getBounds() );
	}

	// // Update:
	// public void move()
    // {
	// 	setPosition();
	// }
    //
	// // Set Postion:
	// public void setPosition()
    // {
	// 	y += dy;
    //
	// 	if( y < 0 ) {
	// 		dy = -dy;
	// 	}
    //
	// 	if( y > PongGameProg.HEIGHT - 175 )
    //     {
	// 		dy = -dy;
	// 	}
	// }



	public void add( JComponent comp )
    {
		super.add( comp );

    		// if( _bounds == null ) /*Then*/ _bounds = new Rectangle( comp.getBounds() );

		// else
        // {
        //     _bounds = _bounds.union(comp.getBounds() );
        // }

		// super.setBounds( _bounds );
	}

	// Draw:
	public void draw( Graphics2D g )
    {
		g.setColor( Color.CYAN.darker() );
		g.fillRect( 30, y, WIDTH, HEIGHT );
		// g.drawLine();
	}

}//End
