import java.lang.Thread;
import java.applet.Applet;

/*<applet code=thread3 width=400 height=400></applet>*/

public class thread3 extends Applet implements Runnable 
{
  Thread t;

  public void init()
    {
      System.out.println("in init() --> starting thread.");
      t= new Thread(this); 
     t.start();
    }

  public void start()
    {
      System.out.println("in start() --> resuming thread.");
      t.resume();
    }

  public void stop()
    {
      System.out.println("in stop() --> suspending thread.");
      t.suspend();
    }

  public void destroy()
    {
      System.out.println("in destroy() --> stoping thread.");
     t.resume();
      t.stop();
    }

  public void run()
    {
      int i=0;
      for(;;)
        {
          i++; 
          System.out.println("At " + i + " and counting!");
          try {
                t.sleep(10);
               }
          catch (InterruptedException e ) {}
        }
    }
}
