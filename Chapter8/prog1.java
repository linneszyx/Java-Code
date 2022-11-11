class A
{
    private int x;
    private void Method1() 
{
        System.out.println("this is the private Method");
    }
}
class prog1
{
   public static void main(String args[]) 
   {
        A objA = new A();
        objA.x = 15;      // illegal
        objA.Method1();      // illegal
    }
}
