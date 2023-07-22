import javax.swing.*;
import java.awt.*;

class MyJScrollPane extends JFrame
{
	MyJScrollPane()
	{
		JTextArea ta = new JTextArea("Enter your feedback here...", 20,20);
		//ta.setBounds(50,50,400,400);

		ta.setFont(new Font("Courier", Font.BOLD, 30));
		
		JScrollPane js = new JScrollPane(ta);
		js.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		js.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		js.setBounds(100,100,250,250);	
		add(js);
					
		setLayout(null);
		setSize(600,600);
		setVisible(true);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	}
	
	public static void main(String args[])
	{
		new MyJScrollPane();
	}
	
}