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

public class RotateLL{
    private static Node Arr_ll(int[]arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover =temp; 
        }
        return head;
    }
    private static void traverse(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }


    // private static int lengthll(Node head){
    //     int cnt =0;
    //     Node temp = head;
    //     while(temp != null){
    //         cnt++;
    //         temp = temp.next;
    //     }
    //     return cnt;
    // }
    // private static Node Rotate(Node head,int k){
    //     int length = lengthll(head);
    //      k=k%length;
    //      if(k==0){
    //         return head;  
    //      }
    //     int rem = length-k;
    //     Node temp = head;
    //     for(int i=1;i<rem;i++){
    //         temp = temp.next;
    //     }
    //     Node Next = temp.next;
    //     Node newHead = temp.next;
    //     while(Next.next !=null){
    //         Next = Next.next;
    //     }
    //     temp.next = null;
    //     Next.next = head;
    //     return newHead;

    // }

    // BETTER IMPLEMENTATION
    private static Node findNNode(Node head, int rem){
        Node temp = head;
        for(int i=1;i<rem;i++){
            temp = temp.next;
        }
        // System.out.print(temp.data);
        return temp;
    }
    private static Node Rotate(Node head,int k){
        int len =1;
        Node tail = head;
        while(tail.next != null){
            len++;
            tail = tail.next;
        }
        if(k%len == 0){
            return head;
        }
        k = k%len;
        tail.next = head;
        Node newlasthead = findNNode(head,len-k);
        Node newHead = newlasthead.next;
        newlasthead.next = null;
        return newHead;
    }

    public static void main(String[]args){
        int []arr= {1,2,3,4,5};
        int k=2;
        Node head = Arr_ll(arr);
        traverse(head);
        Node rotated = Rotate(head,k);
        traverse(rotated);
    }
}