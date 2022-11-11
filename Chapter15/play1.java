import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class play1 extends Applet implements ActionListener
{
  Button b1,b2;
  AudioClip ac;

  public void init()
  {
    b1 = new Button("Play");
    add(b1);
    b1.addActionListener(this);
    b2 = new Button("Stop");
    add(b2);
    b2.addActionListener(this);
    ac = getAudioClip(getCodeBase(), "a.wav");
  }
  
  public void actionPerformed(ActionEvent ae)
  {
    if(ae.getSource()==b1)
    {
      ac.play();
    }
    else if(ae.getSource()==b2)
    {
      ac.stop();
    }
  }
} 

/*<applet code=play1 width=400 height=400></applet>*/