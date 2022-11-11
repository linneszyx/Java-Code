import java.applet.*; 
import java.awt.*; 
             
public class Image1 extends Applet
{
  Image i;
  MediaTracker tr;
  public void paint(Graphics g) 
  {
    tr = new MediaTracker(this);
    i = getImage(getCodeBase(), "aatif.jpg");
    tr.addImage(i,0);
    g.drawImage(i, 0, 0, this);
  } 
}
/*<applet code=Image1 width=400 height=400></applet>*/
   