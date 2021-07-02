import java.util.*;
class Factorial
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
n=sc.nextInt();
if((n>=1)&(n<=100))
{
int num=n;
while(n>=2)
{
num*= n-1;
n--;
}
System.out.println(num);
}
}
}


  
