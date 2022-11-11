import java.awt.*; 
import java.applet.Applet; 
 
public class scrollbar extends Applet 
{ 
  public void init() 
{ 
   Scrollbar sb =  new Scrollbar(Scrollbar.VERTICAL, 0, 8, -100, 100); 
    add(sb); 
  } 
} 
