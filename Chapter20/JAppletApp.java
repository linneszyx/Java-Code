import java.awt.*;
import javax.swing.*;
public class JAppletApp extends JApplet 
{
  public void init() 
  {
    Container c = getContentPane();
    c.setBackground(Color.YELLOW);
    c.setLayout(new FlowLayout()); 
    c.add(new JLabel("My First JApplet"));
   
  }
}
/*<applet code="JAppletApp" width=300 height=300></applet>*/