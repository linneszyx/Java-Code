class A 
{
void print() 
{
System.out.println("Tanweer Alam in class A");
}
}
class B1 extends A 
{
void print() 
{
System.out.println("Tanweer Alam in class B");
}
}
class C extends A 
{
void print() 
{
System.out.println("Tanweer Alam in class C");
}
}
class Dispatch1 
{
public static void main(String args[]) 
{
A a = new A(); 
B1 b = new B1(); 
C c = new C(); 
A r; 
r = a; 
r.print(); 
r = b; 
r.print();
r = c; 
r.print(); 
}
}
