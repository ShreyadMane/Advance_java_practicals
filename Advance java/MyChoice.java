import java.awt.*;

class MyChoice extends Frame
{
	MyChoice()
	{
		Choice c = new Choice();
		c.add("Pizza");
		c.add("VadaPav");
		c.add("PaniPuri");
		c.add("BhelPuri");
		c.add("Pavbhaji");
		c.add("Maggie");
		c.insert("Idli", 2);
		c.remove(1);
		
		add(c);
				
		setLayout(new FlowLayout());
		setSize(500,500);
		setVisible(true);
	}
	
	public static void main( String s[])
	{
		new MyChoice();
	}
	
}