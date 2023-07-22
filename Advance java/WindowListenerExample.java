import java.awt.*;
import java.awt.event.*;   //step 1

class WindowListenerExample extends Frame implements WindowListener //step 2
{
	
	WindowListenerExample()
	{
				
		addWindowListener(this);   //step 3
		
		setLayout(null);
		setSize(500,500);
		setVisible(true);
	}
	
	//step 4
	public void windowActivated(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
	public void windowOpened(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowClosing(WindowEvent e)
	{
		dispose();
	}
	
			
	public static void main(String s[])
	{
		new WindowListenerExample();
	}
}