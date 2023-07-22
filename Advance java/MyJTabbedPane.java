import javax.swing.*;
import java.awt.*;

class MyJTabbedPane extends JFrame
{
	MyJTabbedPane()
	{
		JTabbedPane t = new JTabbedPane();
		t.setBounds(50,50, 450,450);
		
		JPanel p1 = new JPanel();
		JButton b = new JButton("Click here...");
		p1.setSize(300,300);
		b.setBounds(100,100, 50, 30);
		p1.add(b);
		
		JPanel p2 = new JPanel();
		JLabel l = new JLabel("Information Technology");
		p2.setSize(300,300);
		l.setBounds(100,100, 50, 30);
		p2.add(l);
		
		JPanel p3 = new JPanel();
		JTextField tf = new JTextField(50);
		p3.setSize(300,300);
		tf.setBounds(100,100, 50, 30);
		p3.add(tf);
		
		
		
		t.add("Button", p1);
		t.add("Label", p2);
		t.add("TextBox", p3);
		
		add(t);
		
		
		setTitle("MY FRAME");
		setSize(700,600);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String s[])
	{
		new MyJTabbedPane();
	}
}