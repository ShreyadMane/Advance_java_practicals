import java.awt.*;
class pra1question2
{
	 public static void main(String args[])
	 {
	  Frame f=new Frame("practical 1 question two");
	  f.setLayout(new FlowLayout());
	  f.setSize(500,500);
	  f.setVisible(true); 
	  
	  Label L1=new Label("question1"); 
	  TextField input1=new TextField();
	  L1.setBounds(50,150,150,20);
	  
	  Label L2=new Label("question2");
	  TextArea input2=new TextArea();
	  L2.setBounds(50,150,150,20);
	  
	  Button b1=new Button("CLICK HERE");
	  b1.setBounds(50, 200, 50, 50);
	  
	  Button b2=new Button("cancel");
	  b2.setBounds(50, 200, 50, 50);
	  
	  
	  
	  f.add(L1);
	  f.add(input1);
	  f.add(L2);
	  f.add(input2);
	  f.add(b1);
	  f.add(b2);
	  
	 
	
	

	 
	 }
}