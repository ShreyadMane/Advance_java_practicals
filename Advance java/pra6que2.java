import javax.swing.*;
import java.awt.*;

 public  class pra6que2 extends JFrame
 {
	 pra6que2 ()
	 {
     String[] state = {"MAHARASTRA","GOA","PANJAB","KERAL","BIHAR"};
     JComboBox cb =new JComboBox(state);
	 cb.setBounds(50,50,90,20);
	 add(cb);
	 setTitle("JComboBox ");
	 
        setLayout(null);
	    setSize(500,500);
        setVisible(true);
	 }
	 
	 public static void main(	String a[])
	 {
		pra6que2 g= new  pra6que2();
	 }
 }