import javax.swing.*;

class MyJButton extends JFrame
{
	MyJButton()
	{
		JButton b = new JButton("Click Here....");
		
		JButton bb = new JButton(new ImageIcon("next.jpg"));
		
		b.setBounds(100, 180, 150, 30);
		bb.setBounds(100, 280, 200, 100);
		
		add(b);
		add(bb);
		
		setLayout(null);
		setSize(500,500);
		setVisible(true);
		
	}
	
	public static void main(String args[])
	{
		new MyJButton();
	}
}