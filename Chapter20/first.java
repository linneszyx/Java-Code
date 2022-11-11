import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class first
{
static JFrame f = new JFrame ("First Application");
public static void first() 
{ 
	f.setSize (400,100);
	f.setVisible (true);
	f.getContentPane ().setLayout (new FlowLayout ());
	WindowListener wl = new WindowAdapter () {
		public void windowClosing (WindowEvent e) {
			System.exit (0);}
	};
	f.addWindowListener (wl);
}

public static void main(String[] args) 
{
	first();
	JButton jb = new JButton("Click me");
	f.getContentPane().add(jb);
}
}
