import java.awt.*;
import java.awt.event.*;

 public class pra5que2 extends Frame

 {
	pra5que2 ()
	{
		MenuBar mb = new MenuBar();  
		
		Menu file = new Menu("File");   
		MenuShortcut ms=new MenuShortcut (KeyEvent.VK_X);
		MenuItem n = new MenuItem("NEW ...");  
		MenuItem o = new MenuItem("OPEN...");
		MenuItem c = new MenuItem("SAVE AS...");
		MenuItem d = new MenuItem("EXIT",ms);
	
		
		file.add(n);   
		file.add(o);
		file.add(c);
		file.addSeparator();
		file.add(d);
		
		mb.add(file); 
	    setMenuBar(mb);  
		
		
		setLayout(new FlowLayout());
		setSize(500,500);
		setVisible(true);
	}
 
      public static void main(String args[])
  {
	pra5que2 mb  =new pra5que2 ();
   }
}