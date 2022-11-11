import java.applet.*;
import java.awt.*;
import java.lang.Math;

public class App11 extends Applet {

   int width, height;
   int N = 25;
   Color[] spectrum;

   public void init() {
      width = getSize().width;
      height = getSize().height;
      setBackground( Color.black );

      spectrum = new Color[ N ];

      // Generate the colors and store them in the array.
      for ( int i = 0; i < N; ++i ) {
         // Here we specify colors by Hue, Saturation, and Brightness,
         // each of which is a number in the range [0,1], and use
         // a utility routine to convert it to an RGB value before
         // passing it to the Color() constructor.
         spectrum[i] = new Color( Color.HSBtoRGB(i/(float)N,1,1) );
      }
   }

   public void paint( Graphics g ) {

      int radius = width / 3;
      for ( int i = 0; i < N; ++i ) {

         // Compute (x,y) positions along a circle,
         // using the sine and cosine of an appropriately computed angle.
         double angle = 2*Math.PI*i/(double)N;
         int x = (int)( radius*Math.cos(angle) );
         int y = (int)( radius*Math.sin(angle) );

         g.setColor( spectrum[ i ] );
         g.drawString( "Tanweer", width/2+x, height/2+y );
      }
   }
}
/*<applet code="App11.class" width=400 height=400></applet>*/