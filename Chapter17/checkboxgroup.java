import java.awt.*;
import java.applet.Applet;
public class checkboxgroup extends Applet
{
public void init() 
{
CheckboxGroup cbg = new CheckboxGroup();
Checkbox c1 = new Checkbox ("Yes", cbg, true);
Checkbox c2 = new Checkbox ("No", cbg, false);
add(c1);
add(c2);
}
}
/*<applet code=checkboxgroup width=500 height=500></applet>*/
