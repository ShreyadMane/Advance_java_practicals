import javax.swing.*;
import java.awt.*;

class MyJTable extends JFrame
{
	MyJTable()
	{
		String columns[] = {"Rollno", "Name", "Marks"};
		
		String data[][]= {
							{"1901" , "Nikita", "90"},
							{"1902", "Sandhya", "92"},
							{"1903" , "Ankita", "97"},
							{"1904", "Shweta", "98"},
							{"1905" , "Vaibhavi", "97"}
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
		new MyJTable();
	}
}