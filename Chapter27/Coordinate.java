class Coordinate 
{
int x1;
int y1;
};
class removePointers 
{
static void reverseCoord(Coordinate c) 
{
c.x1 = -c.x1;
c.y1 = -c.y1;
}
public static void main(String args[]) 
{
Coordinate c = new Coordinate();
c.x1 = 12;
c.y1 = 13;
System.out.println("Original values of c is as follows: ");
System.out.println(c.x1 + " , " + c.y1);
reverseCoord(c);
System.out.println("Sign reversed values of c is as follows:");
System.out.println(c.x1 + " , " + c.y1);
}
}
