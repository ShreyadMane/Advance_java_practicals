import java.awt.*;
import java.applet.*;
/*
<applet code = MyFlowLayout.class width=500 height =500>
</applet>
*/
public class MyFlowLayout extends Applet
{
	public void init()
	{
		setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 20));
		
		Button b1= new Button("AJP");
		Button b2 = new Button("EDE");
		Button b3 = new Button("CSS");
		Button b4 = new Button("OSY");
		Button b5 = new Button("STE");
		Button b6 = new Button("CPP");
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
				
	}
}