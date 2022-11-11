class abc 
{
void display() 
{
System.out.println("This method has no parameters");
}
void display(int x) 
{
System.out.println("x: " + x);
}
void display(int x, int y) 
{
System.out.println("x and b: " + x + " " + y);
}
double display(double x) 
{
System.out.println("double x: " + x);
return x*x;
}
}
class Overload 
{
public static void main(String args[]) 
{
abc obj = new abc();
double result;
obj.display();
obj.display(5);
obj.display(10, 15);
result = obj.display(12.32);
System.out.println("Result of obj.display(12.32): " + result);
}
}
