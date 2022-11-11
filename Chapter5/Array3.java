class Array3
{
public static void main(String args[])
{
double nums[] = {10.1, 13.2, 10.3, 12.4, 15.5};
double result = 0;
int i;
for(i=0; i<5; i++)
result = result + nums[i];
System.out.println("Average is " + result / 5);
}
}
