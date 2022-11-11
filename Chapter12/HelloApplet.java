import java.awt.*;

 public class HelloApplet extends java.applet.Applet
{
  final String message= "Hello Everyone";
  public Font font;

public void init()
{
  font= new Font("Helvetica",Font.bold,60);
}
  public void paint(Graphics g)
{
  g.setColor(Color.green);
  g.fillOval(10,10,300,100);
  g.drawOval(10,10,300,100);
g.drawOval(10,10,320,100);
g.setColor(Color.black);
g.drawOval(10,10,330,100);
g.drawOval(10,10,340,100);
g.setFont(font);
  g.drawString(message,50,50);
}
}