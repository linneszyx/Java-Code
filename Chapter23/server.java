import java.rmi.*;
import java.rmi.server.*;

public class server extends UnicastRemoteObject implements multiply
 {
public server() throws RemoteException{} 

public static void main(String args[]) throws Exception
 {
System.out.println("Server Started.....");
server s=new server();
Naming.rebind("server",s);
}
public int multiply(int a,int b)
{
return(a*b);
}
}
