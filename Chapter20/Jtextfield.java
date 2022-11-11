import java.awt.*;
import javax.swing.*;
public class Jtextfield
{
  public static void main(String[] args) 
{
    
    JFrame f = new JFrame("JTextField");
    f.setSize(300, 300);
    Container c = f.getContentPane();
    c.setBackground(Color.YELLOW);
    c.setLayout(new FlowLayout()); 
    c.add(new JTextField("Hello"));
    f.setVisible(true);
  }
}
