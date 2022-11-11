import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.applet.*; 
import javax.media.*;
 
public class play2 extends Applet implements ActionListener, ControllerListener 
{
 
	Button b1, b2;
	Player player;
	
        public void init()
        {
	b1 = new Button();
	b1.setLabel("PLAY");
	b1.addActionListener(this);
	add(b1);
 
	b2 = new Button();
	b2.setLabel("STOP");
	b2.addActionListener(this);
	add(b2);
 
	}
 
	
	public void actionPerformed(ActionEvent e) {
 
		if(e.getActionCommand().equals("PLAY")){
 
			try{
 
				player = Manager.createPlayer(new URL(getCodeBase(),"au2.mp3"));
				player.addControllerListener(this);
 
				player.start();
 
			}
			catch(Exception ex){
				ex.printStackTrace();
			}
 
		}else if(e.getActionCommand().equals("STOP")){
			player.stop();
		}else{
			player.stop();
		}
 
	}
 
        public void controllerUpdate(ControllerEvent c) 
        {
		
		if(player==null)
		return;
 
	}
}
