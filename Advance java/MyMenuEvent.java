import java.awt.*;
import java.awt.event.*;

public class MyMenuEvent extends Frame implements ActionListener
{
	public Panel p;
	public MenuItem b,g,y;
	MenuBar mb;
	Menu color;
	MyMenuEvent()
	{
		 p = new Panel();
		mb = new MenuBar();  // Menubar object
		
		color = new Menu("Color");   //Menu object
		
		b = new MenuItem("Blue");  //MenuItem object
		g = new MenuItem("Green");
		y = new MenuItem("Yellow");
		 
		color.add(b);   //add MenuItem to Menu
		color.add(g);
		color.add(y);
		
		b.addActionListener(this);
		g.addActionListener(this);
		y.addActionListener(this);
		
				
		mb.add(color); // add Menu to Menubar
		
		
		setMenuBar(mb);  //add Menubar to Frame
		
		p.setBounds(50,50,400,400);
		add(p);
		//setLayout(new FlowLayout());
		//setSize(500,500);
		pack();
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b)
			p.setBackground(Color.blue);
		if(ae.getSource()==g)
			p.setBackground(Color.green);
		if(ae.getSource()==y)
			p.setBackground(Color.yellow);
	}
	
	public static void main(String args[])
	{
		new MyMenuEvent();
	}
}