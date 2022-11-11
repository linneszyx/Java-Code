abstract class A 
{
public void print() 
{
System.out.println("Tanweer Alam");
}
abstract void display();
}

class abs2 extends A 
{
public void display() 
{
System.out.println("Implementing the abstract method");
}
public static void main(String args[]) 
{
abs2 obj =new abs2();
obj.print();
obj.display();
}
}
