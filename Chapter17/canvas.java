import java.applet.*;
import java.awt.*;

class canvas1 extends Canvas 
{
public void paint(Graphics g) 
{
g.setColor(Color.RED);
Dimension d = getSize();
g.drawRect(0, 0, d.width - 1, d.height - 1);
g.drawLine(0, d.height / 2, d.width - 1, d.height / 2 - 1);
g.drawLine(d.width / 2, 0, d.width / 2 - 1, d.height - 1);
g.setColor(Color.BLUE);
double dx = 4 * Math.PI / d.width;
double x = -2 * Math.PI;
int h = d.height;
for (int i = 0; i < d.width - 1; i++) {
int y1 = (int)((h - h * Math.sin(x)) / 2);
int y2 = (int)((h - h * Math.sin(x + dx)) / 2);
g.drawLine(i, y1, i + 1, y2);
x += dx;
}
}
}
public class canvas extends Applet 
{
public void init() 
{
canvas1 c = new canvas1();
c.setSize(401, 150);
add(c);
}
}
/*<applet code=canvas width=500 height=200>
</applet>*/