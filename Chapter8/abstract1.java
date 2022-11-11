abstract class A 
{
abstract void display();
void show() 
{
System.out.println("This is a method of abstract class");
}
}
class B extends A 
{
void display() 
{
System.out.println("This is the implementation of method of abstract class");
}
}
class abstract1 
{
public static void main(String args[]) 
{
B b = new B();
b.display();
b.show();
}
}
