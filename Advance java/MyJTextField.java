import javax.swing.*;
import java.awt.*;

class MyJTextField extends JFrame
{
	MyJTextField()
	{
		JPanel jp = new JPanel();
		
		jp.setBounds(10,10, 490,490);
		jp.setBackground(Color.green);
		
		JTextField tf = new JTextField(10);
		tf.setBounds(100,100,200,30);
		
		jp.add(tf);  //adding textfield on panel
		
		add(jp);  //adding panel on frame
		
		setLayout(null);
		setSize(500,500);
		setVisible(true);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	}
	
	public static void main(String args[])
	{
		new MyJTextField();
	}
	
}