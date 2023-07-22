import java.awt.*;
 import java.awt.event.*; 
 import java.applet.*; 
 /*<applet code="Practical_11" width=300 height=300></applet>*/
 public class Practical_11 extends Applet implements MouseListener,MouseMotionListener 
{ 
 	String msg = "";  	
	int mouseX = 0,
	mouseY = 0;  	
	public void init() 
 	{ 
 	 	addMouseListener(this);  	 	addMouseMotionListener(this); 
 	} 
 	public void mouseClicked(MouseEvent e) 
 	{ 
 	 	msg = "Mouse Clicked."; 
 	 	repaint(); 
 	} 
 	public void mouseEntered(MouseEvent e) 
 	{ 
 	 	mouseX = 0;  	 	mouseY = 10; 
 	 	msg = "Mouse Entered.";  	 	repaint(); 
 	} 
 	public void mouseExited(MouseEvent e) 
 	{ 
 	 	mouseY = 0; 
 	 	mouseY = 10; 
 	 	msg = "Mouse Exited.";  	 	repaint(); 
 	} 
 	public void mousePressed(MouseEvent e) 
 	{ 
 	 	mouseX = e.getX();  	 	
		mouseY = e.getY();  	 
		msg = "Mouse Pressed.";  	 
		repaint(); 
 	} 
 	public void mouseReleased(MouseEvent e) 
 	{ 
 	 	mouseX = e.getX(); 
		mouseY = e.getY();  	 	
		msg = "Mouse Released."; 
 	 	repaint(); 
 	} 
 	public void mouseDragged(MouseEvent e) 
 	{ 
 	 	mouseX = e.getX();  	
		mouseY = e.getY();  	
		msg = "Mouse Dragged.";  	
		repaint(); 
 	} 
 	public void mouseMoved(MouseEvent e) 
 	{ 
 	 	mouseX = e.getX();  
	 	mouseY = e.getY(); 
        msg = "Mouse Moved at"+e.getX()+" , "+e.getY(); 
 	 	repaint(); 
 	} 
 	public void paint(Graphics g) 
 	{ 
 	 	g.drawString(msg,mouseX,mouseY); 
 	} 
}