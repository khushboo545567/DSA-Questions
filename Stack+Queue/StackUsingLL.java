public class StackUsingLL{

    static class Node{
        int data;
        Node next;
    }

    static  int size = 0;
    Node top = null;

    public void push(int value){
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = top;
        top = newNode;
        size++;
        System.out.println(value +"pushed");
    }

    public int pop(){
        if(top == null){
            System.out.println("element is poped");
            return -1;
        }
        int popped = top.data;
        top = top.next;
        size--;
        return popped;
    }

    public int peek(){
        if(top == null){
            System.out.println("stack is empty");
            return -1;
        }
        return top.data;
    }

    public int display(){
        if(top == null){
            System.out.println("stack is empty");
            return -1;
        }
        Node temp = top;
        System.out.println("stack :");
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
        return 1;
    }

    public static void main(String[]args){
        StackUsingLL stack = new StackUsingLL();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Top element is: " + stack.peek());

        System.out.println("Popped: " + stack.pop());

        stack.display();
    }
}