public class QueueArray{
    static int size = 5;
    static int[] queue = new int[size];
    static int front = 0;
    static int end = -1;
    static int capacity = 0;

    public static void main(String[]args){
        enqueue(10);
        enqueue(20);
        enqueue(30);
        display();      
        peek();         
        dequeue();      
        display();      
        peek();  
    }

    public static void enqueue(int item){
        if(size == capacity){
            System.out.println("the queue is full");
            return;
        }
        end = (end+1) %size;
        queue[end] = item;
        capacity++;
        System.out.println(item + "the item is enqued");
    } 

    public static void dequeue(){
        if(capacity == 0){
            System.out.println("the queue is empty");
            return;
        }
        int items = queue[front];
        front = (front+1) %size;
        capacity--;
        System.out.println(items+"dequeued elements");
    }

    public static void peek(){
        if(capacity == 0){
            System.out.println("empty queue");
            return;
        }
        System.out.println(queue[front] + "peaked");
    }

    public static void display(){
        if(capacity == 0){
            System.out.println("queue is empty");
            return;
        }
        for(int i= front;i<=end;i++){
            System.out.println(queue[i]+" ");
        }
        System.out.println();
    }
}