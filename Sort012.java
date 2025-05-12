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

public class Sort012{
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
    // private static Node sort(Node head){
    //     // BRUTE FORCE APPROACH
    //     Node temp = head;
    //     int cnt0 = 0;
    //     int cnt1 = 0;
    //     int cnt2 = 0;
    //     while(temp!=null){
    //         if(temp.data == 0){
    //             cnt0++;
    //         }
    //         else if(temp.data == 1){
    //             cnt1++;
    //         }
    //         else{
    //             cnt2++;
    //         }
    //         temp = temp.next;
    //     }
    //     temp = head;
    //     while(temp!=null){
    //         if(cnt0!=0){
    //             temp.data = 0;
    //             cnt0--;
    //         }
    //         else if(cnt1!=0){
    //             temp.data = 1;
    //             cnt1--;
    //         }
    //         else{
    //             temp.data = 2;
    //             cnt2--;
    //         }
    //         temp = temp.next;
    //     }
    //     return head;
    // }

    private static Node sort(Node head){
        // OPTIMAL APPROACH
        Node zerohead = new Node(-1);
        Node zero = zerohead;
        Node onehead = new Node(-1);
        Node one = onehead;
        Node twohead = new Node(-1);
        Node two = twohead;

        Node temp = head;
        while(temp !=null){
            if(temp.data == 0){
                zero.next = temp;
                zero = temp;
            }
            else if(temp.data == 1){
                one.next = temp;
                one = temp;
            }
            else{
                two.next = temp;
                two = temp;
            }
            temp = temp.next;
        }
        if(zerohead.next != null){
            zero.next = onehead.next;
        }
        else{
            zero.next = twohead.next;
        }

        one.next = twohead.next;
        two.next = null;

        Node newnode = zerohead.next;
        return newnode;
    }

    public static void main(String[]args){
        int []arr = {1,0,2,0,0,1,2};
        Node head = Arr_ll(arr);
        traverse(head);
        Node anshead = sort(head);
        traverse(anshead);
    }
}