import java.applet.*; 
import java.awt.event.*; 
import java.awt.*; 

public class play4 extends Applet implements MouseListener 
{ 
     AudioClip a1; 
     AudioClip a2; 
     public void init()  
     {           
          a1 = getAudioClip(getCodeBase(),"junoo.wav"); 
          a2 = getAudioClip(getCodeBase(),"OMKARA.wav"); 
          addMouseListener(this); 
          setBackground(Color.yellow); 
          a1.play(); 
          
     } 
     public void paint(Graphics g)  
     { 
          g.drawString("Click to play another song",20,20); 
     } 
     public void mouseClicked(MouseEvent e)  
     { 
          a2.play(); 
     } 
     public void mousePressed(MouseEvent e) 
     {
     a2.play(); 
     } 
     public void mouseReleased(MouseEvent e) {} 
     public void mouseEntered(MouseEvent e) {} 
     public void mouseExited(MouseEvent e) {} 
    } 
/*<applet code=play4 width=400 height=400></applet>*/