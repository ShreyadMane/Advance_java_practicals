import javax.swing.*;
import java.awt.*;

class MyJPassword extends JFrame
{
	MyJPassword()
	{
		JPasswordField psw = new JPasswordField("Hello",20);
		psw.setBounds(100,100,150, 30);
		psw.setEchoChar('*');
		add(psw);
		
		setLayout(null);
		setSize(500,500);
		setVisible(true);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	}
	
	public static void main(String args[])
	{
		new MyJPassword();
	}
	
}