class Super 
{
void addNum(int x,int y) 
{
int sum;
sum=x+y;
System.out.println("Sum of Number="+sum);
}
void display() 
{
System.out.println("This is the method of SuperClass");
}
}

class Sub extends Super 
{
public static void main(String args[]) 
{
Super s1 = new Super();
s1.display();
s1.addNum(10,20);
}
}
