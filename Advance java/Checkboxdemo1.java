import java.awt.*;
class Checkboxdemo1 
{
     public static void main(String arg[])
	
	{
		Frame f=new Frame("practical 1 ");
		
		
	   Label l= new Label("Checkbox");
	   CheckboxGroup obj=new CheckboxGroup();
       Checkbox c1=new  Checkbox ("pizza",obj,false);
	   Checkbox c2=new  Checkbox ("paistry",obj,false);
	   c1.setBounds(50,100,50,50);	 
	   c2.setBounds(50,20,50,50);
	  
		f.add(l);
		f.add(c1);
		f.add(c2);
		f.setVisible(true);
		f.setLayout(null);
		f.setTitle("Checkbox");
		f.setSize(400,400);
			
	
	
		
	}
}