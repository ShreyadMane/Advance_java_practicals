import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code = "MouseEventApplet.class" height = 400 width =400>
</applet>
*/

public class MouseEventApplet extends Applet implements MouseListener
{
	public void init()
	{
		addMouseListener(this);
	}
	
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	
	public void mouseClicked(MouseEvent e)
	{
		int x = e.getX();
		int y = e.getY();
		showStatus(" X= " + x + " Y= " + y);
	}
	
	
}