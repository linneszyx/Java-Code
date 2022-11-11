import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ColorPopupMenu extends Applet implements ActionListener 
{
 private String[] colorNames={ "White", "Light Gray", "Gray", "Dark Gray", "Black" };
   Color[] colors ={ Color.white, Color.lightGray, Color.gray, Color.darkGray, Color.black };
  PopupMenu menu;
                            
  public void init() 
  {
    setBackground(Color.gray);
    menu = new PopupMenu("Background Color");
    enableEvents(AWTEvent.MOUSE_EVENT_MASK);
    MenuItem colorName;
    for(int i=0; i<colorNames.length; i++) 
    {
      colorName = new MenuItem(colorNames[i]);
      menu.add(colorName);
      colorName.addActionListener(this);
      menu.addSeparator();
    }
    add(menu);
  }

  
  public void processMouseEvent(MouseEvent event) 
  {
    if (event.isPopupTrigger()) 
    {
      menu.show(event.getComponent(), event.getX(), 
                event.getY());
    }
    super.processMouseEvent(event);
  }
  
  public void actionPerformed(ActionEvent event) 
   {
    setBackground(colorNamed(event.getActionCommand()));
    repaint();
  }

Color colorNamed(String colorName) 
{
    for(int i=0; i<colorNames.length; i++) 
    {
      if(colorNames[i].equals(colorName)) 
      {
        return(colors[i]);
      }
    }
    return(Color.white);
  }
}
/*<applet code=ColorPopupMenu width=300 height=300></applet>*/