import java.awt.*; 
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Frame;

public class pra4que3 extends Frame
{
	public static void main(String a[])
	{
		Frame f=new Frame();
		GridBagLayout gb=new GridBagLayout();
		GridBagConstraints gbc=new GridBagConstraints();
		f.setLayout(gb);
		
		gbc.fill=GridBagConstraints. HORIZONTAL;
		gbc.gridx=0;
	    gbc.gridy=0;
		Label l1=new Label("Name");
		f.add(l1,gbc);
		
		gbc.gridx=1;
	    gbc.gridy=0;
		TextField t=new TextField();
		f.add(t,gbc);
		
		gbc.fill=GridBagConstraints. HORIZONTAL;
		gbc.gridx=0;
	    gbc.gridy=1;
		Label l2=new Label("Comments");
		f.add(l2,gbc);
		
		gbc.gridx=1;
	    gbc.gridy=1;
		TextArea t1=new TextArea();
		f.add(t1,gbc);
		
		gbc.fill=GridBagConstraints. HORIZONTAL;
		gbc.gridx=1;
	    gbc.gridy=2;
		Button b =new Button("SUBMIT");
		f.add(b,gbc);
		
		f.setSize(500,500);
		f.setVisible(true);
	}
}