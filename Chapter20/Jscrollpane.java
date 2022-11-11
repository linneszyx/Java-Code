import java.awt.*;
import javax.swing.*;
public class Jscrollpane
{
  public static void main(String[] args) 
  {
    JFrame f = new JFrame("JScrollPane");
    f.setSize(300, 300);
    Container c = f.getContentPane();
    c.setBackground(Color.YELLOW);
    c.setLayout(new FlowLayout()); 
    JPanel jp= new JPanel();
jp.add(new JButton("Hi"));
jp.add(new JButton("Hello"));
    c.add(new JScrollPane(jp));
    f.setVisible(true);
  }
}
