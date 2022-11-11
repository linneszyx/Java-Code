import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class play3 extends Applet implements ActionListener 
{

	Button b1,b2,b3;
	
	AudioClip ac;
	
	public void init() 
       {
	
		b1 = new Button("Play");
		add(b1);
		b1.addActionListener(this);
		b2 = new Button("Stop");
		add(b2);
		b2.addActionListener(this);
		b3 = new Button("Loop");
		add(b3);
		b3.addActionListener(this);
		ac = getAudioClip(getCodeBase(), "OMKARA.wav");
		
	} 
	
	public void actionPerformed(ActionEvent e) 
        {
	
		if (e.getSource() == b1)
		ac.play();
		if (e.getSource() == b2)
		ac.stop();
		if (e.getSource() == b3)
		ac.loop();
	
	} 
} 
/*<applet code=play3 width=400 height=400></applet>*/