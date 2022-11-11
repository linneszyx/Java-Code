import java.awt.*; 
import java.awt.event.*; 
 
public class MainWindow extends Frame 
{ 
  public MainWindow() 
{ 
    super("Menu Application"); 
    setSize(300, 300); 
    setMenuBar(mb); 
    FileMenu fm = new FileMenu(this); 
    HelpMenu hm = new HelpMenu(this); 
    MenuBar mb = new MenuBar(); 
    mb.add(fm); 
    mb.add(hm); 
    addWindowListener(new WindowAdapter() 
{public void windowClosing(WindowEvent e){exit();}}); 
} 
 
  public void exit() 
{ 
    setVisible(false); 
    dispose(); 
    System.exit(0); 
  } 
 
  public static void main(String args[]) 
{ 
    MainWindow mw1 = new MainWindow(); 
    mw1.setVisible(true); 
  } 
} 
 
class FileMenu extends Menu implements ActionListener 
{ 
  MainWindow mw;  
  public FileMenu(MainWindow m) { 
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
  MainWindow mw;  
  public HelpMenu(MainWindow m) { 
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
      System.out.println("Basics"); 
    else if (item.equals("Help"))  
      System.out.println("Help"); 
  } 
} 
