//Client Program
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
public class Client extends Frame implements ActionListener,Runnable 
{
	Socket s;
	BufferedReader br;
	BufferedWriter bw;
	TextField t;
	Button b1,b2;
	List l;
	public Client(String str)
	{
		super(str);
		setSize(300,300);
		setLocation(300,0);
		this.setLayout(null);
		l = new List();
l.setBounds(50,50,170,170);
add(l);
t = new TextField();
t.setBounds(50,230,100,20);
add(t);
b1 = new Button("Send");
b1.setBounds(155,230,40,30);
add(b1);
b2 = new Button("Exit");
b2.setBounds(200,230,40,30);
add(b2);
setBackground(Color.PINK);
b1.addActionListener(this);
b2.addActionListener(this);
setVisible(true);
		try{
			s = new Socket("127.0.0.1",100);
			br = new BufferedReader(new InputStreamReader(
					s.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(
					s.getOutputStream()));
			Thread th;
			th = new Thread(this);
			th.start();
			
		}catch(Exception e){}
		
	}
	public void actionPerformed ( ActionEvent e)
	{
		 if (e.getSource().equals(b2))
			 System.exit(0);
		 else{try{
			 bw.write(t.getText());
			 bw.newLine();
                         bw.flush();
			
			  }catch(Exception e2){}
		 }
				  
	}

       public static void main(String arg[])
	{
		new Client("Client Program");
		
	}
	public void run()
	{
		try
                {
                 s.setSoTimeout(1);
                }
               catch(Exception e3)
               {}
		while (true)
		{
			try{l.addItem(br.readLine());
			}catch (Exception e4){}
		}
	}
	
	
	
}
