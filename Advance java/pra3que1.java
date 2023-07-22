import java.awt.*;
import java.applet.*;
/*<applet code="pra3que1"width="500" height="500">
</applet>
*/
public class pra3que1 extends Applet
{
	public void init()
	{
		GridLayout g1=new GridLayout(5,5,10,10);
		setLayout(g1);
		for(int i=1;i<=25;i++)
		{
			add(new Button(""+i));
			
		}
		
	}
}




 
		
