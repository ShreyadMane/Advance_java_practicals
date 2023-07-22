import java.awt.*;

class pra1que4 extends Frame
{
	pra1que4()
		{
		Button b1=new Button("Ok");

		
		Button b2=new Button("Cancel");

		
		Button b3=new Button("Reset");
		
		
		add(b1);
		add(b2);
		add(b3);
		
		setTitle("Display Buttons");
	    setSize(600,900);
		setLayout(new FlowLayout());
		setVisible(true);
		}
		public static void main( String []args)
	{
	               pra1que4 obj =new pra1que4();
	}
}