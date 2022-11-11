import java.awt.*;
import java.applet.*;

public class fillarc extends Applet 
{
    public void paint(Graphics g) 
    {

g.setColor(Color.GREEN);
g.fillArc(10, 40, 150, 150, 0, 75);

    }
}

/*
<applet code="fillarc" width=300 height=200>
</applet>
*/
