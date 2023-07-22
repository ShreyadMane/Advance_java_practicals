import java.awt.*;
import java.applet.*;
/*<applet code="Name1.class",width=500 height=500></applet>*/

public class Name1 extends Applet
{
 Font f1,f2,f3,f4,f5;
 public void init()
 {
   f1=new Font("Arial",Font.BOLD,40);
   f2=new Font("Arial",Font.BOLD,36);
   f3=new Font("Arial",Font.BOLD,30);
  f4=new Font("Arial",Font.BOLD,27);
  f5=new Font("Arial",Font.BOLD,20);
 }
 public void paint(Graphics g)
 {
 g.setFont(f1);
 g.drawString("JAVA PROGRAMMING",50,50);
 g.setFont(f2);
 g.drawString("JAVA PROGRAMMING",50,100);
 g.setFont(f3);
 g.drawString("JAVA PROGRAMMING",50,150);
 g.setFont(f4);
 g.drawString("JAVA PROGRAMMING",50,200);
 g.setFont(f5);
 g.drawString("JAVA PROGRAMMING",50,250);
 }
}