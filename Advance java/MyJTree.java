import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;
class MyJTree extends JFrame
{
	MyJTree()
	{
		DefaultMutableTreeNode color = new DefaultMutableTreeNode("Color");
		DefaultMutableTreeNode r = new DefaultMutableTreeNode("Red");
		DefaultMutableTreeNode g = new DefaultMutableTreeNode("Green");
		DefaultMutableTreeNode b = new DefaultMutableTreeNode("Blue");
		
		DefaultMutableTreeNode p = new DefaultMutableTreeNode("Pink");
		DefaultMutableTreeNode br = new DefaultMutableTreeNode("Brown");
		r.add(p);
		r.add(br);
		
		color.add(r);
		color.add(g);
		color.add(b);
		JTree t = new JTree(color);
		add(t);
		setTitle("JTree Example");
		//setSize(600,600);
		//setLayout(new FlowLayout());
		pack();
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String args[])
	{
		new MyJTree();
	}
}