class Node{
    int data;
    Node next;
    Node prev;

    Node(int data1,Node next1,Node prev1){
        this.data = data1;
        this.next = next1;
        this.prev=prev1;
    }

    Node(int data1){
        this.data = data1;
        this.next = null;
        this.prev = null;
    }
}

public class RemoveDuplicateDll{
    private static Node Arr_dll(int[]arr){
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            prev.next = temp;
            prev = temp;
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
    private static Node RemoveDup(Node head){
        Node temp = head;
        while(temp!=null && temp.next !=null){
            Node nextNode = temp.next;
            while(nextNode !=null && temp.data == nextNode.data){
                nextNode = nextNode.next;
            }
            temp.next = nextNode;
            if(nextNode !=null) nextNode.prev = temp;
            temp = nextNode;
        }
        return head;
    }
    public static void main(String[]args){
        int []arr = {1,1,1,2,3,4,4,5};
        Node head = Arr_dll(arr);
        Node ans = RemoveDup(head);
        traverse(ans);

    }
}