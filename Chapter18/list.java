import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class list extends Applet implements ItemListener
{
	List l;
	public void init()
	{
		l = new List();
		l.add("RED");
                l.add("GREEN");
                l.add("BLUE");
                add(l);
                l.addItemListener(this);
	}
	
        public void itemStateChanged(ItemEvent e)
	{
		if (e.getItemSelectable() == l)
		{
                       if(l.getSelectedItem()=="RED")
                        {
                       setBackground(Color.RED);                   
                        }
                       if(l.getSelectedItem()=="GREEN")
                        {
                       setBackground(Color.GREEN);                   
                        }
                       if(l.getSelectedItem()=="BLUE")
                        {
                       setBackground(Color.BLUE);                   
                        }
		
		}
              
	}
}
/*<applet code=list width=200 height=200></applet>*/