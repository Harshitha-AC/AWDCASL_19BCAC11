import java.util.*;
class IncreDre
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
n=sc.nextInt();
if((n>=0)&(n<=1000))
{
if(n%4==0)
System.out.println(++n);
else
System.out.println(--n);
}
}
}
