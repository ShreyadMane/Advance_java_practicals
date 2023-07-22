import javax.swing.*;
import java.awt.*;

class MyJCheckBox extends JFrame
{
	MyJCheckBox()
	{
		JCheckBox c1 = new JCheckBox("Ice-Cream");
		JCheckBox c2 = new JCheckBox("Pizza");
		JCheckBox c3 = new JCheckBox("Chicken Biryani");

		
		c1.setBounds(100, 180, 150, 30);
		c2.setBounds(100, 280, 150,30);
		c3.setBounds(100, 380, 150,30);
		
		add(c1);
		add(c2);
		add(c3);
		
		setLayout(new FlowLayout());
		setSize(500,500);
		setVisible(true);
		
	}
	
	public static void main(String args[])
	{
		new MyJCheckBox();
	}
}