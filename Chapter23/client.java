import java.rmi.*;
import java.net.*;
import java.io.*;
public class client
{
public static void main(String []args) throws Exception
 {
DataInputStream ds=new DataInputStream(System.in);
InetAddress ia=InetAddress.getLocalHost();
String ip=ia.toString().substring(ia.toString().indexOf('/')+1);
String url="rmi://"+ip+"/server";
System.out.println("RMI");
multiply s=(multiply)Naming.lookup(url);
System.out.println("Enter two numbers::::");
String s1=ds.readLine();
String s2=ds.readLine();
int a=Integer.parseInt(s1);
int b=Integer.parseInt(s2);
System.out.println(s.multiply(a,b));

}
}