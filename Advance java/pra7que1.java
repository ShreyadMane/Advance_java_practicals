import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;

class pra7que1 extends JFrame
{
	pra7que1()
	{
		DefaultMutableTreeNode contry = new DefaultMutableTreeNode("INDIA");
		DefaultMutableTreeNode M = new DefaultMutableTreeNode("MAHARASTRA");
		DefaultMutableTreeNode g = new DefaultMutableTreeNode("GUJARAT");
		
		DefaultMutableTreeNode MU = new DefaultMutableTreeNode("MUMBAI");
		DefaultMutableTreeNode P = new DefaultMutableTreeNode("PUNE");
		DefaultMutableTreeNode N = new DefaultMutableTreeNode("NASHIK");
		DefaultMutableTreeNode NA = new DefaultMutableTreeNode("NAGPUR");
		
		M.add(MU);
		M.add(P);
		M.add(N);
		M.add(NA);
		contry.add(M);
		contry.add(g);
		JTree t = new JTree(contry);
		add(t);
		
		setTitle("PRACTICAN NUMBER 7");
		
		pack();
		setSize(500,500);
		setVisible(true);
		}
	     public static void main(String args[])
	{
		new pra7que1();
	}
}