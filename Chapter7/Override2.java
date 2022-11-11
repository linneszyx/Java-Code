class sum 
{
int x, y;
sum(int a, int b) 
{
x= a;
y= b;
}
final void display() 
{
System.out.println("Sum = " + (x+y));
}
}
class sub extends sum 
{
int z;
sub(int a, int b, int c) 
{
super(a, b);
z = c;
}
void display() 
{
System.out.println("Subtraction = " +(x-y));
}
}
class Override2 
{
public static void main(String args[]) 
{
sub s = new sub(1, 2, 3);
s.display();
}
}
