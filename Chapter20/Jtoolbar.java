import java.awt.*;
import javax.swing.*;
public class Jtoolbar
{
  public static void main(String[] args) 
  {
    JFrame f = new JFrame("JToolBar");
    f.setSize(300, 300);
    Container c = f.getContentPane();
    c.setBackground(Color.YELLOW);
    c.setLayout(new FlowLayout()); 
    JToolBar jtb=new JToolBar("File");
    c.add(jtb);
    f.setVisible(true);
  }
}
