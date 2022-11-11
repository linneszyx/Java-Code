class ArrayTwo2 
{
public static void main(String args[])
 {
int arr2[][] = new int[4][];
arr2[0] = new int[1];
arr2[1] = new int[2];
arr2[2] = new int[3];
arr2[3] = new int[4];
int i, j, k = 0;
for(i=0; i<4; i++)           
for(j=0; j<i+1; j++)         
 {
arr2[i][j] = k;
k++;
}
for(i=0; i<4; i++) {
for(j=0; j<i+1; j++)
System.out.print(arr2[i][j] + " ");
System.out.println();
}
}
}
