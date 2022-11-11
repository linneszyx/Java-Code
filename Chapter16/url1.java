import java.net.*;
public class url1 
{
public static void main(String args[])
{
   try 
    {
    URL u = new URL("http://www.tanweeralam.com:80/schedule/flight/index.html#mca");
    System.out.println("The protocol is " + u.getProtocol());
    System.out.println("The host is " + u.getHost());
    System.out.println("The port is " + u.getPort());
    System.out.println("The file is " + u.getFile());
    System.out.println("The anchor is " + u.getRef());
    }
  catch (MalformedURLException e) 
  {
  
  }

}
}
