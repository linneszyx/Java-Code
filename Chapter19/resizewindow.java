import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class resizewindow extends Applet 
{
final int increment = 25;
int max = 600;
int min = 100;
Dimension dim;
public resizewindow() 
{
addMouseListener(new MouseAdapter() 
{
public void mouseReleased(MouseEvent e) 
{
int w = (dim.width + increment) > max?min :(dim.width + increment);
int h = (dim.height + increment) > max?min :(dim.height + increment);
setSize(new Dimension(w, h));
}
});
}
public void paint(Graphics g) 
{
g.setColor(Color.BLUE);
dim = getSize();
g.drawLine(0, 0, dim.width-1, dim.height-1);
g.drawLine(0, dim.height-1, dim.width-1, 0);
g.drawRect(0, 0, dim.width-1, dim.height-1);
}
}
/*
<applet code="resizewindow" width=200 height=200>
</applet>
*/