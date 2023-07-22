import java.awt.*;
import javax.swing.*;

class panel extends Frame
{
	panel()

{
	
	JPanel p=new JPanel();
	JLabel l=new JLabel("NAME OF STATES IN INDIA");
	l.setBounds(100,100,100,30);
    add(p);
	p.setBackground(Color.yellow);
	p.add(l);
	
	setVisible(true);
	setSize(300,300);
 
   
	
	
}
public static void main(String a[])
{ new panel();}
}