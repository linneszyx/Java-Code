import java.awt.*;
import java.applet.*;
public class applet2 extends Applet 
{
Font f;
public void init()
{
f = new Font("TimesRoman", Font.BOLD, 36);
}
public void paint(Graphics g) 
{
 g.setFont(f);
 g.setColor(Color.red);
 g.drawString("Hello Applet", 100, 100);
}
}
/*<applet code="applet2.class" width=400 height=400></applet>*/
