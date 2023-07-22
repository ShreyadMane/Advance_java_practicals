import java.awt.*;
import java. applet.*;

/*<applet code="checkbox_group"width="500" height="500">
</applet>
*/

public class checkbox_group extends Applet
{
 public void init()
 {
	 CheckboxGroup cbg= new CheckboxGroup ();
	 Checkbox chb1=new Checkbox("pizza",false, cbg);
	 Checkbox chb2=new Checkbox("Hot-dog",true,cbg);
	 Checkbox chb3=new Checkbox("Burger",false, cbg);
	 Checkbox chb4=new Checkbox("pestry",false ,cbg);
	 add(chb1);
	 add(chb2);
	 add(chb3);
	 add(chb4);
	 
 }
}