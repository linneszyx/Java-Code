import java.awt.*; 
import java.awt.event.*; 
 public class AppWin extends Frame
{ 
  public AppWin ()
   { 
    super("ApplicationWindow"); 
    setSize(200, 200); 
    addWindowListener(new WindowAdapter()
    { 
      public void windowClosing(WindowEvent we)
     { 
      setVisible(false); 
     dispose(); 
     System.exit(0); 
      } 
    }); 
  } 
 
  public static void main(String[] args)
   { 
    AppWin aw = new AppWin(); 
    aw.setVisible(true); 
  } 
} 
