import javax.swing.*;
import java.awt.*;

class pra8que3 extends JFrame
{
	pra8que3()
	{
		String columns[] = {"Name of students", "Marks", "Grades"};
		
		String data[][]= {
							{  "shreya mane", "90","A"},
							{"vidhya patil", "92","A"},
							{"sanika patil", "87","B"},
							{"amruta patil", "78","C"},
							{"shraddha koparde", "98","A"},
							{"mayuri kubhar", "75","c"},
							{"anuradha patil", "83","B"},
							{"shraddha patil", "97","A"},
							{"ankita patil", "89","B"},
							{"dipali Aasabe", "78","C"}
							
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
		new pra8que3();
	}
}