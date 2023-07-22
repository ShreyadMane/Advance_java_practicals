import java.awt.*;

class MyMenubar extends Frame
{
	MyMenubar()
	{
		MenuBar mb = new MenuBar();  // Menubar object
		
		Menu file = new Menu("File");   //Menu object
		Menu edit = new Menu("Edit");
		
		MenuItem n = new MenuItem("New");  //MenuItem object
		MenuItem o = new MenuItem("Open");
		MenuItem c = new MenuItem("Close");
		
		MenuItem cut = new MenuItem("Cut");   //MenuItem object
		MenuItem copy = new MenuItem("Copy");
		MenuItem paste = new MenuItem ("Paste");
		
		file.add(n);   //add MenuItem to Menu
		file.add(o);
		file.addSeparator();
		file.add(c);
		
		edit.add(cut);    //add MenuItem to Menu
		edit.add(copy);
		edit.add(paste);
		
		
		mb.add(file); // add Menu to Menubar
		mb.add(edit);
		
		setMenuBar(mb);  //add Menubar to Frame
		
		
		setLayout(new FlowLayout());
		setSize(500,500);
		setVisible(true);
	}
	
	public static void main(String args[])
	{
		new MyMenubar();
	}
	}