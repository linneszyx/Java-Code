import java.applet.*;
import java.awt.*;
import java.awt.event.*;

class Frame2 extends Frame 
{
Frame2(String title) 
{
super(title);
addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent we) {
dispose();}});
}
}

public class FrameApplet extends Applet implements ActionListener 
{
public void init() 
{
Button b = new Button("Create new Frame");
b.addActionListener(this);
add(b);
}
public void actionPerformed(ActionEvent ae) 
{
Frame2 f = new Frame2("welcome Frame");
f.setSize(250, 250);
f.show();
}
}

/*<applet code=FrameApplet width=300 height=300></applet>*/