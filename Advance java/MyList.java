import java.awt.*;

class MyList extends Frame
{
	MyList()
	{
		List l = new List(4, true);
		l.setBounds(100, 100, 100, 100);
		l.add("Red");
		l.add("Green");
		l.add("Blue");
		l.add("Yellow");
		l.add("Pink",1);
		l.add("Purple");
		l.add("Black");
		l.add("White");
		l.remove("Green");
		add(l);
				
		setLayout(new FlowLayout());
		setSize(700,700);
		setVisible(true);
	}
	
	public static void main( String s[])
	{
		new MyList();
	}
	
}