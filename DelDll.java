class Node{
    int data ;
    Node next ;
    Node prev ;

    Node(int data1 , Node next1,Node prev1){
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
public class Dll{
    private static Node Arr_dll(int[]arr){
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i],null,prev);
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
    private static Node delHead(Node head){
        Node temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null;
        return head;
    }
    private static Node deltail(Node head){
         if (head == null || head.next == null) {
        return null;
    }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next =null;
        return head;
    }
    private static Node delK(Node head,int pos){
        if(head == null || pos<=0){
            return head;
        }
        if(pos == 1){
            Node newNode = head.next;
            if(newNode.prev !=null){
                newNode.prev = null;
            }
            return newNode;
        }
        Node temp = head;
        for(int i=1;temp !=null && i<pos;i++){
            temp = temp.next;
        }
        if (temp == null){
            return head;
        }
        if(temp.prev!=null){
            temp.prev.next = temp.next;
        }
        if(temp.next!=null){
            temp.next.prev = temp.prev;
        }
        return head;
    }
    private static Node delbyval(Node head, int val){
        if(head == null){
            return head;
        }
        if(head.data == val){
            Node newhead = head.next;
            if(newhead.prev !=null){
                newhead.prev = null;
            }
            return newhead;
        }
        Node temp = head;
        while(temp.next !=null){
            if(temp.data == val){
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[]args){
        int []arr ={1,2,3,4,5,6,7};
        Node head = Arr_dll(arr);
        traverse(head);
        Node newHead = delHead(head);
        traverse(newHead);
        Node tailhead = deltail(newHead);
        traverse(tailhead);
        Node kHead = delK(tailhead,3);
        traverse(kHead);
        Node valHead = delbyval(kHead,5);
        traverse(valHead);
    }
}