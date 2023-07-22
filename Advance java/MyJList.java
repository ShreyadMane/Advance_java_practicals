import javax.swing.*;
class MyJList extends JFrame
{
	MyJList()
	{
		String Dept[]= {"CE", "ME", "IF", "CO", "EJ"};
		JList l = new JList(Dept);
		l.setBounds(100,100, 100, 50);
		add(l);
		
		setLayout(null);
		setSize(500,500);
		setVisible(true);
		
	}
	public static void main(String args[])
	{
		new MyJList();
	}
}