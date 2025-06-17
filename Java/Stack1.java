// stack using array

public class Stack1 {
    int size = 10000;
    int top = -1;
    int arr[] = new int[size];
    
    void push(int x){
        top++;
        arr[top] = x;
    }
    int pop(){
        int x = arr[top];
        top--;
        return x;
    }
    int top(){
        return arr[top];
    }
    int size(){
        return top+1;
    }
}
