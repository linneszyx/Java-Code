import java.awt.*;
import java.applet.*;

public class lines extends Applet
{
    public void paint(Graphics g) 
{       
        g.setColor(Color.RED);
        g.drawLine(25,25,100,100);
    }
}
/*
<applet code="lines" width=200 height=200>
</applet>
*/
