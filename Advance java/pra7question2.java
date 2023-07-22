import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;

class pra7question2 extends JFrame
{
	pra7question2()
	{
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("TREES");
		DefaultMutableTreeNode F = new DefaultMutableTreeNode("FRUITTREES");
		DefaultMutableTreeNode F1 = new DefaultMutableTreeNode("FLOWERPLANTS");
		
		
		DefaultMutableTreeNode B = new DefaultMutableTreeNode("BANANA TREE");
		DefaultMutableTreeNode A = new DefaultMutableTreeNode("APPLE TREE");
		DefaultMutableTreeNode C = new DefaultMutableTreeNode("COCONUT TREE");
		DefaultMutableTreeNode M = new DefaultMutableTreeNode("MANGO TREE");
		
		DefaultMutableTreeNode R = new DefaultMutableTreeNode("ROSE ");
		DefaultMutableTreeNode J = new DefaultMutableTreeNode("JASMIN");
		DefaultMutableTreeNode MA = new DefaultMutableTreeNode("MARRYGOLD");
		DefaultMutableTreeNode L = new DefaultMutableTreeNode("LOTUS");
		
		DefaultMutableTreeNode R1 = new DefaultMutableTreeNode("Red ");
		DefaultMutableTreeNode g1 = new DefaultMutableTreeNode("green");
		DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("blue");
		DefaultMutableTreeNode p1 = new DefaultMutableTreeNode("pink");
		
		
		F.add(B);
		F.add(A);
		F.add(C);
		F.add(M);
		
		F1.add(R);
		F1.add(J);
		F1.add(MA);
		F1.add(L);
		
		R.add(R1);
		R.add(g1);
		R.add(b1);
		R.add(p1);
		
		
		root.add(F);
		root.add(F1);
		
		
		JTree t = new JTree(root);
		add(t);
			
		
		setTitle("PRACTICAN NUMBER 7 QUESTION 2");
		
		pack();
		setSize(500,500);
		setVisible(true);
		
	}
	
	public static void main(String args[])
	{
		new pra7question2();
	}
}