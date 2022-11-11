    abstract class Abst
     {
      abstract void getdata(int x,int y);
      abstract void display();
     }
    class abstImp extends Abst
      {
       int i,j;
       void getdata(int a,int b)        {
         i=a;
         j=b;
        }
       void display()
        {
         int p=i+j;
         System.out.println(p);
        }
     }
   class abs
      {
       public static void main(String args[ ])
        {
         abstImp b=new abstImp();
         b.getdata(15,25);
         b.display();
        }
      }
 














