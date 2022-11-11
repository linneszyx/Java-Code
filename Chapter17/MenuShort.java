import java.awt.*; 
import java.awt.event.*; 
 
public class MenuShort extends Frame 
{ 
  public MenuShort() 
{ 
    super("Menu Short cut Application"); 
    setSize(300, 300); 
    MenuBar mb = new MenuBar(); 
   Menu top =new Menu("File");
Menu sub =new Menu("Print");
sub.add(new MenuItem("print",new MenuShortcut('P'))); 
sub.add(new MenuItem("print preview",new MenuShortcut('P',true))); 
top.add(sub);
 mb.add(top); 
     setMenuBar(mb); 
    
  } 
  public static void main(String[] args)
{
MenuShort ms=new MenuShort();
    ms.setVisible(true);
  }


} 
