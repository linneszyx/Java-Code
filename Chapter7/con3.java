class Test
{
  int x,y;
  int i,k;

  Test(int x, int y)
  {
    this.x = x; 
    this.y = y; 
  }

  Test(int x, int y, int i, int k)
  {
    this(x,y);// Must be in first line
    this.i = i; 
    this.k = k; 
  }
public int display1()
{
return x*y;
}
public int display2()
{
return i*k;
}
 } 
class con3
{
    public static void main(String args[])
    {
      Test t1=new Test(10,20);
      System.out.println(t1.display1());
      Test t2=new Test(5,10,15,20);
      System.out.println(t2.display2());

    }
}

