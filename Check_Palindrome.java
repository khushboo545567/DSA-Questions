import java.util.*;

class Node {
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

public class Check_Palindrome{
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

    // private static boolean CheckPalindrome(Node head){
    //     // brute force approach
    //     Stack <Integer> st = new Stack<>();
    //     Node temp = head;
    //     while(temp!=null){
    //         st.push(temp.data);
    //         temp = temp.next;
    //     }
    //     temp = head;
    //     while(temp!=null){
    //         if(temp.data != st.peek()){
    //             return false;
    //         }
    //         st.pop();
    //         temp = temp.next;
    //     }
    //     return true;
    // }

    private static boolean CheckPalindrome(Node head){
        // optimal approach
        // first find the middle and then reverse the list after middle then check first part of the ll and second part of the ll

        Node fast = head;
        Node slow = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node secondhead = reverse(slow.next);
        Node first = head;
        Node second = secondhead;
        while(second!=null){
            if(first.data != second.data){
                reverse(second);
                return false;
            }
            first = first.next;
            second = second.next;
        } 
        reverse(second);
        return true;
    }
    private static Node reverse(Node head){
        Node prev = null;
        Node current = head;
        Node next = null;

        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current ;
            current = next;
        }
        return prev;
    }
    public static void main(String[]args){
        int []arr = {1,2,3,2,1};
        Node head = Arr_ll(arr);
        traverse(head);
        boolean ans = CheckPalindrome(head);
        System.out.print(ans);
    }

}