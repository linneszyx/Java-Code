class constructor 
{
static final int MAX=4;
static int i = 0;
constructor() 
{
if(i<MAX) 
{
i++;
}
else 
{
System.out.println("No construct");
System.exit(1);
}
}
protected void finalize() 
{
i--;
}
static void fun()
{
constructor c = new constructor(); 
}
public static void main(String args[]) 
{
int j;
for(j=0; j < (MAX*2); j++) 
{
fun();
System.out.println("Current counter is: " + i);
}
}
}
