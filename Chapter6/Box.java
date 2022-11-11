class Box
{
double w;
double h;
double d;
}
 class BoxDemo
{
 public static void main(String args[])

{
   Box mb= new Box();
   double vol;
   mb.w=10;
   mb.h=20;
   mb.d=15;
  vol= mb.w*mb.h*mb.d;
System.out.println("volume is "+vol);
}
}

 
