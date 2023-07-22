import java.awt.*;
 class pra1que1
 {
	 public static void main(String args[])
	 {
      Frame f=new Frame("practical no one");
	  Checkbox c1=new Checkbox("C");
      c1.setBounds(50,55,50,50);
      Checkbox c2=new Checkbox("C++");
      c2.setBounds(50,100,50,50); 	  
	  Checkbox c3=new Checkbox("java");
      c3.setBounds(50,150,50,50);
      Checkbox c4=new Checkbox("python");
      c4.setBounds(50,200,50,50); 
	  
      CheckboxGroup obj=new CheckboxGroup();
      Checkbox c5=new  Checkbox ("python",obj,false);
      c5.setBounds(50,300,50,50);	  
	  f.add(c1);
	  f.add(c2);
	  f.add(c3);
	  f.add(c4);
	  f.add(c5);
	  
	 
	 
	  f.setLayout(null);
	  f.setSize(500,500);
	  f.setVisible(true); 
	  
      }
	
	  
 }