import java.util.*;
class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }
    Node(int data1){
        this.data = data1;
        this.next= null;
    }
}

public class Sum{
    private static Node Arr_ll1(int[]arr1){
        Node head1 = new Node (arr1[0]);
        Node mover = head1;
        for(int i=1;i<arr1.length;i++){
            Node temp = new Node(arr1[i]);
            mover.next = temp;
            mover = temp;
        }
        return head1;
    }
    private static Node Arr_ll2(int[]arr2){
        Node head2 = new Node(arr2[0]);
        Node mover = head2;
        for(int i=1;i<arr2.length;i++){
            Node temp = new Node(arr2[i]);
            mover.next = temp;
            mover = temp;
        }
        return head2;
    }
    private static void traverse(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    private static Node add(Node head1,Node head2){
        Node dummyNode = new Node(-1);
        Node ansHead = dummyNode;
        Node temp1 = head1;
        Node temp2 = head2;
        int carray = 0;
        while(temp1!=null || temp2!=null){
            int sum = carray;
            if(temp1 !=null){
                sum+=temp1.data;
            }
            if(temp2 !=null){
                sum+=temp2.data;
            }
            // sum = sum+carray;
            carray = sum/10;
            Node newNode = new Node(sum%10);
            ansHead.next = newNode;
            ansHead = newNode;

            if(temp1 !=null) temp1 = temp1.next;
            if(temp2 !=null) temp2 = temp2.next;
        }
        if(carray !=0){
            Node carynode = new Node(carray);
            ansHead.next = carynode;
        }
        return dummyNode.next;
    }
    public static void main(String[]args){
        int[]arr1={2,4,6};
        int[]arr2 = {3,8,7};
        Node head1 = Arr_ll1(arr1);
        Node head2 = Arr_ll2(arr2);
        Node ansHead = add(head1,head2);
        traverse(ansHead);
    }
}