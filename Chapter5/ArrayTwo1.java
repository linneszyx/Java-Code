class ArrayTwo1
{
public static void main(String args[])
{
int arr2[][]= new int[2][2];
int i, j, k = 0;
for(i=0; i<2; i++)
for(j=0; j<2; j++) 
{
arr2[i][j] = k;
k++;
}
for(i=0; i<2; i++) 
{
for(j=0; j<2; j++)
System.out.print(arr2[i][j] + " ");
System.out.println();
}
}
}
