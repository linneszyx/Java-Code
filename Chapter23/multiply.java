import java.rmi.*;
interface multiply extends Remote
{
int multiply(int x,int y) throws RemoteException;
}