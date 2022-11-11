import java.io.*;
class input1
{
	public static void main(String[] ar) throws Exception
	{
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader bfr=new BufferedReader(is);
		System.out.println("Enter first and last name");
                String s1=bfr.readLine();
		String s2=bfr.readLine();
		System.out.print("Name is:"+s1+" ");
		System.out.print(s2);
	}
}