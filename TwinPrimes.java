import java.util.*;
class TwinPrimes
{
 static void printPrime(int a,int b)
{
int n=b-a+1;int m=0;
int i=0,count=0;
int ch[]=new int[n];
while(a<=b)
{
for(int j=1;j<=a;j++)
{
if(a%j==0)
count++;
}
if(count==2)
{
if(i<n)
{
ch[i]=a;
i++;
}
}
a++;
count=0;
}
for(int k=0;k<n;k++)
{
if(k+1<n)
{
if(ch[k+1]-ch[k]==2)
System.out.println("twin primes are:"+ch[k]+"\t"+ch[k+1]);
}
}

}
public static void main(String args[])
{
System.out.println("enter range");
Scanner sc=new Scanner(System.in);
int r1,r2;
r1=sc.nextInt();
r2=sc.nextInt();
printPrime(r1,r2);
}
}