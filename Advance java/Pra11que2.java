import java.awt.*;
import java.awt.event.*;
class Pra11que2 extends Frame
{

   Pra11que2()
        {
            setSize(600,600);
            setTitle("Practical_11");
            addMouseListener(new MouseHandler());
        }
                class MouseHandler extends MouseAdapter
               {
                    public void mouseEntered(MouseEvent e)
               {
                   setBackground(Color.CYAN);
               }
			   public void mouseExited(MouseEvent e)
         {
             setBackground(Color.PINK);
          }
        }
 public static void main(String [] args)
    {
          Pra11que2 t = new Pra11que2();
           t.setVisible(true);
     }
 }
