import java.awt.*;
import java. applet.*;

/*<applet code="scroll_demo"width="500" height="500">
</applet>
*/
public class scroll_demo extends Applet
{
public void init()
{
	Scrollbar s1= new Scrollbar(Scrollbar.VERTICAL,0,1,0,50);
	Scrollbar s2=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,50);

	add(s1);
	add(s2);
}
}