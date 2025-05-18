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
public class Insertion{
    private static Node ll(int []arr){
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
    private static Node insertHead(Node head,int el){
        Node temp = new Node(el,head);
        return temp;
    }
    private static Node inserttail(Node head,int el){
        if(head == null){
            return new Node(el);
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        Node newNode = new Node(el);
        temp.next = newNode;
        return head;
    }
    private static Node insertK(Node head,int el,int pos){
        if(head == null){
            return new Node(el);
        }
        if(pos == 1){
            Node temp = new Node(el,head);
            return temp;
        }
        int cnt =0;
        Node temp = head;
        while(temp != null){
            cnt++;
            if(cnt == pos-1){
                Node x = new Node(el);
                x.next = temp.next;
                temp.next = x;
                return head;
            }
            temp = temp.next;
        }
        return head;
    }
    // inserting element before the value x
    private static Node insertbyval(Node head, int el, int val){
        if(head == null){
            return null;
        }
        if(head.data == val){
            return new Node(el,head);
        }
        Node temp = head;
        while(temp.next!= null){
            if(temp.next.data == val){
                Node x = new Node(el);
                x.next = temp.next;
                temp.next = x;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[]args){
        int[]arr = {1,2,3,4,5,6,7,8,9};
        Node head = ll(arr);
        traverse(head);
        Node newHead = insertHead(head,0);
        traverse(newHead);
        Node tailHed = inserttail(newHead,10);
        traverse(tailHed);
        Node kHead = insertK(head,11,5);
        traverse(kHead);
        Node valHead = insertbyval(head,12,11);
        traverse(valHead);
        // traverse(kHead);
    }
}