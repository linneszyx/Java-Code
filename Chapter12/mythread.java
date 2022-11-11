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
class thread5
{
public static void main(String args[]) throws Exception
{
System.out.println("Start");
mythread t=new mythread();
t.start();

System.out.println("Stop");
}
}