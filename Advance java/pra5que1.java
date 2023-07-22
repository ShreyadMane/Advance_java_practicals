import java.awt.*;

 class pra5que1 extends Frame

 {
	pra5que1  ()
	{
		MenuBar mb = new MenuBar();  
		
		Menu file = new Menu("colors");   
		
		MenuItem n = new MenuItem("Red");  
		MenuItem o = new MenuItem("pink");
		MenuItem c = new MenuItem("Black");
		c.setEnabled(false);
		
		file.add(n);   
		file.add(o);
		file.addSeparator();
		file.add(c);
		
		mb.add(file); 
	    setMenuBar(mb);  
		
		
		setLayout(new FlowLayout());
		setSize(500,500);
		setVisible(true);
	}
 
      public static void main(String args[])
  {
	pra5que1  mb  =new pra5que1 ();
   }
}