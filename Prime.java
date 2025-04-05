import java.util.*;
class Prime{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int n;
System.out.println("enter number:");
n = sc.nextInt();
boolean flag=true;
if(n==2){
	System.out.println("it is prime");
			
}
for(int i=2;i<n;i++)
{
if(n% i==0)
{
flag=false;
break;
}
}
if(flag)
{
System.out.println("it is prime");
}
else
{
System.out.println("it is not prime!");
}
}
}