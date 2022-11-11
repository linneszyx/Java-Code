import java.awt.*; 
import java.applet.Applet; 
 
public class scrollbar extends Applet 
{ 
  public void init() 
{ 
   Scrollbar sb =  new Scrollbar(Scrollbar.HORIZONTAL,10,10,50,100); 
    add(sb); 
  } 
} 

/*<applet code=scrollbar width=200 height=200></applet>*/
