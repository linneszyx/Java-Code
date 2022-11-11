import java.awt.*;
import javax.swing.*;
public class Jslider
{
  public static void main(String[] args) 
  {
    JFrame f = new JFrame("JSlider");
    f.setSize(300, 300);
    Container c = f.getContentPane();
    c.setBackground(Color.YELLOW);
    c.setLayout(new FlowLayout()); 
    JSlider js=new JSlider(0,100,10);
    
    c.add(js);
    f.setVisible(true);
  }
}
