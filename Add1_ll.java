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

public class Add1_ll{
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
    // private static Node add(Node head){
    //     // optimal approach iterative method
    //     Node revhead = reverse(head);
    //     int carray = 1;
    //     Node prev = null;
    //     Node temp = revhead;

    //     while(temp!=null){
    //         int sum = temp.data + carray;
    //         temp.data = sum%10;
    //         carray = sum/10;
    //         prev = temp;
    //         temp = temp.next;
    //     }
    //     if(carray>0){
    //         Node newnode = new Node(carray);
    //         prev.next = newnode;
    //     }
    //     return reverse(revhead);
    // }

    private static Node add(Node head){
        // better approach recursive method
        int carray = helper(head);
        if(carray == 1){
            Node newnode = new Node (1);
            newnode.next = head;
            return newnode;
        }
        return head;
    }
    private static int helper(Node head){
        Node temp = head;
        if(temp == null){
            return 1;
        }
        int carray = helper(temp.next);
        int sum = temp.data+carray;
        temp.data = sum%10;
        return sum/10;
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
        int []arr = {8,1,2};
        Node head = Arr_ll(arr);
        traverse(head);
        Node newhead = add(head);
        traverse(newhead);
    }
} 