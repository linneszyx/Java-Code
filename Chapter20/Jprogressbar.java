import java.awt.*;
import javax.swing.*;
public class Jprogressbar
{
  public static void main(String[] args) 
{
    
    JFrame f = new JFrame("JProgressBar");
    f.setSize(300, 300);
    Container c = f.getContentPane();
    c.setBackground(Color.YELLOW);
    c.setLayout(new FlowLayout()); 
    c.add(new JProgressBar(0,100));
    f.setVisible(true);
  }
}
