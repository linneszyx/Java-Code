class mythread extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println(i);
}
}
}
class thread6
{
public static void main(String args[]) throws Exception
{
System.out.println("Start");
mythread t1=new mythread();
mythread t2=new mythread();
t1.start();
t2.start();
}
}