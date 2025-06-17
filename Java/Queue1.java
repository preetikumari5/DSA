// queue using array

public class Queue1 {
    int arr[];
    int start,end,currSize,maxSize;
    public Queue(){
        arr = new int[16];
        start = end = -1;
        currSize = 0;
    }

    public Queue(int maxSize){
        this.maxSize = maxSize;
        arr = new int[maxSize];
        start = -1;
        end = -1;
        currSize = 0;
    }

    public void push(int x){
        if(currSize==maxSize){
            System.out.println("QUeue is full");
        }
        if(end==-1){
            start = 0;
            end = 0;
        }
        else{
            end= (end+1)%maxSize;
        }
        arr[end] = x;
        currSize++;
    }
    public int pop(){
        if(start==-1){
            System.out.println("Queue is Empty");
        }
        int popped = arr[start];
        if(currSize==1){
            start = -1;
            end =  -1;
        }else {
            start = (start+1) % maxSize;
        }
        currSize--;
        return popped;
    }
    public int pop(){
        if(start == -1){
            System.out.println("Queue empty");
        }
        return arr[start];
    }
    public int size(){
        return currSize;
    }
}
