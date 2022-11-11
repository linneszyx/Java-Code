class Box 
{
int w;
int h;
int d;
Box(int a, int b, int c) 
{
w = a;
h = b;
d = c;
}
int volume() 
{
return w * h * d;
}
}
class BoxImp3 
{
public static void main(String args[]) 
{
Box b1 = new Box(5, 10, 12);
Box b2 = new Box(6, 12, 7);
int vol;
vol = b1.volume();
System.out.println("Volume is " + vol);
vol = b2.volume();
System.out.println("Volume is " + vol);
}
}
