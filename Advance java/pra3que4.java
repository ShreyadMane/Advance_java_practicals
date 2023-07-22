import java.awt.*;
public class pra3que4
{
	public static void main(String a[])
	{
		Frame f=new Frame();
		BorderLayout bl=new BorderLayout();
		Button b1=new Button ("NORTH");
		Button b2=new Button ("SOUTH");
		Button b3=new Button ("EAST");
		Button b4=new Button ("WEST");
		Button b5=new Button ("CENTER");
		
		f.add(b1,BorderLayout.NORTH);
		f.add(b2,BorderLayout.SOUTH);
		f.add(b3,BorderLayout.EAST);
		f.add(b4,BorderLayout.WEST);
		f.add(b5,BorderLayout.CENTER);
		
		f.setSize(300,300);
		f.setVisible(true);
		
	}
}
