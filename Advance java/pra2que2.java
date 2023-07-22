import java.awt.*;

class pra2que2 extends Frame
{
	pra2que2()
	{
		List l = new List(4, true);
		l.setBounds(100, 100, 100, 100);
		l.add("Summer");
		l.add("Winter");
		l.add("Rainy");
		
		
		add(l);
				
		setLayout(new FlowLayout());
		setSize(700,700);
		setVisible(true);
	}
	
	public static void main( String s[])
	{
		new pra2que2 ();
	}
	
}