import java.util.*;
class Duplicate
{
public static void main(String args[])
{
int n,i=0,count=0;
Scanner sc=new Scanner(System.in);
System.out.print("enter the size of array");
n=sc.nextInt();
int ar[]=new int[n];
System.out.println("enter"+n+" elements");
for(int k=0;k<n;k++)
{
ar[k]=sc.nextInt();
}
Arrays.sort(ar);

while(i<n)
{
 count=0;
for(int j=1;j<n;j++)
{
if(ar[j]==ar[i])
{
if(i==j)
break;
count++;
}
}
if(count>0)
{
System.out.println("the duplicate values are");
System.out.println(ar[i]);
i=count+1;
}

}
}
}
