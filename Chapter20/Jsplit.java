import java.awt.*;
import javax.swing.*;
public class Jsplit
{
  public static void main(String[] args) 
  {
    JFrame f = new JFrame("JSplitPane");
    f.setSize(300, 300);
    Container c = f.getContentPane();
    c.setBackground(Color.YELLOW);
    c.setLayout(new FlowLayout());
   JSplitPane jtp=new JSplitPane();
    c.add(jtp);
    f.setVisible(true);
  }
}
