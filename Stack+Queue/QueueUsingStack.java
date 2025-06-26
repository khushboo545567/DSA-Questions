import java.util.*;

public class QueueUsingStack{

    Stack<Integer> stk1 = new Stack<>();
    Stack<Integer> stk2 = new Stack<>();

    public void enqueue(int x){
        while(!stk1.isEmpty()){
            stk2.push(stk1.pop());
        }
        stk1.push(x);
        while(!stk2.isEmpty()){
            stk1.push(stk2.pop());
        }
    }

    public int dequeue(){
        return stk1.pop();
    }

    public int peek(){
        return stk1.peek();
    }

    public void display(){
        System.out.println(stk1);
    }

    public static void main(String[]args){

        QueueUsingStack queue = new QueueUsingStack();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.display();

        System.out.println("Top element is: " + queue.peek());

        System.out.println("Popped: " + queue.dequeue());

        queue.display();
    }
}