import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class pra12que1 extends JFrame
{
JPasswordField pass = new JPasswordField(10);
pra12que1()
{
setSize(600,600);
setTitle("Practical_12");
pass.setEchoChar('*');
JPanel p = new JPanel();
p.add(new Label("Password :"));
p.add(pass);

add(p,"North");
}
public static void main(String [] args)
{
pra12que1 t = new pra12que1();
t.setVisible(true);
}
}
