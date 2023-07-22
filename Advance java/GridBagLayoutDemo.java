import java.awt.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Frame;

 public class pra4que2 extends Frame
 {
public static void main(String a[])
{
	GridBagLayoutDemo fr=new GridBagLayoutDemo();
	fr.setTitle("GridBagLayout Example");
	fr.setSize(500,500);
	fr.setVisible(true);
	
}
public pra4que2 ()
{
	GridBagLayout grid=new GridBagLayout();
	GridBagConstraints g=new GridBagConstraints();
	setLayout(grid);
	GridBagLayout layout=new GridBagLayout();
	this.setLayout(layout);
	g.fill=GridBagConstraints. HORIZONTAL;
	g.gridx=0;
	g.gridy=0;
	this.add(new Button ("Button one"),g);
	g.gridx=1;
	g.gridy=0;
    
	
	this.add(new Button ("Button two"),g);
	g.fill=GridBagConstraints. HORIZONTAL;
	g.ipady=20;
	g.gridx=0;
	g.gridy=1;
	
	this.add(new Button ("Button three"),g);
	g.gridx=1;
	g.gridy=1;
	

	this.add(new Button ("Button Four"),g);
	g.gridx=0;
	g.gridy=2;
	g.fill=GridBagConstraints. HORIZONTAL;
	g.gridwidth=2;
	this.add(new Button ("Button Five"),g);
}
}