import java.util.*;
class Pattern4
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number to form a matrix");
n=sc.nextInt();
int a[][];
a=new int[n][n];
a[0][0]=1;
a[n-1][n-1]=n*n;
for(int i=0;i<i+1;i++)
{
for(int j=1;j<=n-1;j++)
{
a[i][j]=a[i][j-1]+j;
}
}
for(i=1;i<i+1;i++)
{
for(j=0;j<=n-2;j++)
{
a[i][j]=a[0][j+1]+1;
}
a[i+1][j-1]=a[i][j]+1;
m=a[i+1][j-1];
}
for(i=1;i<=n-1;i++)
{
j=n-1;
a[i][j]=m+1;
j--;
m++;
}
n=a[i][j];
for(i=2;i<=n-1;i++)
{
j=3;
a[i][j]=n+1;
j--;
n++;
}
System.out.println("the pattern is");
for(i=0;i<=n-1;i++)
{
for(j=0;j<=n-1;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
}
}
