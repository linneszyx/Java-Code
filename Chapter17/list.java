import java.awt.*;
import java.applet.*;
public class list extends Applet 
{
public void init() 
{
List l = new List (3, true);
l.addItem("Tanweer");
l.addItem("Anjum");
l.addItem("AAtif");
add(l); 
}
}

/*<applet code=list width=200 height=200></applet>*/
