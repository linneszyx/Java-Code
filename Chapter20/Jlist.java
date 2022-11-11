import java.awt.*;
import javax.swing.*;
public class Jlist
{
  public static void main(String[] args) 
{
    
    JFrame f = new JFrame("JList");
    f.setSize(300, 300);
    Container c = f.getContentPane();
    c.setBackground(Color.YELLOW);
    c.setLayout(new FlowLayout()); 
String a[];
a=new String[3];
a[0]="Tanweer";
a[1]="Anjum";
a[2]="AAtif";
  JList jl=new JList(a);
   jl.setBackground(Color.RED);
    c.add(jl);
    f.setVisible(true);
  }
}
