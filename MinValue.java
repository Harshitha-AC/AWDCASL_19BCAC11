import java.util.*;
class MinValue
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.print("enter the size of array");
n=sc.nextInt();
int ar[]=new int[n];
System.out.print("enter"+n+" elements");
for(int i=0;i<n;i++)
{
ar[i]=sc.nextInt();
}
Arrays.sort(ar);
System.out.print("the minimum element is:"+ar[0]);
}
}

