import java.awt.*;
import java.awt.event.*;

class MenuDemo1 extends Frame
{
MenuBar mb;
MenuItem m1,m2,m3,m4;
Menu mn;
MenuShortcut ms;
MenuDemo1();

{       ms.new MenuShortcut(KeyEvent.VK_X);
mn.new Menu ("File");
mb.new MenuBar();
        M1 = new MenuItem("NEW...");  //MenuItem object
		M2= new MenuItem("OPEN...");
		M3 = new MenuItem("SAVE AS..");  //MenuItem object
		M4 = new MenuItem("EXIT",ms);


       
	   mn.add(m1);
	   mn.add(m2);
	   mn.add(m3);
	   mn.addSeparator();
	   mn.add(m4);
	   mb.add(mn);
	   
      setTitle("pra5question exercise");
      setLayout(null);
		setSize(500,500);
		md.setVisible(true);
		
}

		public static void main(String args[])
	{
		new MenuDemo1();
	}
}
