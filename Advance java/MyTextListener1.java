import java.awt.*;
import java.awt.event.*;

class MyTextListener1 extends Frame implements TextListener
{
	Label l;
	TextArea t;
	MyTextListener1()
	{
		l = new Label("Word Count: 0");
		l.setBounds(50, 50, 200, 50);
		
		t = new TextArea();
		t.setBounds(100,100, 150,150);
		
		add(l);
		add(t);
		
		t.addTextListener(this);
		
		setLayout(null);
		setSize(500,500);
		setVisible(true);
	}
	
	public void textValueChanged(TextEvent e)
	{
		String text = t.getText();    // i am a student
        String words[] = text.split ("\\s");    
        l.setText ("Words: " + words.length + " Characters:" + t.length());       
	}
	
	public static void main( String args[])
	{
		new MyTextListener1();
	}
	
}