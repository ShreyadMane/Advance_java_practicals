import java.awt.*;
import java.awt.event.*;

public class MyButtonEvent implements ActionListener 
{
	public Frame f;
	public Button b;
	
	MyButtonEvent()
	{
		 f = new Frame("My Button");
		f.setSize(600,900);
		
		 b=new Button("CLICK HERE");
		b.setBounds(100, 100, 90, 50);
		f.add(b);
		b.addActionListener(this);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		b.setLabel("You Clicked Me !!!!!");
	}
	
	public static void main( String []args)
	{
		new MyButtonEvent();
	}
}