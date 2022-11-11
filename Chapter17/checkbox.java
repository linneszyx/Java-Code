
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class checkbox extends Applet implements ItemListener
{
	Checkbox c1,c2,c3;
	public void init()
	{
		c1 = new Checkbox("RED");
		add(c1);
                c2 = new Checkbox("Green");
		add(c2);
                c3 = new Checkbox("BLUE");
		add(c3);
		c1.addItemListener(this);
                c2.addItemListener(this);
                c3.addItemListener(this);
	}
	
        public void itemStateChanged(ItemEvent e)
	{
		if (e.getItemSelectable() == c1)
		{

			setBackground(Color.RED);
		}
                else if (e.getItemSelectable() == c2)
		{

			setBackground(Color.GREEN);
		}
                else if (e.getItemSelectable() == c3)
		{

			setBackground(Color.BLUE);
		}
	}
}
/*<applet code=checkbox width=500 height=500></applet>*/