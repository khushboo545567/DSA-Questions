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

public class Intro{
    private static Node ConvertArr2LL(int []arr){
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
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    private static int length(Node head){
        int cnt = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }
    private static int check(Node head,int value){
        Node temp = head;
        while(temp!=null){
            if(temp.data == value){
                return 1;
            }
            temp = temp.next;
        }
        return 0;
    }
    // insertion and deletion in a ll
    private static Node deletehead(Node head){
        Node temp = head;
        head = head.next;
        return head;
    }
    private static Node deleteTail(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node temp = head;
        while(temp.next.next !=null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    private static Node deleteK(Node head,int pos){
        if(head == null)  return head;
        if(pos==1){
            head = head.next;
            return head;
        }
        int cnt = 0;
        Node temp = head;
        Node prev = null;
        while (temp!=null){
            cnt++;
            if(cnt == pos){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next ;
        }
        return head;
    }
    private static Node delByValue(Node head,int val){
        if(head == null) return head;
        if(head.data == val) {
            head = head.next ;
            return head;
        }
        Node temp = head;
        Node prev = null;
        while(temp!=null){
            if(temp.data == val){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
    public static void main (String[]args){
        int []arr ={2,6,4,7,9};
        Node head = ConvertArr2LL(arr);
        // System.out.println(head.data);
        // traverse(head);
        // System.out.println(length(head));
        // System.out.println(check(head,7));
        // Node newHead = deletehead(head);
        // System.out.println(newHead.data);
        // Node tailHed = deleteTail(head);
        // traverse(tailHed);
        // Node delKHead = deleteK(head,3);
        // traverse(delKHead); 
        Node delval = delByValue(head,7);
        traverse(delval);
    }
}