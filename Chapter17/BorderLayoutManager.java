import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class BorderLayoutManager extends Applet
 {
 
     Button button1;
     Button button2;
     Button button3; 
     Button button4;
     Button button5;
       public void init()
       {
        
        BorderLayout f=new BorderLayout();
        this.setLayout(f);
        button1 = new Button("Button 1");
        button2 = new Button("Button 2");
        button3 = new Button("Button 3");
        button4 = new Button("Button 4");
        button5 = new Button("Button 5");
        this.add(button1,BorderLayout.SOUTH);
        this.add(button2,BorderLayout.NORTH);
        this.add(button3,BorderLayout.EAST);
        this.add(button4,BorderLayout.WEST);
        this.add(button5,BorderLayout.CENTER);
        }
 }

        
   /*<applet code=BorderLayoutManager.class width=300 height=300></applet>*/
    
