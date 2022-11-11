class Box 
{
int w=5;
int h=10;
int d=15;
int volume;
void display()
{
volume = w * h * d;
System.out.println("Volume is " + volume);
}
}
class BoxImp1 
{
public static void main(String args[]) 
{
Box b = new Box();
b.display();
}
}
