import java.awt.*;
import javax.swing.*;
public class Jradiobutton
{
  public static void main(String[] args) 
{
    
    JFrame f = new JFrame("JRadioButton");
    f.setSize(300, 300);
    Container c = f.getContentPane();
    c.setBackground(Color.YELLOW);
    c.setLayout(new FlowLayout()); 
    c.add(new JRadioButton("Yes"));
    c.add(new JRadioButton("No"));
    f.setVisible(true);
  }
}
