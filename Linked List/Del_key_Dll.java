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

public class Del_Key_Dll{
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
    private static void traverse(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    private static Node delbyval(Node head,int key){
       Node temp = head;
       while(temp!=null){
        if(temp.data == key){
            if(temp == head){
                head = temp.next;
            }
            Node nextNode = temp.next;
            Node prevNode = temp.prev;
            if(nextNode != null){
                nextNode.prev = prevNode;
            }
            if(prevNode != null){
                prevNode.next = nextNode;
            }
            temp = nextNode;
        }
        else{
            temp = temp.next;
        }
       }
       return head;
    }
    public static void main(String[]args){
        int [] arr = {10,4,10,10,6,10};
        Node head = Arr_ll(arr);
        traverse(head);
        Node ans = delbyval(head,10);
        traverse(ans);
    }
}