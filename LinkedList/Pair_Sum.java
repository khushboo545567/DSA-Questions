import java.util.*;
// java dont have builtin pair class so we have to create our own pair class
class Pair<U, V> {
    public final U first;
    public final V second;

    public Pair(U first, V second) {
        this.first = first;
        this.second = second;
    }

    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}

class Node{
    int data;
    Node next;
    Node prev;

    Node(Node prev1,int data1,Node next1){
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

public class Pair_Sum{
    private static Node Arr_ll(int[]arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            temp.prev = mover;
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    private static Node traverse(Node head){
        Node temp = head;
        while(temp.next!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
        return temp;
    }
    // private static List<Pair<Integer, Integer>> sum(Node head,int key){
    //     // brute force approach
    //     List<Pair<Integer, Integer>> ans = new ArrayList<>();
    //     Node temp1 = head;
    //     while(temp1 !=null){
    //     Node temp2 = temp1.next;
    //     while(temp2 !=null){
    //         if(temp1.data + temp2.data == key){
    //             ans.add(new Pair<>(temp1.data,temp2.data));
    //         }
    //         temp2 = temp2.next;
    //     }
    //     temp1 = temp1.next;
    //     }
    //     return ans;
    // } 

    private static List<Pair<Integer,Integer>> sum (Node head, int key){
        // optimal approach
        List<Pair<Integer,Integer>> ans = new ArrayList<>();
        Node left = head;
        Node right = traverse(head);
        while(left.data <right.data){
            if(left.data+right.data == key){
                ans.add(new Pair<>(left.data,right.data));
                left = left.next;
                right = right.next;
            }
            else if(left.data+right.data > key){
                right = right.prev;
            }
            else{
                left = left.next;
            }
        }
        return ans;
    }
    public static void main(String[]args){
        int [] arr = {1,2,3,4,9};
        Node head = Arr_ll(arr);
        // traverse(head);
        System.out.println(sum(head,5));
    }
}