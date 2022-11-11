abstract class A 
{
abstract void display();
void show() 
{
System.out.println("This is a method of abstract class");
}
}
class B1 extends A 
{
void display() 
{
System.out.println("This is the implementation of method of abstract class");
}
}
class abs1 
{
public static void main(String args[]) 
{
B1 b = new B1();
b.display();
b.show();
}
}
