import javax.swing.*;
import java.awt.*;

class MyJMenubar extends JFrame
{
	MyJMenubar()
	{
		JMenuBar mb = new JMenuBar();
		
		JMenu h = new JMenu("Hostel");
		
		JMenuItem a = new JMenuItem("Kaveri");
		JMenuItem b = new JMenuItem("Godavari");
		JMenuItem c = new JMenuItem("Indrayani");
		JMenuItem d = new JMenuItem("Chandrabhaga");
		
		// add JMenuItem to JMenu
		h.add(a);  
		h.add(b);
		h.add(c);  
		h.add(d);
		
		// JMenu to JMenuBar
		mb.add(h);
		
		setJMenuBar(mb);
		
		setLayout(null);
		setSize(500,500);
		setVisible(true);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	}
	
	public static void main(String args[])
	{
		new MyJMenubar();
	}
	
}