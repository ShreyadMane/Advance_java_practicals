import javax.swing.*;
import java.awt.*;

class MyJRadio extends JFrame
{
	MyJRadio()
	{
		JLabel branch = new JLabel("Select Your Branch");
		branch.setBounds(100,50,200,50);
		
		JRadioButton rb1 = new JRadioButton("CO");
		JRadioButton rb2 = new JRadioButton("IF");
		JRadioButton rb3 = new JRadioButton("EJ");
		rb1.setBounds(100, 100, 200, 50);
		rb2.setBounds(100, 130, 200, 50);
		rb3.setBounds(100, 160, 200, 50);
		ButtonGroup g = new ButtonGroup();
		g.add(rb1);
		g.add(rb2);
		g.add(rb3);
		
		add(branch);
		add(rb1);
		add(rb2);
		add(rb3);
		
		JLabel year = new JLabel("Select Your year");
		year.setBounds(100,210,200,50);
		JRadioButton b1 = new JRadioButton("FY");
		JRadioButton b2 = new JRadioButton("SY");
		JRadioButton b3 = new JRadioButton("TY");
		b1.setBounds(100, 250, 200, 50);
		b2.setBounds(100, 280, 200, 50);
		b3.setBounds(100, 310, 200, 50);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(b1);
		bg.add(b2);
		bg.add(b3);
		
		add(year);
		add(b1);
		add(b2);
		add(b3);
		
		
		
		setLayout(null);
		setSize(500,500);
		setVisible(true);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	}
	
	public static void main(String args[])
	{
		new MyJRadio();
	}
	
}