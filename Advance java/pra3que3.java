import javax.swing.*;
import java.awt.*;


public class pra3que3 extends JFrame
{
public pra3que3()

{
 
JButton b1=new JButton("Button 1");
b1.setBounds(100,180,180,70);
JButton b2=new JButton("Button 2");
b2.setBounds(300,180,180,70);
JButton b3=new JButton("Button 3");
b3.setBounds(100,280,180,70);
JButton b4=new JButton("Button 4");
b4.setBounds(300,280,180,70);
JButton b5=new JButton("Button 5");
b5.setBounds(100,380,180,70);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);

setLayout(null);
setSize(500,500);
setVisible(true);

}
public static void main(String a[])
{

 pra3que3 obj =new pra3que3();
	  
}
}