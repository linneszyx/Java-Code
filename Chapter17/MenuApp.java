import java.awt.*; 
import java.awt.event.*; 
 
public class MenuApp extends Frame 
{ 
  public MenuApp() 
{ 
    super("Menu Application"); 
    setSize(300, 300); 
  filem fm = new filem(this); 
    HelpMenu helpMenu = new HelpMenu(this); 
    MenuBar mb = new MenuBar(); 
    mb.add(fm); 
    mb.add(helpMenu); 
    setMenuBar(mb); 
    addWindowListener(new WindowAdapter() 
{ 
      public void windowClosing(WindowEvent e) 
{ 
        exit(); 
      } 
    }); 
  } 
 
  public void exit() 
{ 
    setVisible(false); 
    dispose(); 
    System.exit(0); 
  } 
 
  public static void main(String args[]) 
{ 
    MenuApp w = new MenuApp(); 
    w.setVisible(true); 
  } 
} 
 
class filem extends Menu implements ActionListener 
{ 
  MenuApp mw;  
  public filem(MenuApp m) 
{ 
    super("File"); 
    mw = m; 
    MenuItem mi; 
    add(mi = new MenuItem("Open")); 
    mi.addActionListener(this); 
    add(mi = new MenuItem("Close")); 
    mi.addActionListener(this); 
    add(mi = new MenuItem("Exit")); 
    mi.addActionListener(this); 
  } 
 
  public void actionPerformed(ActionEvent e) 
{ 
    String item = e.getActionCommand(); 
    if (item.equals("Exit"))  
      mw.exit(); 
    else  
      System.out.println("Selected FileMenu " + item); 
  } 
} 
 
class HelpMenu extends Menu implements ActionListener 
{ 
  MenuApp mw;  
  public HelpMenu(MenuApp m) 
 { 
    super("Help"); 
    mw = m; 
    MenuItem mi; 
    add(mi = new MenuItem("Basics")); 
    mi.addActionListener(this); 
    add(mi = new MenuItem("Advanced")); 
    mi.addActionListener(this); 
    addSeparator(); 
    add(mi = new CheckboxMenuItem("Manual")); 
    mi.addActionListener(this); 
   
    Menu subMenu = new Menu("Miscellaneous"); 
    subMenu.add(mi = new MenuItem("Help")); 
    mi.addActionListener(this); 
    subMenu.add(mi = new MenuItem("Other Option")); 
    mi.addActionListener(this); 
    add(subMenu); 
  } 
  
  public void actionPerformed(ActionEvent e) 
{ 
    String item = e.getActionCommand(); 
    if (item.equals("Basics")) 
      System.out.println("Basics Menu"); 
    else if (item.equals("Help"))  
      System.out.println("Help Menu"); 
  } 
} 
