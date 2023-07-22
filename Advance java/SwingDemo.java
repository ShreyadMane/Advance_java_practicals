import java.awt.*;    
import javax.swing.*;   
import java.awt.event.*;    
  
public class SwingDemo extends JFrame implements ActionListener  
{    
  
	CardLayout crd;    
	  
	JButton btn1, btn2, btn3;    
	Container cPane;   
	  
	// constructor of the class  
	SwingDemo()  
	{    
	  
		cPane = getContentPane();    
		crd = new CardLayout();    
		cPane.setLayout(crd);    
		

		
		// creating the buttons  
		btn1 = new JButton("Apple");    
		btn2 = new JButton("Boy");    
		btn3 = new JButton("Cat");    
		  
		// adding listeners to it  
		btn1.addActionListener(this);    
		btn2.addActionListener(this);    
		btn3.addActionListener(this);    
		  
		  
		cPane.add("a", btn1); 
		cPane.add("b", btn2); 
		cPane.add("c", btn3); 
				
	}    
	public void actionPerformed(ActionEvent e)   
	{    
		crd.next(cPane);    
	}    
	  
	// main method  
	public static void main(String argvs[])   
	{     

	SwingDemo crdl = new SwingDemo();   
	  
	// size is 300 * 300          
	crdl.setSize(300, 300);    
	crdl.setVisible(true);    
	crdl.setDefaultCloseOperation(EXIT_ON_CLOSE);    
	}    
}    