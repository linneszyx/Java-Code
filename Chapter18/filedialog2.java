import java.awt.*;
import java.awt.event.*;
import java.io.*;
class F1 extends Frame
{
	Button b1,b2;
	TextArea ta=new TextArea();
	F1()
	{
		setLayout(null);
		this.setTitle("Main Window");
		this.setSize(700,700);
		this.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
		b1=new Button("Open");
		b1.setBounds(10,30,100,30);
		this.add(b1);
		b1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){b1_Click();}});
		ta.setBounds(10,90,600,600);
		Font f=new Font("Arial",Font.PLAIN,18);
		ta.setFont(f);
		this.add(ta);
	}
	void b1_Click()
	{
		FileDialog fd=new FileDialog(this,"Open as...",FileDialog.LOAD);
		fd.setVisible(true);
		String s1=fd.getDirectory()+fd.getFile();
		try{
			FileReader fr=new FileReader(s1);
			String data="";
			int x=fr.read();
			while(x>=0)
			{
				data=data+(char)x;
				x=fr.read();
			}
			ta.setText(data);
		}catch(Exception e){}

	}
}
class filedialog2
{
	public static void main(String[] ar)
	{
		(new F1()).setVisible(true);
	}
}