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
public class Del_mid{
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
    private static int traverse(Node head){
        Node temp = head;
        int cnt =0;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
            cnt++;
        }
        System.out.println();
        return cnt;
    }
    // private static Node del(Node head){
    //     // brute force solution
    //     int cnt = traverse(head);
    //     int c = cnt/2;
    //     Node temp = head;
    //     while(c !=1){
    //         c--;
    //         temp = temp.next;
    //     }
    //     temp.next = temp.next.next;
    //     return head;
    // }

    private static Node del(Node head){
        // optimal solution
        if(head == null || head.next == null){
            return null;
        }
        Node slow = head;
        Node fast = head; 
        fast = fast.next.next;
        while(fast !=null && fast.next !=null){
            slow = slow.next;
            fast =fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[]args){
        int []arr = {1,2,3,4,5};
        Node head = Arr_ll(arr);
        traverse(head);
        Node ans = del(head);
        traverse(ans);
    }
}