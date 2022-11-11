import java.awt.*;
import javax.swing.*;
public class Jmenu
{
  public static void main(String[] args) 
  {
    JFrame f = new JFrame("JMenu");
    f.setSize(300, 300);
    //f.getContentPane();
    //c.setBackground(Color.YELLOW);
    //c.setLayout(new FlowLayout()); 
    JMenuBar mb=new JMenuBar();
    JMenu menu=new JMenu("File");
    JMenuItem m1=new JMenuItem("New");
    JMenuItem m2=new JMenuItem("Open");
    menu.add(m1);
    menu.add(m2);
    mb.add(menu);
    f.setJMenuBar(mb);
    f.setVisible(true);
  }
}
