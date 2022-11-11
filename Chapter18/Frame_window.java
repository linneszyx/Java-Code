import java.awt.*;
import java.awt.event.*;
class Frame1 extends Frame implements WindowListener
{
	Frame1()
	{
		this.setSize(400,400);
		this.addWindowListener(this);
	}
	public void windowDeactivated(WindowEvent e)
	{
		System.out.println("Deactivated");
	}
	public void windowActivated(WindowEvent e)
	{
		System.out.println("Activated");
	}
	public void windowIconified(WindowEvent e)
	{
		System.out.println("Iconified");
	}
	public void windowDeiconified(WindowEvent e)
	{
		System.out.println("Deiconified");
	}
	public void windowClosing(WindowEvent e)
	{
		System.out.println("Closing");
		System.exit(0);
	}
	public void windowClosed(WindowEvent e)
	{
		System.out.println("Closed");
	}
	public void windowOpened(WindowEvent e)
	{
		System.out.println("Opened");
	}

}
class Frame_window
{
	public static void main(String[] ar)
	{
		(new Frame1()).setVisible(true);
	}
}