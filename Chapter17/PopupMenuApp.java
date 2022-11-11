import java.awt.*; 
import java.awt.event.*; 
import java.applet.Applet;

public class PopupMenuApp extends Frame
{ 
    Button b; 
    TextField t; 
    PopupAppMenu m; 
    public PopupMenuApp()
{ 
      setSize(200, 200); 
      b = new Button("Popup Menu Application"); 
      add(b, BorderLayout.NORTH); 
      t = new TextField(); 
      t.setEditable(false); 
      add(t, BorderLayout.SOUTH); 
      m = new PopupAppMenu(this); 
      add(m); 
      b.addActionListener(new ActionListener(){ 
        public void actionPerformed(ActionEvent e){ 
          m.show(b, 25, 25); 
          } 
  }); 
  addMouseListener(new MouseAdapter()
{ 
    public void mousePressed(MouseEvent e)
{ 
      if (e.isPopupTrigger()) 
        m.show(e.getComponent(), e.getX(), e.getY()); 
      } 
      public void mouseReleased(MouseEvent e)
{ 
      if (e.isPopupTrigger()) 
        m.show(e.getComponent(), e.getX(), e.getY()); 
      } 
    }); 
    } 
    public static void main(String[] args){ 
    PopupMenuApp app = new PopupMenuApp(); 
    app.setVisible(true); 
    } 
  } 
   
  class PopupAppMenu extends PopupMenu implements ActionListener
{ 
    PopupMenuApp pm; 
    public PopupAppMenu(PopupMenuApp pm)
{ 
    super("File"); 
    this.pm = pm; 
    MenuItem mi; 
    add(mi = new MenuItem("Cut")); 
    mi.addActionListener(this);  
    add(mi = new MenuItem("Copy")); 
    mi.addActionListener(this); 
    add(mi = new MenuItem("Paste")); 
    mi.addActionListener(this); 
    } 
    public void actionPerformed(ActionEvent e)
{ 
    String s = e.getActionCommand(); 
    pm.t.setText("Option Selected: " + s); 
    } 
  } 
