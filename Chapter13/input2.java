import java.io.*;
class input2
{
	public static void main(String[] ar) throws Exception
	{
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader bfr=new BufferedReader(is);
		System.out.print("Enter first number:-");
		String s1=bfr.readLine();
		System.out.print("Enter second number:-");
		String s2=bfr.readLine();
		int x=Integer.parseInt(s1);
		int y=Integer.parseInt(s2);
		int z=x+y;
		System.out.println("Sum of "+x +" and "+y + " is "+z);

	}
}