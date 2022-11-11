import java.awt.*;
import javax.swing.*;

class WindowUtilities
{ 
public static void setNativeLookAndFeel()
{
try
{
UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
}
	catch(Exception e)
        {
	System.out.println(e);
	}
}
}
public class JApp1 extends JApplet
{
	public void init()
	{
		WindowUtilities.setNativeLookAndFeel();
		Container c = getContentPane();
		c.setBackground(Color.YELLOW);
		c.setLayout(new FlowLayout());
		c.add(new JLabel("Hi, How r u?"));
		c.add(new JButton("Hi"));
	}
}
/*<Applet code=JApp1 width=300 height=300></Applet>*/