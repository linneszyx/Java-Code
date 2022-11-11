import java.awt.*;
import javax.swing.*;
public class Jcombobox
{
  public static void main(String[] args) 
  {
    JFrame f = new JFrame("JComboBox");
    f.setSize(300, 300);
    Container c = f.getContentPane();
    c.setBackground(Color.YELLOW);
    c.setLayout(new FlowLayout()); 
    JComboBox jb=new JComboBox();
    jb.addItem("item1");
    jb.addItem("item2");
    c.add(jb);
    f.setVisible(true);
  }
}
