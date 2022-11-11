import java.io.*;
public class copy
{
public static void main(String[] args) throws IOException 
{
File inf = new File("t.txt");
File outf = new File("t1.txt");
FileReader in = new FileReader(inf);
FileWriter out = new FileWriter(outf);
int c;
while((c = in.read())!= -1)
out.write(c);
in.close();
out.close();
}}
