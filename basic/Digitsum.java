import java.util.*;
class Digitsum{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int n;
System.out.print("enter number:");
n = sc.nextInt();
int sum=0;
for(;n>0;n=n/10)
{
sum=sum+(n%10);
}
System.out.print("sum of digits is:" +sum);
}
}