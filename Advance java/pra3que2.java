import java.awt.*;
import java.applet.*;

/*<applet code="pra3que2"width="500" height="500">
</applet>
*/
public class pra3que2 extends Applet
{
	public void init()
	{
		GridLayout g1=new GridLayout(4,3,10,10);
		setLayout(g1);
		for(int i=1;i<=9;i++)
		{
			add(new Button(""+i));
			
		}
		Button b1=new Button ("*");
		Button b2=new Button ("0");
		Button b3=new Button ("#");
		add(b1);
		add(b2);
		add(b3);
		
		
	}
}
