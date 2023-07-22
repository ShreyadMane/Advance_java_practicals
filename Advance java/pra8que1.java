import javax.swing.*;
import java.awt.*;

class pra8que1 extends JFrame
{
	pra8que1 ()
	{
		String columns[] = {"Rollno", "Name", "Marks"};
		
		String data[][]= {
							{"01" , "shreya mane", "90"},
							{"02", "vidhya patil", "92"},
							{"03" , "sanika patil", "97"},
							{"04", "amruta patil", "98"},
							{"05" , "shraddha koparde", "97"}
					     };
						 
		JTable t = new JTable(data, columns);
		JScrollPane js = new JScrollPane(t);
		js.setBounds(100,100,250,250);
		add(js);
		
		
		setTitle("JTable Example");
		setSize(600,600);
		setLayout(new FlowLayout());
		setVisible(true);
		
	}
	public static void main(String args[])
	{
		new pra8que1();
	}
}