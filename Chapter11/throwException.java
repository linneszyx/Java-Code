class throwException 
{
static void throwMethod() 
{
try 
{
throw new NullPointerException("This is null pointer Exception");
} 
catch(NullPointerException e) 
{
System.out.println("Caught the exception inside throwMethod");
throw e; 
}
}
public static void main(String args[]) 
{
try 
{
throwMethod();
} 
catch(NullPointerException e) 
{
System.out.println("Recaught after throwMethod " + e);
}
}
}
