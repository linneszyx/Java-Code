import java.awt.*;
import java.applet.Applet;
public class button extends Applet 
{
public void init() 
{
Scrollbar sb= new Scrollbar(Scrollbar.HORIZONTAL,50,50, 100,200);
add(sb);
 List d= new List(4,true);
d.add("Assam");
d.add("Uttar Pradesh");
d.add("New Delhi");
d.add("Mumbai");
add(d);
TextArea a= new TextArea(20,40);
TextField r= new TextField("Write anything out here...");
Label l= new Label("Programming in Java", Label.CENTER);
Button b = new Button("Hello");
CheckboxGroup c= new CheckboxGroup();
Checkbox c1= new Checkbox("Yes",c,true);
Checkbox c2= new Checkbox("No",c,false);
add(b);
add(c1);
add(c2);
add(l);
add(r);
add(a);
}

  public void paint(Graphics g)
{
   g.drawRect(100,100,300,250);
}

}
/*<applet code=button width=200 height=200></applet>*/

