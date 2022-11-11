import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class AppBackBuffer extends Applet
   implements MouseMotionListener {

   int width, height;
   Image i;
   Graphics g1;

   public void init() {
      width = getSize().width;
      height = getSize().height;

      i = createImage( width, height );
      g1 = i.getGraphics();
      g1.setColor( Color.black );
      g1.fillRect( 0, 0, width, height );
      g1.setColor( Color.white );

      addMouseMotionListener( this );
   }

   public void mouseMoved( MouseEvent e ) { }
   public void mouseDragged( MouseEvent e ) {
      int x = e.getX();
      int y = e.getY();
      g1.fillOval(x-5,y-5,10,10);
      repaint();
      e.consume();
   }

   public void update( Graphics g ) {
      g.drawImage( i, 0, 0, this );
   }

   public void paint( Graphics g ) {
      update( g );
   }
}/*<applet code="AppBackBuffer.class" width=400 height=400></applet>*/
