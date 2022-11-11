import javax.swing.*;
public class Jframe1 
{
public static void main(String[] args) 
{
JFrame frame = new JFrame("Hello, Swing!");
frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
JButton jb=new JButton("Hello");
frame.add(jb);
frame.pack();
frame.setVisible(true);
}
}
 
