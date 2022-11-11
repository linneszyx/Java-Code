import java.awt.*;
import javax.swing.*;

public class JApplet2 extends JApplet 
{
  public void init() 
  {
    WindowUtilities.setNativeLookAndFeel();
    Container c = getContentPane();
    c.setBackground(Color.white);
    c.setLayout(new FlowLayout()); 
    c.add(new JButton("Hi"));
    c.add(new JButton("Look & Feel"));
    c.add(new JButton("OK"));
  }
}

/*<applet code=JApplet2  width=300 height=300></applet>*/