import java.awt.*;

class MyLable
{
	public static void main(String args[])
	{
		Frame f=new Frame("My First AWT Program in AJP");
		Label l=new Label("I dont love java programming");
		l.setBounds(50,50,400,400);
		f.add(l);
		f.setLayout(null);
		f.setSize(500,500);
		f.setVisible(true);
	}
}