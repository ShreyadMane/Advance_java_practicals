import java.awt.event.*;
import java.awt.*;

class item extends Frame
{
List ls;
Label lb;
public item()
{
	setLayout(new FlowLayout());
	ls=new List();
	lb=new Label("see");
	ls.add("india");
	ls.add("Australia");
	ls.add("England");
	add(ls);
	add(lb);
	ls.addItemListener(this);
	
	   
		
}
public void itemStateChanged(ItemEvent ie)
{
	lb.setText(ls.getSelectedItem());
	
}
public static void main(String a[])
{
	item f=new item();
	f.setSize(500,500);
		f.setVisible(true);
}
}