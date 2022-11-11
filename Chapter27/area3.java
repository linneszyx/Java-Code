interface area1 
{
  void setarea(double d1, double d2);
  double getarea(); 
}

class rectangle implements area1 
{
double x=0,y=0;
public void setarea(double d1, double d2) 
  {
  x=d1;
  y=d2;    
  }
public double getarea() 
  {
   return x * y;
  }
}

class triangle implements area1
{
double x=0,y=0;
public void setarea(double d1, double d2) 
  {
  x=d1;
  y=d2;    
  }
 public double getarea() 
  {
   return 0.5 * x * y;
  }

}
class area3 
{
public static void main(String args[])
{
  area1 a;
  rectangle r=new rectangle();
  triangle t=new triangle();
  r.setarea(12.0, 12.8);
  t.setarea(14.0, 15.0);
  a = r;
  System.out.println("Area of Rectangle: "+a.getarea());
  a = t;
  System.out.println("Area of Triangle:"+a.getarea());

}
}
