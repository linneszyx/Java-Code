import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;
public class dateApp extends Applet
{
	Button b1=new Button("Start");
	String s1="";
	public void init()
	{
		this.setLayout(null);
		this.setSize(300,300);
		b1.setBounds(50,200,100,30);
		b1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){b1_Click();}});
		this.add(b1);
	}
	public void paint(Graphics g)
	{setBackground(Color.YELLOW);
		Font f=new Font("Arial",Font.BOLD,20);
		g.setFont(f);
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
						Math.random();
						repaint();
						Thread.sleep(1000);
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
}/*<applet code="dateApp.class" width=400 height=400></applet>*/