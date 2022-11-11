final class Super 
{
void display() 
{
System.out.println("This is the method of final Class");
}
}

class subclass extends Super 
{
public static void main(String args[]) 
{
Super s1 = new Super();
s1.display();
}
}
