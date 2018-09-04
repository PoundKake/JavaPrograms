// Imports:
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Program: PongPanel.java
 * Description: Game panel for Pong.
 * Author: Christian Vance
 * Version: 1.1
 * Last Modified: 09-04-2018
 *
 * References:
 * 	Joel Rogness: https://www.youtube.com/playlist?list=PLn6h3KPOiM-ErYSmMH1ULtyKTE765d0V3
 */

// Program:
public class PongPanel extends JPanel
{
	// Variables:
	private final int PANEL_WIDTH = 30;
    private final int PANEL_HEIGHT = 145;

	private boolean running;

	private BufferedImage pic;
	private Graphics2D g;
	private PongBall pball = new PongBall();
	private LeftPaddle lpad = new LeftPaddle();
	private RightPaddle rpad = new RightPaddle();

	// Construction:
	public PongPanel()
    {
		initialize();
	}

	// Init:
	public void initialize()
    {
		running = true;
		pic = new BufferedImage( PongGameProg.WIDTH, PongGameProg.HEIGHT, BufferedImage.TYPE_INT_RGB );
		g = (Graphics2D) pic.getGraphics();
		g.setRenderingHint( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON );
	}

	// Play:
	public void play()
    {
		try
        {
			Thread.sleep(20);
		}

        catch( Exception e )
        {
			e.printStackTrace();
		}

		while( running )
        {
			update();
			draw();
			repaint();

			try
            {
				Thread.sleep(10);
			}

            catch(Exception e)
            {
				e.printStackTrace();
			}
		}
	}

	// Update:
	public void update()
    {
		// pball.move();
		// lpad.move();
		// rpad.move();
	}

	// Draw:
	public void draw()
    {
		g.setColor( Color.DARK_GRAY.brighter() );
		g.fillRect( 0, 0, PongGameProg.WIDTH, PongGameProg.HEIGHT );
		pball.draw( g );
		lpad.draw( g );
		rpad.draw( g );
	}

	// Paint Component:
	public void paintComponent( Graphics g )
    {
		Graphics2D g2 = (Graphics2D) g;
		g2.drawImage( pic, 0, 0, PongGameProg.WIDTH, PongGameProg.HEIGHT, null );
		g2.dispose();
	}

}//End
