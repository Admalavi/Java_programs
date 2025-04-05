import java.util.Scanner;
class Stackop{
int arr[];
int top;
int size;
int capacity;
public Stackop(int size){
    arr = new int[size];
    capacity=size;
    top=-1;
}
public void push(int ele){
    if(top == capacity-1){
        System.out.println("stack is full");
        return;
    }
    else{
        top++;
        arr[top]=ele;
    }
}
public void pop(int ele){
    if(top ==-1){
     System.out.println("stack is empty");
    }
    else{
       ele = arr[top];
    }
}
public void display()
{
if(top ==-1){
    System.out.println("stack is empty");
}
System.out.println("stack element:");
for(int i=0; i<=top; i++)
{
System.out.println(arr[i] + " ");
}
System.out.println();
}
}

public class Stack {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Stackop ab = new Stackop(3);
    ab.push(26);
    ab.push(10);
    ab.push(67);
    ab.display();
	ab.pop(26);
	ab.display();
    sc.close();
  }  

}
