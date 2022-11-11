class strbuffer7
{
public static void main(String args[]) 
{
StringBuffer sb = new StringBuffer("Tanweer Alam");
System.out.println("buffer before= " + sb);
sb.delete(3,6);
System.out.println("buffer after delete = " + sb);
sb.deleteCharAt(1);
System.out.println("buffer after delete char at 1 = " + sb);
}
}

