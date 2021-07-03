import java.util.*;
class Automorphic
{
public static void main(String args[])
{
int n,num,rem=0,c=0,mul=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
n=sc.nextInt();
mul=n*n;
num=n;
while(n>0)
{
rem=n%10;
n=n/10;
c++;
}
int lsd=(int) (mul%(Math.pow(10,c)));
if(num==lsd)
System.out.println("automorphic number");
else
System.out.println("not an automorphic number");
}
}





