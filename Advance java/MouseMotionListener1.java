import java.awt.*;
import java.awt.event.*;   //step 1

class MouseMotionListener1 extends Frame implements MouseMotionListener //step 2
{
	MouseMotionListener1()
	{
		addMouseMotionListener(this);   //step 3
		setLayout(null);
		setSize(500,500);
		setTitle("MouseMotionListener Example");
		setVisible(true);
	}
	
	//step 4
	public void mouseDragged(MouseEvent e)
	{
		Graphics g = getGraphics();
		g.setColor(Color.green);
		g.fillOval(e.getX(), e.getY(), 10,20);
	}
	
	public void mouseMoved(MouseEvent e)
	{
	}
	
	
	
	public static void main(String s[])
	{
		new MouseMotionListener1();
	}
}