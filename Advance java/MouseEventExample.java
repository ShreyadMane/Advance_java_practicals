import java.awt.*;
import java.awt.event.*;    //step 1

class MouseEventExample extends Frame implements MouseListener  //step 2
{
	TextField t; 
	MouseEventExample()
	{
		t = new TextField("No Mouse Event");
		t.setBounds(100,100, 100,50);
		
		t.addMouseListener(this);   //step 3
		add(t);
		
		setLayout(null);
		setSize(500,500);
		setTitle("MouseListener Example");
		setVisible(true);
	}
	
	//step 4 
	public void mouseClicked(MouseEvent e)
	{
		t.setText("Mouse Clicked");
	}
	
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	
	public void mouseEntered(MouseEvent e)
	{
		t.setText("Mouse Entered");
	}
	public void mouseExited(MouseEvent e)
	{
		t.setText("Mouse Exited");
	}
	
	public static void main(String s[])
	{
		new MouseEventExample();
	}
}