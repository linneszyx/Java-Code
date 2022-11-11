class getchar 
{
public static void main(String args[]) 
{
String s = "How are you? Dear son. ";
int start = 13;
int end = 17;
char target[] = new char[end - start];
s.getChars(start, end,target, 0);
System.out.println(target);
}
}
