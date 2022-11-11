import java.awt.*;
import javax.swing.*;
public class Jscrllbar
{
  public static void main(String[] args) 
{
    
    JFrame f = new JFrame("JScrollBar");
    f.setSize(300, 300);
    Container c = f.getContentPane();
    c.setBackground(Color.YELLOW);
    c.setLayout(new FlowLayout()); 
    c.add(new JScrollBar());
    f.setVisible(true);
  }
}
