import java.util.*;
class Greater{
public static void main(String args[]){
int a,b,c;
Scanner sc = new Scanner(System.in);
System.out.print("enter value of number a:");
a = sc.nextInt();
System.out.print("enter value of b:");
b = sc.nextInt();
System.out.print("enter value of c:");
c = sc.nextInt();
if(a>b && a>c){
	System.out.print("a is greater");
}
else if(b>a && b>c){
	System.out.print("b is greater");
}
else{
	System.out.print("c is greater");
}
}
}