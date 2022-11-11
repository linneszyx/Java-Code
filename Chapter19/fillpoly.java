import java.awt.*;
import java.applet.*;

public class fillpoly extends Applet 
{
public void paint(Graphics g) 
{
setBackground(Color.YELLOW);
g.setColor(Color.BLUE);
int x[] = {30, 200, 30, 200, 30};
int y[] = {30, 30, 200, 200, 30};
int n=5;
g.fillPolygon(x,y,n);
}
}
/*
<applet code="fillpoly" width=300 height=300>
</applet>
*/