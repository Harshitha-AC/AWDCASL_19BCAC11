import java.util.*;
class ZeroAtEnd
{
public static void main(String args[])
{
int n,count=0,j=0;
Scanner sc=new Scanner(System.in);
System.out.print("enter the size of array");
n=sc.nextInt();
int ar[]=new int[n];
int b[]=new int[n];
System.out.print("enter "+ n +" elements ");
for(int k=0;k<n;k++)
{
ar[k]=sc.nextInt();
}
for(int i=0;i<n;i++)
{

if(ar[i]!=0)
{
count++;
b[j]=ar[i];
j++;
}
}
while(count<n)
{
b[count]=0;
count++;
}
System.out.println("the elements after arrangement");
for(int z=0;z<n;z++)
{
System.out.println(b[z]);
}
}
}
