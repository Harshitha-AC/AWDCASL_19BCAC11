import java.util.*;
class Pattern5
{
public static void main(String args[])
{
int n,k=1;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(int i=0;i<=n;i++)
{
for(int j=1;j<=k;j++)
{
System.out.print("*");
}
k=k+2;
for(int z=1;z<=n;z++)
{
System.out.println();
}
}
for(int i=1;i<=n;i++)
{
for(int j=5;j>=k;j--)
{
System.out.print("*");
}
k=k+1;
for(int z=1;z<=n;z++)
{
System.out.println();
}
}
}
}


