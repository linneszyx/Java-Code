import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class cardLayoutManager extends Applet implements ActionListener
 {
 
     Button button1;
     Button button2;
     Button button3;
     CardLayout crd;
     Panel p,p1,p2;
      public void init() 
       {
        crd=new CardLayout();
        
        button1 = new Button("next");
        button2 = new Button("card1");
        button3 = new Button("card2");
setBackground(Color.yellow);
        p=new Panel();
        p1=new Panel();
        p2=new Panel();
        p.setLayout(crd);
p.setBackground(Color.red);
        add(button1);     
        p1.add(button2);
        p2.add(button3);
        p.add(p1);
        p.add(p2);
add(p);
        button1.addActionListener(this);
}
public void actionPerformed(ActionEvent e) 
{
                if(e.getSource()==button1)
                {
                crd.next(p);
                crd.show(p,"Hello");                      
                }
}
}

  /*
  <applet code="cardLayoutManager" width=300 height=300>
  </applet>
*/   
