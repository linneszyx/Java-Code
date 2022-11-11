import java.awt.*;
import java.applet.*;
public class clearRect1 extends Applet 
{
public void paint(Graphics g) 
{
setBackground(Color.YELLOW);
g.setColor(Color.RED);
g.fillRect(50, 50, 150, 150);
g.clearRect(60,60,100,100);
}
}
/*
<applet code="clearRect1" width=300 height=200>
</applet>
*/
