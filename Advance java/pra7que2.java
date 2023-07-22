import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;

class pra7que2 extends JFrame
{
	pra7que2()
	{
		Container ct=getContentPane();
		ct.setLayout(new BorderLayout());
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("INDIA");
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
		
		
		root.add(M);
		root.add(g);
		JTree t = new JTree(root);
		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		JScrollPane jsp=new JScrollPane(t,v,h);
		ct.add(jsp,BorderLayout.CENTER);
		
		add(t);
			
		
		setTitle("PRACTICAN NUMBER 7");
		
		pack();
		setVisible(true);
		setSize(500,500);
		
	}
	
	public static void main(String args[])
	{
		new pra7que2();
	}
}