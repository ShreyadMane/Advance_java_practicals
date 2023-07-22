import java.awt.*;
import java.applet.*;

public class SetImage extends Applet
{
 Image picture;
 
 public void init()
 {
   picture=getImage(getCodeBase(),"icon1.png");
   
 }
 public void paint(Graphics g)
 {
  g.drawImage(picture,30,30,500,600,this);
 }
 /*<applet code="SetImage.class" width=500 height=500>
 </applet>*/
}