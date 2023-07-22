import java.awt. *; 
import java.applet. *; 
public class ProjectJava extends Applet 
{ 
  String name; 	 
  String collage; 
  String age; 	 
  String sport; 
  String food; 
  String fruit; 
  String destination; 
  String movie; 
  String hobby;   
  Font f;   
  public void paint (Graphics g)  
  {   
      setBackground (Color.yellow);  	
	 setForeground (Color.red);  	 
	 f = new Font ("Dialog", Font.BOLD,22);  
	 setFont(f);  
	 name = getParameter("Name");  
	 collage=getParameter("Collage");  	 
	 age = getParameter("Age");  	 
	 sport= getParameter("Sport");  	
	 food = getParameter("Food");  	
	 fruit= getParameter("Fruit");  	 
	 destination = getParameter("Destination");  	 
	 movie=getParameter("Movie");  	
	 hobby=getParameter("Hobby"); 
      g. drawString("***WEL-COME***",40,40); 
 	  g. drawString ("***Self Information** ",40,80); 
 	  g. drawString ("Name - " +name,40,120); 
      g. drawString ("Collage Name - " + collage,40,140); 	   
 	  g. drawString ("Age - " +age,40,160); 
 	  g. drawString ("Favourite Sport - " +sport,40,180); 
 	  g. drawString ("Favourite Fruit - "+fruit,40,200); 
 	  g. drawString ("Favourite Food - "+ food,40,220); 
 	  g. drawString ("Favourite destination - " +destination,40,240); 
      g. drawString ("Favourite Movie - " + movie,40,260); 
 	  g. drawString ("Hobby - " + hobby,40,280); 
 	  g. drawString("****Thank-You***",40,320); 
}  }