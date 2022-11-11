class Area1 
{
static double area(double l, double b) 
{
if(b==0) 
return l * l;
else
return l * b;
}
static double area(double l) 
{
return l * l;
}
public static void main(String args[]) 
{
System.out.println("Area of 12.2 by 13.3 rectangle: " + area(12.2, 13.3));
System.out.println("Area of 12.0 by 12.0 square: " + area(12.0,0));
}
}
