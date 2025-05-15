import java.util.*;
class Reverse{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int n;
System.out.println("enter number:");
n = sc.nextInt();
int rev=0;
while(n!=0){
	int rem = n%10;
	rev = rev*10 + rem;
	n = n/10;
}
System.out.println("reverse number is:" +rev);
}
}

 
 
