import java.awt.*;
import java.awt.event.*;
class Frame1 extends Frame
{
	TextField t1;
	Scrollbar sc1;
	Frame1()
	{
		this.setSize(400,400);
		this.setLayout(null);
		t1=new TextField();
		t1.setBounds(10,50,150,30);
		this.add(t1);
		sc1=new Scrollbar(Scrollbar.HORIZONTAL,5,5,0,260);
		sc1.setBounds(10,100,300,30);
		this.add(sc1);
		sc1.addAdjustmentListener(new AdjustmentListener(){public void adjustmentValueChanged(AdjustmentEvent e){sc1_Scroll();}});
		this.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
	}
	void sc1_Scroll()
	{
		int x=sc1.getValue();
		Color c=new Color(x,0,0);
		t1.setBackground(c);

	}
}
class Frame_scroll
{
	public static void main(String[] ar)
	{
		(new Frame1()).setVisible(true);
	}
}