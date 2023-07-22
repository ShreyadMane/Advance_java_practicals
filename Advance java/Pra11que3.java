import java.awt.*;
import java.awt.event.*;
class Pra11que3 extends Frame
{
Label l = new Label("",Label.CENTER);
 Pra11que3()
{
setSize(600,600);
setTitle("Practical_11");
addMouseListener(new MouseHandler());
l.setFont(new Font("Arial",Font.BOLD,15));
Panel p = new Panel();
p.add(l);
add(p,"North");
}
class MouseHandler extends MouseAdapter
{
public void mouseClicked(MouseEvent e)
{
int c = e.getClickCount();
String s = "Number of count(s) are " +c;
l.setText(s);
}
}
public static void main(String [] args)
{
 Pra11que3 t = new  Pra11que3();
t.setVisible(true);
}
}
