import java.awt.*;
import java.applet.*;

public class 3dRect extends Applet 
{
    public void paint(Graphics g) 
{
        g.draw3DRect(20,20,60,60,true);
        g.draw3DRect(120,20,60,60,false);
    }
}

/*
<applet code="3dRect" width=300 height=200>
</applet>
*/
