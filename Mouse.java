package desktopgui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Mouse implements MouseListener, MouseMotionListener, MouseWheelListener {

	private static final int BUTTON_COUNT = 3;
	
	private Point mousePos;
	private Point currentPos;
	private boolean[] mouse;
	private int[] polled;
	private int notches;
	private int polledNotches;
	
	private int dx, dy;
	private Robot robot;
	private Component component;
	private boolean relative;
	
	public Mouse( Component component ) 
	{
		this.component = component;
		try {
			this.robot = new Robot();
		} catch( Exception e ) {
			// Handle exception [game specific]
			e.printStackTrace();
		}
	
		this.mousePos = new Point( 0, 0 );
		this.currentPos = new Point( 0, 0 );
		this.mouse = new boolean[ BUTTON_COUNT ];
		this.polled = new int[ BUTTON_COUNT ];
	}
	
	public synchronized void poll() 
	{
		if( this.isRelative() ) 
		{
			this.mousePos = new Point( dx, dy );
		} 
		else 
		{
			this.mousePos = new Point( currentPos );
		}
		this.dx = this.dy = 0;
	
		this.polledNotches = notches;
		this.notches = 0;
	
		for( int i = 0; i < this.mouse.length; ++i ) 
		{
			if( this.mouse[i] )
				this.polled[i]++;
			else 
				this.polled[i] = 0;
		}
	
	}
	
	public boolean isRelative() 
	{
		return this.relative;
	}
	
	public void setRelative( boolean relative ) 
	{
		this.relative = relative;
		if( this.relative ) 
			this.centerMouse();
	
	}
	
	public Point getPosition() 
	{
		return this.mousePos;
	}
	
	public int getNotches() 
	{
		return this.polledNotches;
	}
	
	public boolean buttonDown( int button ) 
	{
		return this.polled[ button - 1 ] > 0;
	}
	
	public boolean buttonDownOnce( int button ) 
	{
		return this.polled[ button - 1 ] == 1;
	}
	
	
	@Override public synchronized void mousePressed( MouseEvent e ) 
	{

	}
	
	@Override public synchronized void mouseReleased( MouseEvent e ) 
	{
	
	}
	
	@Override public void mouseClicked( MouseEvent e ) 
	{

	}
	
	@Override public synchronized void mouseEntered( MouseEvent e ) 
	{
		this.mouseMoved( e );
	}
	
	@Override public synchronized void mouseExited( MouseEvent e ) 
	{
		this.mouseMoved( e );
	}
	
	@Override public synchronized void mouseDragged( MouseEvent e ) 
	{
		this.mouseMoved( e );
	}
	
	@Override public synchronized void mouseMoved( MouseEvent e ) 
	{
		if( this.isRelative() ) 
		{
			Point p = e.getPoint();
			Point center = this.getComponentCenter();
			this.dx += p.x - center.x;
			this.dy += p.y - center.y;
			this.centerMouse();
		} 	
		else
			this.currentPos = e.getPoint();
	
	}
	
	@Override public synchronized void mouseWheelMoved( MouseWheelEvent e ) 
	{
		this.notches += e.getWheelRotation();
	}
	
	private Point getComponentCenter() 
	{
		int w = this.component.getWidth();
		int h = this.component.getHeight();
		return new Point( w / 2, h / 2 );
	}
	
	private void centerMouse() 
	{
		if( this.robot != null && this.component.isShowing() ) 
		{
			Point center = this.getComponentCenter();
			SwingUtilities.convertPointToScreen( center, this.component );
			this.robot.mouseMove( center.x, center.y );
		}
	}

}
