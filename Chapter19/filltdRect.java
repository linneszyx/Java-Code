import java.awt.*;
import java.applet.*;

public class filltdRect extends Applet 
{
    public void paint(Graphics g) 
    {
setBackground(Color.YELLOW);
g.setColor(Color.RED);        
g.fill3DRect(10,20,100,100,true);
    }
}

/*
<applet code="filltdRect" width=300 height=200>
</applet>
*/
