import java.awt.*;

class MyCheckBox extends Frame
{
	MyCheckBox()
	{
		Label l = new Label("My Favourite Languages:");
		Checkbox c1 = new Checkbox("C++");
		Checkbox c2 = new Checkbox("Java");
		Checkbox c3 = new Checkbox("Python");
		Checkbox c4 = new Checkbox("JavaScript", true);
		Checkbox c5 = new Checkbox("PHP");
		c5.setState(true);
		Checkbox c6 = new Checkbox();
		c6.setLabel("Perl");
		add (l);
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(c5);
		add(c6);
		setLayout(new FlowLayout());
		setSize(500,500);
		setVisible(true);
		
	}

	public static void main(String s[])
	{
		new MyCheckBox();
	}
}