import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
/*<applet code="pra10que3.class" width=300 height=300></applet>*/
public class pra10que3 extends Applet implements ActionListener
{
JTextField t1 = new JTextField(10);
JTextField t2 = new JTextField(10);
JTextField t3 = new JTextField(10);

JLabel l1 = new JLabel("FIRST NO=:");
JLabel l2 = new JLabel("SECOND NO:");
JLabel l3 = new JLabel("MUL:");

JButton b = new JButton("MULTYPLY");
public void init()

{
add(l1); add(t1);add(l2);add(t2); add(l3);add(t3); add(b);
b.addActionListener(this);
}

public void actionPerformed(ActionEvent e)
{
  if (e.getSource() == b)
{
int n1 = Integer.parseInt(t1.getText());
int n2 = Integer.parseInt(t2.getText());
t3.setText(" " + (n1 * n2));
}}}