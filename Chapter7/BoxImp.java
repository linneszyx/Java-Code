class Box 
{
int w;
int h;
int d;
}
class BoxImp 
{
public static void main(String args[]) 
{
Box b = new Box();
int volume;
b.w = 5;
b.h = 10;
b.d = 15;
volume = b.w * b.h * b.d;
System.out.println("Volume is " + volume);
}
}