import java.util.*;
class Node{
    int data;
    Node next;
    Node prev;

    Node(int data1,Node next1,Node prev1){
        this.data = data1;
        this.next = next1;
        this.prev = prev1;
    }
    Node(int data1){
        this.data = data1;
        this.next = null;
        this.prev = null;
    }
}

public class ReverseDll{
    private static Node Arr_dll(int[]arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            temp.prev = mover;
            mover = temp;
        }
        return head;
    }
    private static void traverse(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    // private static Node reverse(Node head){
    //     // not optimal it take time 2n and space n
    //     Stack<Integer>st = new Stack<>();
    //     Node temp = head;
    //     while(temp !=null){
    //         st.push(temp.data);
    //         temp = temp.next;
    //     } 
    //     temp = head;
    //     while(temp !=null){
    //         temp.data = st.peek();
    //         st.pop();
    //         temp =temp.next;
    //     }
    //     return head;
    // }
    private static Node reverse(Node head){
        Node temp = null;
        Node current = head;
        while(current !=null){
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            head = current;
            current = current.prev;
        }
            return head;
    }
    public static void main(String[]args){
        int []arr ={1,2,3,4,5};
        Node head = Arr_dll(arr);
        traverse(head);
        Node revhead = reverse(head);
        traverse(revhead);
    }
}