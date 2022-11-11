import java.awt.*;
import java.applet.*;

public class tdRect extends Applet 
{
    public void paint(Graphics g) 
    {
setBackground(Color.YELLOW);
g.setColor(Color.RED);        
g.draw3DRect(10,20,100,100,true);
    }
}

/*
<applet code="tdRect" width=300 height=200>
</applet>
*/
