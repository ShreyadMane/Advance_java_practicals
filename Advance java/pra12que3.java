import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class pra12que3 extends JFrame implements ActionListener
{
JPasswordField pass = new JPasswordField(10);
JLabel l = new JLabel(" ");
pra12que3()
{
setSize(600,600);
setTitle("Practical_12");
JPanel north = new JPanel();

JPanel center = new JPanel();
north.add(new JLabel("Enter Password :"));
north.add(pass);
add(north,"North");
center.add(l);
add(center,"Center");
pass.addActionListener(this);
l.setFont(new Font("Times New Roman",Font.ITALIC,20));
}
public void actionPerformed(ActionEvent e)
{
char ch[] = pass.getPassword();
String s = new String(ch);
if(s.length()>=6)
l.setText("Valid Password");
else
l.setText("Password length must be >6 characters");
}
public static void main(String [] args)
{
pra12que3 t = new pra12que3();
t.setVisible(true);
}
}