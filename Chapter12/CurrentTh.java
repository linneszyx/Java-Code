// Controlling the main Thread.
class CurrentTh 
{
public static void main(String args[]) 
{
Thread t = Thread.currentThread();
System.out.println("Current thread is= " + t);
t.setName("My Thread");
System.out.println("After change name: " + t);
try 
{
for(int n = 0; n < 5; n++) 
{
System.out.println(n);
Thread.sleep(50);
}
} 
catch (InterruptedException e) 
{
System.out.println("Main thread interrupted");
}
}
}