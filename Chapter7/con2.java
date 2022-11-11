class Rectangle
{
  int l, b;
  float p, q;
  public Rectangle(int x, int y)
  {
    l = x;
    b = y;
  }
  public int one()
  { 
    return(l * b);
  }
  public Rectangle(int x)
   {
    l = x;
    b = x;
  }
  public int two()
  {
    return(l * b);
  }
  public Rectangle(float x)
  {
    p = x;
    q = x;
  }
  public float three()
  {
    return(p * q);
  }
  public Rectangle(float x, float y)
  {
    p = x;
    q = y;
  }
  public float four()
  {
    return(p * q);
  }
}



public class con2
{
    public static void main(String args[])
    {
        Rectangle r1 = new Rectangle(12,13);
        int a1= r1.one();
        System.out.println(" The area of a rectangle in first constructor is :  " + a1);
        Rectangle r2 = new Rectangle(10);
        int a2= r2.two();
        System.out.println(" The area of a rectangle in first constructor is :  " + a2);
        Rectangle r3 = new Rectangle(20.0f);
        float a3= r3.three();
        System.out.println(" The area of a rectangle in first constructor is :  " + a3);
        Rectangle r4 = new Rectangle(13.0f,12.0f);
        float a4= r4.four();
        System.out.println(" The area of a rectangle in first constructor is :  " + a4);
    }
}

