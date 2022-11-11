class constructor1
{  
int x,y;  
constructor1(int a, int b)
{    
x = a; 
y = b;  
}  
constructor1()
{     
x = 10;     
y = 20;  
}  
int area()
{    
int a1 = x*y;    
return(a1);  
}
}
public class con1 
{   
public static void main(String[] args)   
{     
constructor1 c1 = new constructor1();     
System.out.println("Area of rectangle is= " + c1.area());     
constructor1 c2 = new constructor1(12,15);     
System.out.println("Area of rectangle is= " + c2.area());   
}
}