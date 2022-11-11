import java.awt.* ;
import java.awt.event.* ;
public class Myframe
{
public static void main(String[] args)
{
Frame f = new Frame();
program p= new program(f);
}
}
class program implements ActionListener
{
static int count = 0;
Button b;
TextField t;
program(Frame f)
{
f.setSize(200,200);
f.setLayout(new FlowLayout());
b=new Button("OK");
b.addActionListener(this);
t=new TextField("Hello Tanweer", 30);
f.add(t);
f.add(b);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b)
{
count++ ;
System.out.println("Button is Pressed");
t.setText("Hello Tanweer Click "+ count);
}
}
}
