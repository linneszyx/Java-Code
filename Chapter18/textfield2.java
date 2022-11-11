import java.awt.*;
import java.awt.event.*;
class Frame1 extends Frame implements MouseListener,MouseMotionListener
{
	TextField t1=new TextField();
	TextField t2=new TextField();
	TextField t3=new TextField();
	TextField t4=new TextField();
	Frame1()
	{
		this.setSize(600,400);
		this.setLayout(null);
		this.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
		t1.setBounds(10,50,150,30);
		t2.setBounds(10,100,150,30);
		t3.setBounds(10,150,150,30);
		t4.setBounds(10,200,150,30);
		this.add(t1);this.add(t2);this.add(t3);this.add(t4);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}
	public void mouseMoved(MouseEvent e)
	{
		int x=e.getX();
		int y=e.getY();
		t2.setText("X="+x+",Y="+y);
	}
	public void mouseDragged(MouseEvent e)
	{
	}
	public void mousePressed(MouseEvent e)
	{
		t1.setText("Mouse Press");
	}
	public void mouseClicked(MouseEvent e)
	{
		t1.setText("Mouse Click");
	}
	public void mouseReleased(MouseEvent e)
	{
		t1.setText("Mouse Releaesed");
	}
	public void mouseEntered(MouseEvent e)
	{
		t1.setText("Mouse Enter");
	}
	public void mouseExited(MouseEvent e)
	{
		t1.setText("Mouse Exit");
	}

}
class textfield2
{
	public static void main(String[] at)
	{
		Frame1 f=new Frame1();
		f.setVisible(true);
	}
}
