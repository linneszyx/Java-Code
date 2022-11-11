class strbuffer8
{
public static void main(String args[]) 
{
StringBuffer sb = new StringBuffer("Tanweer Alam");
System.out.println("buffer before= " + sb);
sb.replace(8,12,"Gaur");
System.out.println("buffer after = " + sb);
}
}

