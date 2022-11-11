import java.awt.*;
import java.awt.event.*;
class Frame1 extends Frame
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
		//b3.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){b1_Click(e);}});
		t1.setBounds(10,50,150,30);
		t2.setBounds(10,100,150,30);
		t3.setBounds(10,150,150,30);
		t4.setBounds(10,200,150,30);
		this.add(t1);this.add(t2);this.add(t3);this.add(t4);
		t1.addFocusListener(new FocusAdapter(){public void focusGained(FocusEvent e){t_gotFocus(e);}});
		t1.addFocusListener(new FocusAdapter(){public void focusLost(FocusEvent e){t_lostFocus(e);}});
		t2.addFocusListener(new FocusAdapter(){public void focusGained(FocusEvent e){t_gotFocus(e);}});
		t2.addFocusListener(new FocusAdapter(){public void focusLost(FocusEvent e){t_lostFocus(e);}});
		t3.addFocusListener(new FocusAdapter(){public void focusGained(FocusEvent e){t_gotFocus(e);}});
		t3.addFocusListener(new FocusAdapter(){public void focusLost(FocusEvent e){t_lostFocus(e);}});
		t4.addFocusListener(new FocusAdapter(){public void focusGained(FocusEvent e){t_gotFocus(e);}});
		t4.addFocusListener(new FocusAdapter(){public void focusLost(FocusEvent e){t_lostFocus(e);}});

	}
	void t_gotFocus(FocusEvent e)
	{
		Object x=e.getSource();
		TextField t=(TextField)x;
		t.setBackground(new Color(200,180,200));
	}
	void t_lostFocus(FocusEvent e)
	{
		Object x=e.getSource();
		TextField t=(TextField)x;
		t.setBackground(Color.WHITE);
	}


}
class textfield
{
	public static void main(String[] at)
	{
		Frame1 f=new Frame1();
		f.setVisible(true);
	}
}
