import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class gridLayoutManager extends Applet
 {
 
     Button button1;
     Button button2;
     Button button3; 
     Button button4;
     Button button5;
 Button button6;
 Button button7;
 Button button8;
       public void init()
       {
        
        GridLayout f=new GridLayout(3,3,30,90);
        this.setLayout(f);
        button1 = new Button("Press A");
        button2 = new Button("Press B");
        button3 = new Button("Button 3");
        button4 = new Button("Button 4");
        button5 = new Button("Button 5");
        button6 = new Button("Button 6");
        button7 = new Button("Button 7");
        button8 = new Button("Button 8");
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.add(button5);
        this.add(button6);
        this.add(button7);
        this.add(button8);
        }
 }

        
   /*<applet code=gridLayoutManager.class width=300 height=300></applet>*/
    
