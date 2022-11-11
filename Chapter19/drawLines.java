import java.awt.*;
import java.applet.*;
public class drawLines extends Applet 
{
public void paint(Graphics g) 
{
g.drawLine(0, 0, 100, 100);
g.drawLine(0, 100, 100, 0);
}
}

/*
<applet code="drawLines" width=200 height=200>
</applet>
*/
