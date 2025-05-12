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

public class Middle_LL{
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
    private static int  traverse(Node head){
        Node temp = head;
        int cnt =0;
        while(temp!=null){
            // System.out.println(temp.data+" ");
            temp = temp.next;
            cnt++;
        }
        System.out.println(cnt);
        return cnt;
    }
    // optimal solution
    // private static Node middle(Node head){
    //     Node fast = head;
    //     Node slow = head;
    //     // YOU HAVE TO THIS WHEN YOU WANT ONLY ODD POSITION IF N=5 ANS 3 AND IF N=6 ANS 3;
    //     // while(fast.next!=null && fast.next.next!=null)

    //     while(fast!=null && fast.next != null){ //you have to do this when you want 3position of mid when n is 5 AND 4positin of mid when n is 6;
    //         slow = slow.next;
    //         fast = fast.next.next;
    //     }
    //     return slow;
    // }

    // brute force solution
    private static Node middle(Node head){
        int cnt = traverse(head);
        Node temp = head;
        cnt = (cnt/2);
        for(int i=0;i<cnt;i++){
            temp = temp.next;
        }
        return temp;
    }
    public static void main(String[]args){
        int []arr = {1,2,3,4,5,6};
        Node head = Arr_ll(arr);
        Node ans = middle(head);
        System.out.println("the middle of the linked list is :"+ans.data);
    }
}