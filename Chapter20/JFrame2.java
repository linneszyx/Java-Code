import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JFrame2
{
  public static void main(String[] args) 
{
    WindowUtilities.setNativeLookAndFeel();
    JFrame f = new JFrame("Hi Look and Feel");
    f.setSize(300, 300);
    Container c = f.getContentPane();
    c.setBackground(Color.white);
    c.setLayout(new FlowLayout()); 
    c.add(new JButton("Hi"));
    c.add(new JButton("Look and Feel"));
    c.add(new JButton("OK"));
    f.addWindowListener(new ExitListener());
    f.setVisible(true);
  }
}

