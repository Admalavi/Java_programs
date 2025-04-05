
 interface stackOperation {
    int size = 4;
    void push(int ele);
    void pop();
    void display();
    boolean overflow();
    boolean underflow();
}

class IntStack implements stackOperation{
private int arr[] = new int[size];
private int top = -1;

public void push ( int ele){
    if(overflow()){
        System.out.println("stack is full");
        return;
    }
    arr[++top] = ele;
}


public void pop(){
    if(underflow()){
        System.out.println("stack is empty");
        return;
    }
    System.out.println("popped element:"+arr[top--]);
}


public void display(){
    if(underflow()){
        System.out.println("stack is empty");
        return; 
    }
    System.out.println("stack element:");
    for(int i=0; i<= top; i++){
    System.out.println(arr[i] + " ");
    }
    System.out.println();
}


public boolean overflow(){
    return top == size-1;
}


public boolean underflow(){
    return top == -1;
}
}
public class stackop {
    public static void main(String[] args) {
IntStack stack = new IntStack();
stack.push(26);
stack.push(10);
stack.push(24);
stack.push(21);

stack.display();
stack.pop();
stack.display();
    } 
}
