import java.awt.*;
import javax.swing.*;
public class Jlabel
{
  public static void main(String[] args) 
{
    
    JFrame f = new JFrame("JLabel");
    f.setSize(300, 300);
    Container c = f.getContentPane();
    c.setBackground(Color.YELLOW);
    c.setLayout(new FlowLayout()); 
    c.add(new JLabel("Hello,How are you?"));
    f.setVisible(true);
  }
}
