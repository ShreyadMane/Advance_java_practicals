import java.awt.*;

class demo extends Frame
{
	demo()
	{
	Label l=new Label("WELLCOME TO JAVA");
   
	
	  
		checkbox c1=new  checkbox ("MARATHI");
		Checkbox c2=new  Checkbox ("HINDI");
		Checkbox c3=new  Checkbox ("ENGLISH");
		Checkbox c4=new  Checkbox ("HISTORY");
		Checkbox c5=new  Checkbox ("GEOGRAPHY",true);
		
		
		add(l);
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(c5);
		
		setLayout(new FlowLayout());
		setTitle("Multiple languages");
		setSize(500,500);
		setVisible(true);
		
	}
	public static void main(String args[]){
             new demo();
		
	}
}