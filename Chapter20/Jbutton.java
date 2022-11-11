import java.awt.*;
import javax.swing.*;
public class Jbutton
{
  public static void main(String[] args) 
{
    
    JFrame f = new JFrame("JButton");
    f.setSize(300, 300);
    Container c = f.getContentPane();
    c.setBackground(Color.YELLOW);
    c.setLayout(new FlowLayout()); 
    c.add(new JButton("Hello"));
    f.setVisible(true);
  }
}
