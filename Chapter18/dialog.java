import java.awt.*;
import java.awt.event.*;
class F1 extends Frame
{
	Button b1,b2;
	F1()
	{
		setLayout(null);
		this.setTitle("Main Window");
		this.setSize(700,700);
		this.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
		b1=new Button("Open");
		b1.setBounds(50,50,100,30);
		this.add(b1);
		b1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){b1_Click();}});
	}
	void b1_Click()
	{
		F2 f=new F2(this);
		f.setVisible(true);
		b1.setLabel("Click");
	}
}
class F2 extends Dialog
{
	Button b1,b2;
	F2(Frame parent)
	{
		super(parent,true);
		setLayout(null);
		this.setTitle("Main Window");
		this.setSize(300,300);
		this.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){setVisible(false);}});
	}
}
class dialog
{
	public static void main(String[] ar)
	{
		(new F1()).setVisible(true);
	}
}