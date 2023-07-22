import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Practical_12 extends JFrame implements ActionListener
{
JTextField tf = new JTextField(10);
JPasswordField pf = new JPasswordField(15);
JButton b = new JButton("Log In");
Practical_12()
{
setSize(600,600);
setTitle("Practical_12");
JPanel p = new JPanel();
p.add(new Label("Email :"));
p.add(tf);
p.add(new Label("Password :"));
p.add(pf);
p.add(b);
add(p,"North");
b.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
char ch[] = pf.getPassword();
String str = tf.getText();
String s = new String(ch);
if(s.equals("12345678") && str.equals("abc@gmail.com"))
JOptionPane.showMessageDialog(null,"Login Successfull ");

else
JOptionPane.showMessageDialog(null,"Login UnSuccessfull ");
pf.setText("");
}
public static void main(String [] args)
{
Practical_12 t = new Practical_12();
t.setVisible(true);
}
}
