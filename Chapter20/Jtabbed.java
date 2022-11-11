import java.awt.*;
import javax.swing.*;
public class Jtabbed
{
  public static void main(String[] args) 
  {
    JFrame f = new JFrame("JTabbedPane");
    f.setSize(300, 300);
    Container c = f.getContentPane();
    c.setBackground(Color.YELLOW);
    c.setLayout(new FlowLayout());
   JTabbedPane jtp=new JTabbedPane();
    c.add(jtp);
    f.setVisible(true);
  }
}
