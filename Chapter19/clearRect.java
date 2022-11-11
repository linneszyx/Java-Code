import java.awt.*;
import java.applet.*;
public class clearRect extends Applet 
{
public void paint(Graphics g) 
{
setBackground(Color.RED);
g.fillRoundRect(70, 90, 140, 100, 30, 40);
}
}
/*
<applet code="clearRect" width=300 height=200>
</applet>
*/
