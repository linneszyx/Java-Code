import java.awt.*;
import javax.swing.*;
public class Jcheckbox
{
  public static void main(String[] args) 
{
    
    JFrame f = new JFrame("JCheckBox");
    f.setSize(300, 300);
    Container c = f.getContentPane();
    c.setBackground(Color.YELLOW);
    c.setLayout(new FlowLayout()); 
    c.add(new JCheckBox("Yes"));
    c.add(new JCheckBox("No"));
    f.setVisible(true);
  }
}
