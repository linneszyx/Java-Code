import java.awt.*; 
import java.applet.*; 
import java.net.*; 
public class Image3 extends Applet 
{ 
      Image i; 
     URL base; 
     MediaTracker mt; 
     public void init()  
     { 
     mt = new MediaTracker(this); 
  
         try { 
                  base = getDocumentBase(); 
         } 
         catch (Exception e) {} 
            i = getImage(base,"tanweer1.jpeg"); 
            mt.addImage(i,1); 
           try { 
               mt.waitForAll(); 
          } 
          catch (InterruptedException  e) {} 
       } 
     public void paint(Graphics g)  
     { 
            g.drawImage(i,20,20,this); 
           // g.drawImage(i,20,140,30,40,this); 
  
     } 
} 
/*<applet code=Image2 width=400 height=400></applet>*/