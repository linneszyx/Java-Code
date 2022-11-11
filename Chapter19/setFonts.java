import java.awt.*;
import java.applet.*;
public class setFonts extends Applet 
{
Font f;
public void init()
{
f=new Font("Times New Roman", Font.BOLD, 20);
}

public void paint(Graphics g) 
{
g.setFont(f);
g.setColor(Color.BLUE);
g.drawString("TANWEER ALAM",100,100);
}
}
/*
<applet code="setFonts" width=300 height=400>
</applet>
*/