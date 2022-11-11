import java.io.*;
class StandardInput
{
public static void main(String args[])
{
byte s[] = new byte[20];
System.out.println("Enter your name");
try
{
System.in.read(s);
System.out.println("Hi  "+s);
}
catch(IOException e)
{
System.out.println(e);
}
}
}
