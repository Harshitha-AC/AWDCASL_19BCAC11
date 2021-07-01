import java.util.*;
class Pattern2
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
n=sc.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print("*  ");
}
System.out.println();
}


for(int i=1;i<=n;i++)
{
for(int j=4;j>=i;j--)
{
System.out.print("*  ");
}
System.out.println();
}
}
}