import java.util.*;
class Node{
    int data;
    Node next;

    Node(int data1,Node next1){
        this.data = data1;
        this.next = next1;
    }
    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}

public class Even_Odd_LL{
    private static Node Arr_ll(int[]arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
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
    // private static List<Integer> Even_Odd(Node head){
    //     // brute force approach
    //     if(head == null || head.next ==null){
    //         return head;
    //     }
    //     List <Integer> ans = new ArrayList<>();
    //     Node temp = head;
    //     while(temp!=null && temp.next!=null){
    //         ans.add(temp.data);
    //         temp = temp.next.next;
    //     }
    //     if(temp!=null){
    //         ans.add(temp.data);
    //     }
    //     temp = head.next;
    //     while(temp !=null && temp.next!=null){
    //         ans.add(temp.data);
    //         temp = temp.next.next;
    //     }
    //     if(temp!=null){
    //         ans.add(temp.data);
    //     }
    //     return ans;
    // }

    private static Node Even_Odd(Node head){
        // OPTIMAL APPROACH
        Node odd = head;
        Node even = head.next;
        Node evenHead = even;

        while(even!=null && even.next!=null){
            odd.next = odd.next.next;
            odd = odd.next;
            even.next = even.next.next;
            even = even.next;  
        }
        odd.next = evenHead;
        return head;
    }
    public static void main(String[]args){
        int []arr = {1,3,5,6,7};
        Node head = Arr_ll(arr);
        traverse(head);
        // System.out.print(Even_Odd(head));
        Node anshead = Even_Odd(head);
        traverse(anshead);
    }
}