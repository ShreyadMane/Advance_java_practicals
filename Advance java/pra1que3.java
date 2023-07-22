import java.awt.*;

class pra1que3 extends Frame
{
	pra1que3()
	{
		Label l = new Label("My Favourite Languages:");
		Checkbox c1 = new Checkbox("MARATHI");
		Checkbox c2 = new Checkbox("HINDI");
		Checkbox c3 = new Checkbox("ENGLISH");
		Checkbox c4 = new Checkbox("HISTORY", true);
		Checkbox c5 = new Checkbox("GEOGRAPHY");
		c5.setState(true);
		
		add (l);
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(c5);
		
		setLayout(new FlowLayout());
		setSize(500,500);
		setVisible(true);
		
	}

	public static void main(String s[])
	{
		new pra1que3();
	}
}