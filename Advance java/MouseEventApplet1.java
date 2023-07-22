import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code = "MouseEventApplet1.class" height=400 width=400>
</applet>
*/

public class MouseEventApplet1 extends Applet implements MouseListener
{
	int x, y;
	String str=" ";
	
	public void init()
	{
		addMouseListener(this);
	}
	
	public void paint(Graphics g)
	{
		g.drawString( str,x,y);
	}
	
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	
	public void mouseClicked(MouseEvent e)
	{
		x= e.getX();
		y = e.getY();
		str = " X = " + x + " Y = " + y;
		repaint();
	}
		
}