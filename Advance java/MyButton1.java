import java.awt.*;

class MyButton1 extends Frame
{
	MyButton1()
	{
		Button b=new Button("CLICK HERE");
		b.setBounds(100, 100, 90, 50);
		add(b);
		setTitle("Mybutton1");
		setLayout(null);
		setSize(500,500);
		setVisible(true);
		
	}
	public static void main( String []args){
		MyButton1 obj= new MyButton1();
	}
}