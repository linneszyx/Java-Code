import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.net.*;
public class imageApp extends Applet
{
	String s="";
	public void init()
	{
		this.setLayout(null);
		s="r7b.jpg";
		this.addMouseListener(new MouseAdapter(){public void mouseEntered(MouseEvent e){mouse_in();}});
		this.addMouseListener(new MouseAdapter(){public void mouseExited(MouseEvent e){mouse_out();}});
	}
	void mouse_in()
	{
		s="t2.jpg";
		repaint();
	}
	void mouse_out()
	{
		s="r7b.jpg";
		repaint();
	}
	public void paint(Graphics g)
	{
		try{
		URL u1=getCodeBase();
		String s1=u1.toString();
		s1=s1+s;
		URL u2=new URL(s1);
		Image img=getImage(u2);
		g.drawImage(img,10,60,300,300,this);
		}catch(Exception e){}
	}
}
/*<applet code="imageApp.class" width=400 height=400></applet>*/