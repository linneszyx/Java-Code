class exception2 
{
public static void main(String args[]) 
{
try 
{
int a=args.length;
System.out.println("a="+a);
int b = 10/a;
int c[]={3};
c[10]=87;
} 
catch(ArithmeticException e) 
{
System.out.println("Divide by Zero" + e);
} 
catch(ArrayIndexOutOfBoundsException e) 
{
System.out.println("Array index Out of Bound"+e);
}
System.out.println("After try/catch blocks");
}
}
