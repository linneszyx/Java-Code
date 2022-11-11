import java.awt.*;
import java.applet.*;

public class setcolor extends Applet 
{

public void paint(Graphics g) 
{
Color x = new Color(255, 0, 0);
Color y = new Color(0, 255, 0);
Color z = new Color(0, 0, 255);

g.setColor(x);
g.drawLine(0, 30, 100, 30);

g.setColor(y);
g.drawLine(0, 50, 300, 50);

g.setColor(z);
g.drawLine(0, 80, 400, 80);

g.setColor(Color.red);
g.drawOval(10, 10, 100, 100);

}
}

/*
<applet code="setcolor" width=300 height=200>
</applet>
*/