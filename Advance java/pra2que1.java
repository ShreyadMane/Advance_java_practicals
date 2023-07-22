import java.awt.*;

class pra2que1 extends Frame
{
	pra2que1()
	{
		setLayout(new FlowLayout());
		Choice c = new Choice();
		c.add("maths");
		c.add("Chemistry");
		c.add("Physics");
		c.add("c++");
		c.add("java");
		add(c);
		Label l=new Label("select subject you like");
		add(l);
		setSize(500,500);
		setVisible(true);
	}
	
	public static void main( String s[])
	{
		new pra2que1();
	}
	
}