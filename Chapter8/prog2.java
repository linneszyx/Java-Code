class A
{
    protected int x;
    protected void Method1() 
{
        System.out.println("this is the protected Method");
    }
}
class prog2
{
   public static void main(String args[]) 
   {
        A objA = new A();
        objA.x = 15;      // illegal
        objA.Method1();      // illegal
    }
}
