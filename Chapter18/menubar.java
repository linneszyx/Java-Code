import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
class Frame1 extends Frame
{
	MenuBar mbar=new MenuBar();
	Menu m1,m2;
	MenuItem m11,m12,m13,m14,m21,m22,m23,m24;
        TextArea t;
//Graphics g;
	public void init()
	{
		this.setSize(300,300);
		this.setLayout(null);
                t=new TextArea();
                t.setBounds(50,50,200,200);
                this.add(t);
		this.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
		m1=new Menu("Background Color");
		m2=new Menu("Foreground");
		m11=new MenuItem("red");
		m12=new MenuItem("green");
		m13=new MenuItem("blue");
		m14=new MenuItem("yello");
		m21=new MenuItem("red");
		m22=new MenuItem("green");
		m23=new MenuItem("blue");
		m24=new MenuItem("yello");
		mbar.add(m1);
                mbar.add(m2);
		m1.add(m11);
                m1.add(m12);
                m1.addSeparator();
                m1.add(m13);
                m1.add(m14);
		m2.add(m21);
                m2.add(m22);
                m2.addSeparator();
                m2.add(m23);
                m2.add(m24);
		this.setMenuBar(mbar);
		m11.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){b1_Click();}});
	        m12.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){b2_Click();}});
                m13.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){b3_Click();}});
                m14.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){b4_Click();}});
                m21.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){b5_Click();}});
                m22.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){b6_Click();}});
                m23.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){b7_Click();}});
                m24.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){b8_Click();}});
//g=getGraphics();
}
public void paint(Graphics g)
{
g.drawString("Tanweer Alam",10,10);
}

void b1_Click() 
	{//System.out.println(g);
		this.setBackground(Color.RED);
//try{}catch(Exception e){System.out.println(e);}
	}
void b2_Click()
	{
		this.setBackground(Color.GREEN);
	}
void b3_Click()
	{
		this.setBackground(Color.BLUE);
	}
void b4_Click()
	{
		this.setBackground(Color.YELLOW);
	}

void b5_Click()
	{
		t.setForeground(Color.RED);
	}

void b6_Click()
	{
		t.setForeground(Color.GREEN);
	}
void b7_Click()
	{
		t.setForeground(Color.BLUE);
	}
void b8_Click()
	{
		t.setForeground(Color.YELLOW);
	}
	public void paint(Graphics g)
	{

	}
}
class menubar
{
	public static void main(String[] ar)
	{
		(new Frame1()).setVisible(true);
	}
}