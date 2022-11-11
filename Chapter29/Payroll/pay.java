import java.io.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class PayProg extends JFrame implements ActionListener 
{
       JTextField tid,tdepart,tdays,tname;
       JTextField tsal,trate;
       JRadioButton rbmale,rbfemale;
       JButton badd,bsave,bupdate,bdelete,bexit;
       JButton bnext,bprev,blast,bfirst;
       JButton bcalculate;
       JLabel jl=new JLabel("Payroll Management System");
       Font f=new Font("Times New Roman",Font.BOLD,36);
       Font f1=new Font("Times New Roman",Font.BOLD,18);
       Font f2=new Font("Times New Roman",Font.BOLD,14);
       JLabel lid,lname,ldept,ldays,lrate,lsub;
       JLabel lsal;
       String gen;
       ResultSet rs=null;
       Connection con=null;
       Statement stmt=null;
       float days,rate,salary;
       PayProg()
       {
       super("Payroll Management System ");
       addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent we)
                {
                System.exit(0);
                }
       });
       setLayout(null);
       lsub=new JLabel("Developed By : Atul Pal, Assistant Professor, BBDNIIT");
       add(lsub);
       lsub.setHorizontalAlignment(lsub.CENTER );
       lsub.setBounds(220,510,450,20);
       lsub.setFont(f1);
       add(jl);
       jl.setBounds(200,50,500,100);
       jl.setHorizontalAlignment(jl.CENTER );
       jl.setFont(f);
       lid=new JLabel("ID");
       lname=new JLabel("NAME");
       ldept=new JLabel("DEPARTMENT");
       ldays=new JLabel("N0. OF DAYS ");
       lrate=new JLabel("RATE PER DAY");
       lsal=new JLabel("SALARY");
       lid.setBounds(200,150,100,20);
       lname.setBounds(200,190,100,20);
       ldept.setBounds(200,230,100,20);
       ldays.setBounds(200,270,100,20);
       lrate.setBounds(200,310,100,20);
       lsal.setBounds(200,350,100,20);
       add(lid);
       add(lname);
       add(ldept);
       add(ldays);
       add(lrate);
       add(lsal);
       lid.setFont(f2);
       lname.setFont(f2);
       ldept.setFont(f2);
       ldays.setFont(f2);
       lrate.setFont(f2);
       lsal.setFont(f2);
       tid=new JTextField(15);
       tname=new JTextField(15);
       tdepart=new JTextField(15);
       tdays=new JTextField(15);
       trate=new JTextField(15);
       tsal=new JTextField(15);
       tid.setBounds(300,150,100,20);
       tname.setBounds(300,190,100,20);
       tdepart.setBounds(300,230,100,20);
       tdays.setBounds(300,270,100,20);
       trate.setBounds(300,310,100,20);
       tsal.setBounds(300,350,100,20);
       add(tid);
       add(tname);
       add(tdepart);
       add(tdays);
       add(trate);
       add(tsal);
       badd=new JButton("Add");
       bsave=new JButton("Save");
       bupdate=new JButton("Update");
       bdelete=new JButton("Delete");
       badd.setToolTipText("Click this button to Add record in the Database.");
       bsave.setToolTipText("Click this button to Save record in the Database.");
       bupdate.setToolTipText("Click this button to Update record in the Database.");
       bdelete.setToolTipText("Click this button to Delete record in the Database.");
       badd.setBounds(500,150,100,30);
       bsave.setBounds(500,190,100,30);
       bupdate.setBounds(500,230,100,30);
       bdelete.setBounds(500,270,100,30);
       add(badd);
       add(bsave);
       add(bdelete);
       add(bupdate);
       badd.addActionListener(this);
       bsave.addActionListener(this);
       bupdate.addActionListener(this);
       bdelete.addActionListener(this);
       bfirst=new JButton("First");
       bnext=new JButton("Next");
       bprev=new JButton("Previous");
       blast=new JButton("Last");
       bfirst.setToolTipText("Click this button to move to the First Record.");
       bnext.setToolTipText("Click this button to move to the Next Record.");
       bprev.setToolTipText("Click this button to move to the Previous Record.");
       blast.setToolTipText("Click this button to move to the Last Record.");
       bfirst.setBounds(620,150,100,30);
       bnext.setBounds(620,190,100,30);
       bprev.setBounds(620,230,100,30);
       blast.setBounds(620,270,100,30);
       add(bfirst);
       add(bnext);
       add(bprev);
       add(blast);
       bfirst.addActionListener(this);
       bnext.addActionListener(this);
       bprev.addActionListener(this);
       blast.addActionListener(this);
       bexit=new JButton("Exit");
       bexit.setToolTipText("Click this button to Quit Program.");
       bexit.setBounds(560,350,100,30);
       add(bexit);
       bexit.addActionListener(this);
       bcalculate=new JButton("Compute");
       bcalculate.setToolTipText("Click this button to compute the salary of the employee.");
       bcalculate.setBounds(360,400,100,30);
       add(bcalculate);
       bcalculate.addActionListener(this);
       dbOpen();
       }

       
       public void actionPerformed(ActionEvent ae)
	{
		try
		{
			
	 		if(ae.getActionCommand()=="Add")
			{
				tid.setText("");
				tname.setText("");
				tdepart.setText("");
				tdays.setText("");
				trate.setText("");
				tsal.setText("");
			}
			if(ae.getActionCommand()=="Update")
			{
			
				
			 stmt.executeUpdate("UPDATE pay1 SET name='" + tname.getText() + "',department='" + tdepart.getText() + "',days='" + tdays.getText() + "',rate='" + trate.getText()+ "',salary='" + tsal.getText() + "' WHERE id=" + tid.getText() + "");
			 
				dbClose();
				dbOpen();
			}
			if(ae.getActionCommand()=="Delete")
			{
				stmt.executeUpdate("DELETE FROM pay1 WHERE id=" + tid.getText() + "");			
				dbClose();
				dbOpen();
			}	
			if(ae.getActionCommand()=="Save")
			{

  	             stmt.executeUpdate("INSERT  INTO pay1 VALUES('" +tid.getText()+ "','"+ tname.getText() + "','" + tdepart.getText() + "','" + tdays.getText() + "','"+trate.getText() + "','" +tsal.getText() +"')");
		
		
		
				dbClose();
				dbOpen();
			}
			if(ae.getActionCommand()=="Next")
			{
				if(rs.next())
				{
					setText();                 			
				}
				else
				{
					JOptionPane.showMessageDialog(null, "You are At Already Last Record", "Message", JOptionPane.ERROR_MESSAGE);	
                  		}
			}
			if(ae.getActionCommand()=="Previous")
			{
				if(rs.previous())
				{
                  			setText();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "You Are At Already First Record", "Message", JOptionPane.ERROR_MESSAGE);
                  		}
			}
			if (ae.getActionCommand()=="First")
			{
				if(rs.first())
				{
					setText();
				}
			}
			if (ae.getActionCommand()=="Last")
			{
				if(rs.last())
				{
					setText();
				}
			}
			
			if(ae.getActionCommand()=="Compute")
			{
		
		        days=Float.parseFloat(tdays.getText());
                        rate=Float.parseFloat(trate.getText());
                        salary=(days*rate);
                         float round = Round(salary,2);
                        tsal.setText(Float.toString(round));
		        tsal.setEditable(false);
			}
			if(ae.getActionCommand()=="Exit")
			{
			System.exit(0);		
			}
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	} 
	
  public static float Round(float Rval, int Rpl) {
  float p = (float)Math.pow(10,Rpl);
  Rval = Rval * p;
  float tmp = Math.round(Rval);
  return (float)tmp/p;
    }
	
	public void dbOpen()
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                        con=DriverManager.getConnection("jdbc:odbc:mydata");
			stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs = stmt.executeQuery("Select * from pay1");
			if(rs.next())
			setText();
		}catch(Exception e){}
	}
	public void dbClose()
	{
		try{stmt.close();
		rs.close();
		con.close();
		}catch(Exception e){}
	}
	public void setText(){
		try{
			tid.setText(rs.getString(1));
			tname.setText(rs.getString(2));
			tdepart.setText(rs.getString(3));
			tdays.setText(rs.getString(4));
			trate.setText(rs.getString(5));
			tsal.setText(rs.getString(6));
			
	    	}catch(Exception ex){}		
	    	}
}




public class pay
{
        public static void main(String ar[])throws Exception
        {
        UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        PayProg f1=new PayProg();
        f1.setSize(800,700);
        f1.setVisible(true);
      	
        }
}
