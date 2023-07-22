import java.awt.*;
class practicalno1 extends Frame
{
   practicalno1()
  {
	  
	  Label l=new Label(" Hello practical no one");
	  l.setBounds(20,20,100,100);
	  Button b=new Button("practical one");
	  b.setBounds(150,100,90,50);
	  add(l);
	  add(b);
	  
	  
	  
	  setTitle("practical no 1");
	  setLayout(null);
	  setSize(500,500);
	  setVisible(true);
  }  
  public static void main(String args[]){
	  practicalno1 obj= new practicalno1();
  }
}