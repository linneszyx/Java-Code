import java.awt.*;
import java.applet.*;
public class sum1 extends Applet 
{
TextField t1,t2;
public void init()
{
t1 = new TextField(10);
t2 = new TextField(10);
t1.setText("0");
t2.setText("0");
add(t1);
add(t2);
}
public void paint(Graphics g) {
int a = 0;
int b = 0;
int sum;
String s1,s2,s3;
g.drawString("Enter Two Numbers", 20, 60);
try 
{
s1 = t1.getText();
a = Integer.parseInt(s1);
s2 = t2.getText();
b = Integer.parseInt(s2);
}
catch(Exception e1)
{ }

sum = a + b;
String str = "THE SUM OF TWO NO IS: "+String.valueOf(sum);
g.drawString (str,100, 125);
}
public boolean action(Event e, Object o)
{
repaint();
return true;
}
}
/* <APPLET CODE= "sum1.class" width= 400 height=400>
</APPLET>*/
