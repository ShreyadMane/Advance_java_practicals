import javax.swing.*;
import java.awt.*;

class MyJTextArea extends JFrame
{
	MyJTextArea()
	{
		JTextArea ta = new JTextArea("Enter your feedback here...", 20,20);
		ta.setBounds(50,50,300,300);
		ta.setLineWrap(true);
		ta.setFont(new Font("Courier", Font.BOLD, 30));
		add(ta);
		
		setLayout(null);
		setSize(500,500);
		setVisible(true);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	}
	
	public static void main(String args[])
	{
		new MyJTextArea();
	}
	
}