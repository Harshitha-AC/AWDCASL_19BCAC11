import java.util.*;
class Pattern3
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
n=sc.nextInt();
char ch='A';
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(ch+" ");
ch++;
}
System.out.println();
}
}
}


