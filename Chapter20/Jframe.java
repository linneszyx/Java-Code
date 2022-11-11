import java.awt.*;
import javax.swing.*;
public class Jframe
{
  public static void main(String[] args) 
  {
    JFrame f = new JFrame("JFrame");
    f.setSize(300, 300);
    Container c = f.getContentPane();
    c.setBackground(Color.YELLOW);
    c.setLayout(new FlowLayout()); 
    f.setVisible(true);
  }
}

 
