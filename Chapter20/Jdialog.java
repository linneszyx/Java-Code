import java.awt.*;
import javax.swing.*;
public class Jdialog
{
  public static void main(String[] args) 
  {
    JFrame f = new JFrame("JDialog");
    f.setSize(300, 300);
    Container c = f.getContentPane();
    c.setBackground(Color.YELLOW);
    c.setLayout(new FlowLayout());
    JDialog jtp=new JDialog();
    f.add(jtp);
    f.setVisible(true);
  }
}
