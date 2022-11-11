final class Super
{
 void disply()
{
 System.out.println("implementation of final method and classes");
}
}
 class sub extends Super
{
 public static void main(String args[])
{
  Super s1= new Super();
 s1.display();
}
}