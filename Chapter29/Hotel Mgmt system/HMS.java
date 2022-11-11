import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.applet.*;
public class HMS extends Applet implements ActionListener,ItemListener
{
 Label l1,l2,l3,l4;
 Choice c;
 List list1,list2;
 Button b1,b2,b3;
 TextField t1,t2,t3;
 int r1,r2,r3,r4,r5,r6,r7,r8,r9,i=0,sum=0,x;
        int b[]=new int[10];
 int a[]=new int[10];
public void init()
{
 l1=new Label("Select any one"); 
 add(l1);
 c=new Choice();
 c.add("Breakfast");
 c.add("Lunch");
 c.add("Dinner");
 add(c);
 l2=new Label("Items Available");
 add(l2);
 list1=new List(5,false);
 add(list1);
 l3=new Label("Quantity");
 add(l3);
 t1=new TextField(10);
 add(t1);
 b1=new Button("Add Order");
 add(b1);
 b2=new Button("Remove Order");
 add(b2);
 l4=new Label("Selected Items");
 add(l4);
 list2=new List(5,false);
 add(list2);
 l4=new Label("Price");
 add(l4);
 t2=new TextField(10);
 add(t2);
 b3=new Button("Bill");
 add(b3);
 t3=new TextField(10);
 add(t3);
 c.addItemListener(this);
 list1.addItemListener(this);
 b1.addActionListener(this);
 b2.addActionListener(this);
 b3.addActionListener(this);
}
public void itemStateChanged(ItemEvent e)
{
 if(e.getItemSelectable()==c)
 {
  if(c.getSelectedIndex()==0)
  { list1.clear();
   list1.add("Tea");
   list1.add("Cofee");
   list1.add("Cold Drink");
   list1.add("Milk");
  }
  else if(c.getSelectedIndex()==1)
  {
   list1.clear();
   list1.add("Burger");
   list1.add("Dosa");
   list1.add("Rice");
  }
  else if(c.getSelectedIndex()==2)
  {
   list1.clear();
   list1.add("Milk");
   list1.add("Soop");
   list1.add("Pizza");
  } 
 }

 if(e.getItemSelectable()==list1) 
   {
     if(list1.getSelectedItem()=="Milk")
 { t1.setText("");
   t2.setText("");
          r1=25;
   t2.setText(String.valueOf(r1));
 
         }
     else if(list1.getSelectedItem()=="Tea")
 { t1.setText("");
   t2.setText("");
   r2=5;
   t2.setText(String.valueOf(r2));
 }
     else if(list1.getSelectedItem()=="Cofee")
 { t1.setText("");
   t2.setText("");
   r3=15;
   t2.setText(String.valueOf(r3));
 }
     else if(list1.getSelectedItem()=="Cold Drink")
 { t1.setText("");
   t2.setText("");
          r4=24;
   t2.setText(String.valueOf(r4));
 }
     else if(list1.getSelectedItem()=="Burger")
 { t1.setText("");
   t2.setText("");
   r5=50;
   t2.setText(String.valueOf(r5));
 }
     else if(list1.getSelectedItem()=="Dosa")
 { t1.setText("");
   t2.setText("");
   r6=60;
   t2.setText(String.valueOf(r6));
 }
     else if(list1.getSelectedItem()=="Rice")
 { t1.setText("");
   t2.setText("");
   r7=25;
   t2.setText(String.valueOf(r7));
 }
     else if(list1.getSelectedItem()=="Soop")
 {
   t1.setText("");
   t2.setText("");
          r8=70;
   t2.setText(String.valueOf(r8));
 }
     else if(list1.getSelectedItem()=="Pizza")
 {
   t1.setText("");
          t2.setText("");
   r9=55;
   t2.setText(String.valueOf(r9));
 }
   }
}

public void actionPerformed(ActionEvent e)
{
 if(e.getSource()==b1)
 {
          b[i]=Integer.parseInt(t2.getText());
   a[i]=Integer.parseInt(t1.getText());
          i=i+1;
          list2.add(t1.getText()+")"+list1.getSelectedItem());
 }
        else if(e.getSource()==b2)
        {
           for(x=list2.getSelectedIndex();x<=i-1;x++)
             {
             
                 b[x]=b[x+1]; 
                 a[x]=a[x+1];
              }     
           list2.remove(list2.getSelectedItem());
 }
         if(e.getSource()==b3)
        {
          for(i=0;i<10;i++)
            sum=sum+a[i]*b[i];
        t3.setText(String.valueOf(sum)) ;
         }
}

}

/* <applet code="HMS.class" height=200 width=200>
</applet>
*/ 

