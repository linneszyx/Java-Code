class indexof
 {
public static void main(String args[]) 
{
String str = "Tanweer alam is the author of five books. " +"He has presented more than 30 research papers.";
System.out.println(str);
System.out.println("indexOf(T) = " + str.indexOf('T'));
System.out.println("lastIndexOf(T) = " + str.lastIndexOf('T'));
System.out.println("indexOf(alam) = " + str.indexOf("alam"));
System.out.println("lastIndexOf(alam) = " + str.lastIndexOf("alam"));
System.out.println("indexOf(t, 12) = " + str.indexOf('t', 12));
System.out.println("lastIndexOf(t, 40) = " + str.lastIndexOf('t', 40));
System.out.println("indexOf(alam, 10) = " + str.indexOf("alam", 10));
System.out.println("lastIndexOf(alam, 40) = " + str.lastIndexOf("alam", 40));
}
}
