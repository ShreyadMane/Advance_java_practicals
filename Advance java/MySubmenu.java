import java.awt.*;

class MySubmenu extends Frame
{
	MySubmenu()
	{
		MenuBar mb = new MenuBar();  // Menubar object
		
		Menu file = new Menu("File");   //Menu object
		
		Menu n = new Menu("New");  
			
		MenuItem o = new MenuItem("Open");  //MenuItem object
		MenuItem c = new MenuItem("Close");
		
		MenuItem html = new MenuItem("HTML");  //MenuItem Object 
		MenuItem cpp = new MenuItem ("C++");
		MenuItem java = new MenuItem("Java");
		
		n.add(html);
		n.add(cpp);
		n.add(java);

		
		file.add(n);   //add submenu to Menu  
		file.add(o);    //add MenuItem to Menu
		file.addSeparator();
		file.add(c);   //add MenuItem to Menu
		
		
		mb.add(file); // add Menu to Menubar
				
		setMenuBar(mb);  //add Menubar to Frame
		
		setLayout(new FlowLayout());
		setSize(500,500);
		setVisible(true);
	}
	
	public static void main(String args[])
	{
		new MySubmenu();
	}
	}