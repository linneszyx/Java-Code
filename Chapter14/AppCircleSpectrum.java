import java.applet.*;
import java.awt.*;
import java.lang.Math;
public class AppCircleSpectrum extends Applet 
{
   int width, height;
   int n = 25;
   Color[] c;
   public void init() {
   width = getSize().width;
   height = getSize().height;
   setBackground( Color.black );
   c = new Color[n];
   for ( int i = 0; i < n; ++i ) 
   {
    c[i] = new Color( Color.HSBtoRGB(i/(float)n,1,1) );
    }
 }

   public void paint( Graphics g ) 
   {
      int r = width / 3;
      for ( int i = 0; i < n; ++i ) 
      {
         double angle = 2*Math.PI*i/(double)n;
         int x = (int)(r*Math.cos(angle));
         int y = (int)(r*Math.sin(angle));
         g.setColor(c[i]);
         g.drawString( "Tanweer", width/2+x, height/2+y );
      }
   }
}
/*<applet code="AppCircleSpectrum.class" width=400 height=400></applet>*/