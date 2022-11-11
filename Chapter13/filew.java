import java.io.*;
class filew
{
	public static void main(String[] ar) throws Exception
	{
		FileWriter fw=new FileWriter("t2.txt");
		fw.write("Hello");
		fw.write(65);
		fw.write(13);
		fw.write(10);
		fw.write("How are you");
		fw.write(400);
		fw.close();
	}
}