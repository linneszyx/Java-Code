import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame
{
	MyFrame()
	{
		this.setSize(600,600);
		this.setTitle("Window Application");
		this.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
		this.setLayout(new CardLayout(10,10));
		Panel p1=new Panel();
		Panel p2=new Panel();
		this.add(p1,"K1");
		p1.setLayout(new BorderLayout(0,20));
		p1.add(new TextField(),BorderLayout.NORTH);
		p1.add(p2);
		p2.setLayout(new GridLayout(3,6,5,5));
		for(int i=1;i<=5;i++)
		p2.add(new Button(i+""));


	}
}
class panel1
{
	public static void main(String[] ar)
	{
		MyFrame f=new MyFrame();
		f.setVisible(true);
	}
}