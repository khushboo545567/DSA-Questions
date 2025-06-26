public class QueueUsingLL{

    static class Node {
        int data;
        Node next;
    }

    Node start = null;  
    Node end = null;    
    int size = 0;

    public void push(int value){
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = null;

        if(start == null && end == null){
        start = newNode;
        end = newNode;
        }
        else{
            end.next = newNode;
            end = newNode;
        }
        size++;
        System.out.println(value+"the elements is pushed");
    }

    public int pop(){
        if(start == null){
            System.out.println("the stack is empty");
            return -1;
        }
        int temp  = start.data;
        start = start.next;
       if(start == null){
        end = null;
       }
       size--;
       System.out.println(temp+"popped form the value");
       return temp;
    }

    public int peek(){
        if(start == null){
            System.out.println("the stack is empty");
            return -1;
        }
        System.out.println(start.data +"the peeked elements");
        return start.data;
    }

    public void display(){
        if(start == null){
            System.out.println("the stack is empty");
            return ;
        }
        Node temp = start;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();

    }

    public static void main(String[]args){ 
        QueueUsingLL stack = new QueueUsingLL();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Top element is: " + stack.peek());

        System.out.println("Popped: " + stack.pop());

        stack.display();
    }
}