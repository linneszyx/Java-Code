import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;
public class datecolorApp extends Applet
{
	Button b1=new Button("Start");
	String s1="";
	Color c=Color.BLACK;
	public void init()
	{
		this.setLayout(null);
		this.setSize(300,300);
		b1.setBounds(50,10,100,30);
		b1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){b1_Click();}});
		this.add(b1);
	}
	public void paint(Graphics g)
	{
		Font f=new Font("Arial",Font.BOLD,20);
		g.setFont(f);
		g.setColor(c);
		g.drawString(s1,10,100);
	}
	class MT extends Thread
	{
		public void run()
		{
		try{
				while(true)
				{
					Date d=new Date();
					s1=d.toString();
					repaint();
					Thread.sleep(1000);
				}
			}catch(Exception ee){}
		}
	}
	class MT1 extends Thread
		{
			public void run()
			{
			try{
					while(true)
					{
						int r=(int)(Math.random()*255);
						int g=(int)(Math.random()*255);
						int b=(int)(Math.random()*255);
						c=new Color(r,g,b);
						repaint();
						Thread.sleep(200);
					}
				}catch(Exception ee){}
			}
	}
		void b1_Click()
		{
			MT t=new MT();
			MT1 t1=new MT1();
			t.start();
			t1.start();
		}
}/*<applet code="datecolorApp.class" width=400 height=400></applet>*/