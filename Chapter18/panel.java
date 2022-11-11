
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class panel extends Applet implements ItemListener
{
	Checkbox c1,c2;
        Panel p1;
	public void init()
	{
                p1=new Panel();
                c1 = new Checkbox("RED Backgrond");
		add(c1);
                c2 = new Checkbox("Green Background");
		add(c2);
                p1.add(new Label("TANWEER ALAM"));
                add(p1);
                c1.addItemListener(this);
                c2.addItemListener(this);
        }
	public void itemStateChanged(ItemEvent e)
	{
		if (e.getItemSelectable() == c1)
		{
			p1.setBackground(Color.RED);
		}
                else if (e.getItemSelectable() == c2)
		{
			p1.setBackground(Color.GREEN);
		}
                
	}
}
/*<applet code=panel width=200 height=200></applet>*/