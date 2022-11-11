import java.awt.*;
import java.applet.*;

public class poly extends Applet 
{
public void paint(Graphics g) 
{
setBackground(Color.YELLOW);
g.setColor(Color.BLUE);
int x[] = {30, 200, 30, 200, 30};
int y[] = {30, 30, 200, 200, 30};
int n=5;
g.drawPolygon(x,y,n);
}
}
/*
<applet code="poly" width=300 height=300>
</applet>
*/