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

public class RemoveKEnd{
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
    // private static Node remove(Node head,int k){
    //     int cnt = 0;
    //     Node temp = head;
    //     while(temp!=null){
    //         cnt++;
    //         temp= temp.next;
    //     }
    //     if(cnt == k){
    //         Node newnode= head.next;
    //         return newnode;
    //     }
    //     temp = head;
    //     int track = 1;
    //     int rem = cnt-k;
    //     while(track!=rem){
    //         temp = temp.next;
    //         track++;
    //     }
    //     temp.next = temp.next.next;
    //     return head;
    // }

    private static Node remove(Node head,int k){
        Node fast = head;
        for(int i=0;i<k;i++){
            fast = fast.next;
        }
        Node slow = head;
        while(fast.next !=null){
            slow = slow.next;
            fast = fast.next;
        }
        if(fast == null){
            Node newnode = head.next;
            return newnode;
        }
        slow.next = slow.next.next;
        return head;
    }
    
    public static void main(String[]args){
        int[]arr ={5,6,3,2,6,7,9};
        Node head = Arr_ll(arr);
        traverse(head);
        Node anshead = remove(head,2);
        traverse(anshead);
    }
}