class strbuffer1
{
public static void main(String args[]) 
{

StringBuffer sb = new StringBuffer("Tanweer");
sb.setLength(10);
System.out.println("buffer = " + sb);
System.out.println("length = " + sb.length());
System.out.println("capacity = " + sb.capacity());
}
}
