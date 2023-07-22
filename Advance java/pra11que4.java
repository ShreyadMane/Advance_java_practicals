import java.awt.*;
import java.awt.event.*;
class pra11que4 extends Frame
{
Label l = new Label("",Label.CENTER);
pra11que4()
{
setSize(600,600);
setTitle("Practical_11");
addMouseMotionListener(new MouseHandler());
l.setFont(new Font("Arial",Font.BOLD,15));
Panel p = new Panel();
p.add(l);
add(p,"North");
}
class MouseHandler extends MouseMotionAdapter
{
public void mouseMoved(MouseEvent e)
{
int x=e.getX();
int y=e.getY();
String str=("Mouse is at x="+x+", y="+y);
setTitle(str);
}
public void mouseDragged(MouseEvent e)
{
Graphics g=getGraphics();
g.setColor(Color.BLUE);
g.fillOval(e.getX(),e.getY(),20,20);

}
}
public static void main(String [] args)
{
pra11que4 t = new pra11que4();
t.setVisible(true);
}
}
