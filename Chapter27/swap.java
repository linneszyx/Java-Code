class swapping 
{
int x1;
int y1;
};
class swap 
{
static void swap(swapping a, swapping b) 
{
swapping temp = new swapping();
temp = a;
a = b;
b = temp;
}
public static void main(String args[]) 
{
swapping s1 = new swapping();
swapping s2 = new swapping();
s1.x1 = 5;
s1.y1 = 10;
s2.x1 = 12;
s2.y1 = 15;
System.out.println("Original values of s1 and s2 are as follows:");
System.out.println("s1: " + s1.x1 + " , " + s1.y1);
System.out.println("s2: " + s2.x1 + " , " + s2.y1);
swap(s1, s2);
System.out.println("Swapped values of s1 and s2 are as follows:");
System.out.println("s1: " +s1.x1 + ", " + s1.y1);
System.out.println("s2: " + s2.x1 + ", " + s2.y1);
}
}
