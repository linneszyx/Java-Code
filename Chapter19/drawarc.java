import java.awt.*;
import java.applet.*;

public class drawarc extends Applet 
{
    public void paint(Graphics g) 
    {

g.setColor(Color.GREEN);
g.drawArc(10, 40, 70, 70, 0, 75);

    }
}

/*
<applet code="drawarc" width=300 height=200>
</applet>
*/
