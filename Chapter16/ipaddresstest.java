import java.net.*;
class ipaddresstest
{
public static void main(String args[]) throws UnknownHostException 
{
InetAddress Address = InetAddress.getLocalHost();
System.out.println(Address);
Address = InetAddress.getByName("www.miet.ac.in");
System.out.println(Address);
InetAddress SW[]=InetAddress.getAllByName("www.miet.ac.in");
for (int i=0; i<SW.length; i++)
{
System.out.println(SW[i]);
}
}
}
