import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class buttonImp extends Applet implements ActionListener
{
Button b1;
public void init() 
{
    b1 = new Button("Click this Button");
  add(b1);
  b1.setActionCommand("ENABLE");
  b1.addActionListener(this);
}
public void actionPerformed(ActionEvent e) 
{
String command=e.getActionCommand();
if(command=="ENABLE") 
{ 
b1.setLabel("Hi");
b1.setActionCommand("DISABLE");
}
else
{ 
b1.setLabel("Hello");
b1.setActionCommand("ENABLE");
} 
}
}
/*<applet code="buttonImp.class" width=400 height=400></applet>*/