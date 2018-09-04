// Imports:
// Import java.awt.*;
import javax.swing.JFrame;

/**
 * Program: PongGameProg.java
 * Description: A remake of the classic arcade game Pong for educational purposes.
 * Author: Christian Vance
 * Version: 1.1
 * Last Modified: 09-04-2018
 */

// Program:
public class PongGameProg
{
	// Variables:
	public static final int WIDTH = 1000;
    public static final int HEIGHT = 700;

    public int getWidth()
    {
        return WIDTH;
    }

    public int getHeight()
    {
        return HEIGHT;
    }

	// Main Method:
	public static void main( String[] args )
    {
		// Local Variables:
		JFrame frame = new JFrame( "Pong by Christian Vance" );
		PongPanel pong_panel = new PongPanel();

		// Construction:
		frame.getContentPane().add( pong_panel );
		frame.setSize( WIDTH, HEIGHT );
		frame.setLocation( 300, 150 );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setVisible( true );
		frame.setResizable( false );

		// Starts the game.
		pong_panel.play();
	}
}//End
