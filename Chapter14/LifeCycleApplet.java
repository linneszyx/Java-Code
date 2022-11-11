import java.awt.*;
import java.applet.*;
import java.applet.*;
public class LifeCycleApplet extends Applet
{
  Font f = new Font("times new roman", Font.BOLD, 20);
  int  i;
  String S1, S2;

  public void paint(Graphics g)
  {
    g.setFont(f);
    g.setColor(Color.RED);
    g.drawString(S1, 100, 50);
    g.drawString(S2, 100, 100);  
  }

  public void init()
  {
    i = 0;
    S1 = "";
    S2 = "This is the initialization state."; 
    repaint();
    showStatus("The applet is initializing!"); 
  }

  public void start()
  {
    i = 1;
    S1 = S2;
    S2 = "This is the starting state."; 
    repaint();
    showStatus("The applet is starting!"); 
  }

  public void stop()
  {
    i = 2;
    S1 = S2;
    S2 = "This is the stopping state."; 
    repaint();
    showStatus("The applet is stopping!"); 
  }

  public void destroy()
  {
    i = 3;
    S1 = S2;
    S2 = "This is the destroyed stat."; 
    repaint();
    showStatus("The applet is being destroyed!"); 
  }
} 
/* <APPLET CODE= "LifeCycleApplet.class" width= 400 height=400>
</APPLET>*/
