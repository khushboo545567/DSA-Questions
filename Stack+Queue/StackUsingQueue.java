import java.util.*;
public class StackUsingQueue{
    Queue <Integer> queue = new LinkedList<>();

    // push operation 
    public void push(int x){
        int size = queue.size();
        queue.add(x);
        for(int i=1;i<=size;i++){
            queue.add(queue.peek());
            queue.remove();
        }
    }

    // pop operation
    public int pop(){
        if(queue.isEmpty()){
            System.out.println("stack is underflow");
            return -1;
        }
        return queue.remove();
    }

    // peek operation
    public int peek(){
        if(queue.isEmpty()){
            System.out.println("stack is underflow");
            return -1;
        }
        return queue.peek();
    }

    // is empty
    public boolean isEmpty(){
        return queue.isEmpty();
    }

    // dsiplay
    public void display(){
        System.out.print(queue);
    }

    public static void main(String[]args){
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped: " + stack.pop());

        stack.display();
    }
}