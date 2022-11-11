import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class choice extends Applet implements ItemListener
{
	Choice c;
	public void init()
	{
		c = new Choice();
		c.add("RED");
                c.add("GREEN");
                c.add("BLUE");
                add(c);
                c.addItemListener(this);
	}
	
        public void itemStateChanged(ItemEvent e)
	{
		if (e.getItemSelectable() == c)
		{
                       if(c.getSelectedItem()=="RED")
                        {
                       setBackground(Color.RED);                   
                        }
                       if(c.getSelectedItem()=="GREEN")
                        {
                       setBackground(Color.GREEN);                   
                        }
                       if(c.getSelectedItem()=="BLUE")
                        {
                       setBackground(Color.BLUE);                   
                        }
		
		}
              
	}
}
/*<applet code=choice width=500 height=500></applet>*/