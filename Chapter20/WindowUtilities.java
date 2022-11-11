import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ExitListener extends WindowAdapter 
{
  public void windowClosing(WindowEvent event)
  {
    System.exit(0);
  }
}


public class WindowUtilities 
{
 public static void setNativeLookAndFeel() 
{
    try 
   {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    }
      catch(Exception e) {
      System.out.println(e);
    }
  }

  public static void setJavaLookAndFeel() 
{
try 
{
 UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
  }
catch(Exception e) 
  {
    System.out.println(e);
    }
  }
   public static void setMotifLookAndFeel() 
{
    try 
    {
      UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
    }
     catch(Exception e) 
     {
      System.out.println(e);
      }
  }
 public static JFrame openInJFrame(Container content, int width, int height, String title,Color bgC) 
{
    JFrame f = new JFrame(title);
    f.setBackground(bgC);
    content.setBackground(bgC);
    f.setSize(width, height);
    f.setContentPane(content);
    f.addWindowListener(new ExitListener());
    f.setVisible(true);
    return(f);
  }
  public static JFrame openInJFrame(Container content, int width, int height,                           String title) 
{
    return(openInJFrame(content, width, height, title, Color.white));
  }
  public static JFrame openInJFrame(Container content,  int width, int height) 
  {
    return(openInJFrame(content, width, height, content.getClass().getName(),                        Color.white));
  }
}
