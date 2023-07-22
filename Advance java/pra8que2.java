import javax.swing.*;
import java.awt.*;

class pra8que2 extends JFrame
{
	pra8que2()
	{
		String columns[] = {"ID", "Name", "salary"};
		
		String data[][]= {
							{"101" , "Amit", "670000"},
							{"102", "Jai", "780000"},
							{"103" , "Sachin", "700000"},
							
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
		new pra8que2();
	}
}