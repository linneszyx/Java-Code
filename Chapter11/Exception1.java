class Exception1 
{
public static void main(String args[]) 
{
int x, y;
try 
{ 
x = 0;
y = 10 / x;
System.out.println("Error in output");
} 
catch (ArithmeticException e) 
{ 
System.out.println(e);
}
System.out.println("This is the last statement.");
}
}
