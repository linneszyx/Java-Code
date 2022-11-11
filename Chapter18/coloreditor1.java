import java.awt.*;
import java.awt.event.*;
class ColorEditor extends Frame
{
	TextField t1;
	Scrollbar sc1,sc2,sc3;
	ColorEditor()
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
		sc2=new Scrollbar(Scrollbar.HORIZONTAL,5,5,0,260);
		sc2.setBounds(10,150,300,30);
		this.add(sc2);
		sc2.addAdjustmentListener(new AdjustmentListener(){public void adjustmentValueChanged(AdjustmentEvent e){sc2_Scroll();}});
		sc3=new Scrollbar(Scrollbar.HORIZONTAL,5,5,0,260);
		sc3.setBounds(10,200,300,30);
		this.add(sc3);
		sc3.addAdjustmentListener(new AdjustmentListener(){public void adjustmentValueChanged(AdjustmentEvent e){sc3_Scroll();}});
		this.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
	}
	void sc1_Scroll()
	{
		int x=sc1.getValue();
		Color c=new Color(x,0,0);
		sc1.setBackground(c);

	}
	void sc2_Scroll()
		{
			int x=sc2.getValue();
			Color c=new Color(0,x,0);
			sc2.setBackground(c);

	}
	void sc3_Scroll()
		{
			int x=sc3.getValue();
			Color c=new Color(0,0,x);
			sc3.setBackground(c);

	}
}
class coloreditor1
{
	public static void main(String[] ar)
	{
		(new ColorEditor()).setVisible(true);
	}
}