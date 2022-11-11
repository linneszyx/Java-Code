import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class MouseEvent1 extends Applet implements MouseListener 
{
public void init() 
{
this.addMouseListener(this);
}
public void mouseEntered(MouseEvent e) 
{
setBackground(Color.RED);
repaint();
}
public void mouseExited(MouseEvent e) 
{
setBackground(Color.GREEN);
repaint();
}
public void mousePressed(MouseEvent me) {
setBackground(Color.BLUE);
repaint();
}
public void mouseReleased(MouseEvent e) 
{
setBackground(Color.WHITE);
repaint();
}
public void mouseClicked(MouseEvent e) 
{
setBackground(Color.YELLOW);
repaint();
}
}
/*
<applet code=MouseEvent1 width=300 height=300>
</applet>
*/