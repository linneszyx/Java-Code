import java.io.*;
class freader1
{
	public static void main(String[] ar) throws Exception
	{
		FileReader fr=new FileReader("input1.java");
		int x=fr.read();
		while(x>=0)
		{
			char c=(char)x;
			System.out.print(c);
			x=fr.read();
		}
		
	}
}