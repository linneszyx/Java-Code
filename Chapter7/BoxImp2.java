class Box
{
double w;
double h;
double d;
void volume()
{
System.out.println("Volume is"+(w * h * d));
}
}
class BoxImp2
{
public static void main(String args[])
{
Box b1 = new Box();
Box b2 = new Box();
b1.w = 8;
b1.h = 12;
b1.d = 6;
b1.volume();
b2.w = 12;
b2.h = 18;
b2.d = 9;
b2.volume();
}
}