class bubblesort1
{
static String arr[] = {"This", "is", "the", "high", "time",  "to", "make", "a", "friend", "like", "you"};
public static void main(String args[]) 
{
for(int j = 0; j < arr.length; j++) 
{
for(int i = j + 1; i < arr.length; i++) 
{
if(arr[i].compareToIgnoreCase(arr[j]) < 0)
{
String t = arr[j];
arr[j] = arr[i];
arr[i] = t;
}
}
System.out.println(arr[j]);
}
}
}
