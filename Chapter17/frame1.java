import java.awt.*;
public class frame1
{
  public static void main(String[] args)
{
    Frame f = new Frame("Welcome to Frame");
    Label l = new Label("This is my first Frame program",Label.CENTER);
    f.add(l);
    f.setSize(400,400);
    f.setVisible(true);
  }
}
