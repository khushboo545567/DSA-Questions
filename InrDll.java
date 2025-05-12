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

public class InrDll{
    // this in not dll
    // private static Node Arr_dll(int[]arr){
    //     Node head = new Node(arr[0]);
    //     Node prev = head;
    //     for(int i=1;i<arr.length;i++){
    //         Node temp = new Node(arr[i]);
    //         prev.next = temp;
    //         prev = temp;
    //     }
    //     return head;
    // }
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
    private static Node inrtHead(Node head,int el){
        Node newNode = new Node(el);
        head.prev = newNode;
        newNode.next = head;
        return newNode;
    }
    private static Node tailHed(Node head,int el){
        Node newNode = new Node(el);
        Node temp = head;
        while(temp.next !=null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        return head;
    }
    private static Node intrbyK(Node head,int el,int pos){
         Node newNode = new Node(el);
         if (pos <= 1 || head == null) {
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        return newNode;
    }
        Node temp = head;
    int count = 1;
        while (temp != null && count < pos - 1) {
        temp = temp.next;
        count++;
    }
    if (temp == null) {
        System.out.println("Position out of range.");
        return head;
    }
    newNode.next = temp.next;
    newNode.prev = temp;
    if (temp.next != null) {
        temp.next.prev = newNode;
    }
    temp.next = newNode;

    return head;
    }
    private static Node intrbyval(Node head,int el, int val){
        Node newNode = new Node(el);
        if(head == null){
            return head;
        }
        if(head.data == val){
            newNode.next = head;
            head.prev = newNode;
            return newNode;
        }
        Node temp = head.next;
        while(temp!=null && temp.data != val){
            temp = temp.next;
        }
        if(temp == null){
            return head;
        }
        newNode.prev = temp.prev;
        newNode.next = temp;
        temp.prev.next = newNode;
        temp.prev = newNode;
        return head;
    }
    public static void main(String[]args){
        int []arr = {1,2,3,4,5,6,7,8,9};
        Node head = Arr_dll(arr);
        traverse(head);
        Node newHead = inrtHead(head,0);
        traverse(newHead);
        Node tailhead = tailHed(newHead,10);
        traverse(tailhead);
        Node kHead = intrbyK(tailhead,11,5);
        traverse(kHead);
        Node valHead = intrbyval(kHead,12,0);
        traverse(valHead);
    }
}