import java.awt.*;
import java.awt.event.*;

class MyWindowAdapter1 extends Frame 
{
	
	MyWindowAdapter1()
	{
					//anonymous class
		addWindowListener(
		new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				dispose();
			}
		}
		);
		

					
		setLayout(null);
		setSize(500,500);
		setVisible(true);	
		
	}
	
	public static void main(String args[])
	{
		new MyWindowAdapter1();
	}
	
}