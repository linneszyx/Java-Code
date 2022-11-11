import java.net.*;
public class inet2 
{
public static void main(String args[])
{
try 
{ 
InetAddress local = InetAddress.getLocalHost();
System.out.println("Name:"+local.getHostName()+"\t IP address:"+local.getHostAddress());
}
catch(UnknownHostException e) 
{
System.out.println("Error:"+e);
}
}
}
