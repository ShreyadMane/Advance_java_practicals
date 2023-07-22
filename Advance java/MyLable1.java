import java.awt.*;

class MyLable1 extends Frame
{
	MyLable1()
	{
	Label l=new Label("WELLCOME TO JAVA");
		l.setBounds(50,50,300,300);
		add(l);
		setSize(500,500);
		setLayout(null);
		setTitle("PRACTICAL NO1");
		setVisible(true);
	}
	public static void main(String args[]){
		MyLable1 obj=new MyLable1();
		
	}
}