class P 
 {
    public void m1()
   {
   System.out.println("parent");
   }
  }
 class C extends P
 {
   public void m2()
{
 System.out.println("child");
}
  }
  class Test
{
 public static void main(String[] args)
{
   P p= new P();
    p.m1();
    p.m2();
}
}
