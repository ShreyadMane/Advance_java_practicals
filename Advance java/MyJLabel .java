import javax.swing.*;

class MyJLabel extends JFrame
{
	MyJLabel()
	{
		JLabel l1 = new JLabel("Computer Engineering");
		JLabel l2 = new JLabel("Information Technology");
		
		l1.setBounds(100, 100, 150,30);
		l2.setBounds(100, 180, 150, 30);
		
		add(l1);
		add(l2);
		
		setLayout(null);
		setSize(500,500);
		setVisible(true);
		
	}
	
	public static void main(String args[])
	{
		new MyJLabel();
	}
}