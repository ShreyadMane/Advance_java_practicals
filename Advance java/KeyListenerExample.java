import java.awt.*;    
import java.awt.event.*;    

public class KeyListenerExample extends Frame implements KeyListener {    

 Label l;    
 TextField t; 
     KeyListenerExample() {    
         
        l = new Label("hiiii keyPressed programs...");    

        l.setBounds (20, 50, 100, 20);    

        TextField t=new TextField();
        t.addKeyListener(this); 
        add(l); 
		add(t);		

        setSize (400, 400);    
        setLayout (null);    
        setVisible (true);    
    }    

    public void keyPressed (KeyEvent e) {    
        l.setText ("Key Pressed");    
    }   
    public void keyReleased (KeyEvent e) {}    
    public void keyTyped (KeyEvent e) {}    
  
    public static void main(String[] args) {    
        new KeyListenerExample();    
    }    
}   