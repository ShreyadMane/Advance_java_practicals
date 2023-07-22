import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class pra12que2 extends JFrame implements ActionListener
{

JTextField tf1 = new JTextField(5);
JTextField tf2 = new JTextField(5);
JButton b = new JButton("Sum");
pra12que2()
{
setSize(600,600);
setTitle("Practical_12");
JPanel north = new JPanel();
north.add(new JLabel("Enter 1st No :"));
north.add(tf1);
north.add(new JLabel("Enter 2nd No :"));
north.add(tf2);
north.add(b);
add(north,"North");
b.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
int num1 = Integer.parseInt(tf1.getText());
int num2 = Integer.parseInt(tf2.getText());
setTitle("Addition is :- "+(num1+num2));
tf1.setText(" ");
tf2.setText(" ");
}
public static void main(String [] args)
{
pra12que2 t = new pra12que2();
t.setVisible(true);
}
}