import java.applet.Applet.*;
import java.awt.*;
public class EventDel extends Applet
 {
  Button aButton;
  Checkbox aCheckbox;
  Label aLabel;
  List aList;
  Scrollbar aScrollbar;
  TextField aTextField;
  TextArea aTextArea;
public void init()
{
 aButton= new Button("ok");
 aCheckbox= new Checkbox("Show");
 aLabel= new Label("Name");
 aList= new List();
 aScrollbar = new Scrollbar(Scrollbar.HORIZONTAL);
 aTextField = new TextField("Our First GUI applet",50);
 aTextArea= new TextArea("Our First GUI applet",10,50);
aList.addItem("One");
aList.addItem("Two");
aList.addItem("Three");
aList.addItem("Four");
add(aButton);
add(aCheckbox);
add(aLabel);
add(aList);
add(aScrollbar);
add(aTextField);
add(aTextArea);
}


 
  public void paint(Graphics g)
{
    Color c = getForeground();
    setBackground(Color.yellow);  
    setForeground(Color.red);    
    g.drawString("Foreground color set to red", 100, 50);  
    g.drawString(c.toString(), 100, 80); 
   g.drawString("Change Background and Foreground Color of Applet", 50, 100);
  }
}











 