import java.io.*;
class file
{
	public static void main(String[] ar) throws Exception
	{
		File f1=new File(ar[0]);
		System.out.println(f1.exists());
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());
		System.out.println(f1.isDirectory());
		System.out.println(f1.isFile());
		System.out.println(f1.length());
		System.out.println(f1.getName());
		System.out.println(f1.getPath());
		System.out.println(f1.getParent());
		
	}
}