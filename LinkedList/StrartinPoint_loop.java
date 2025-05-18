import java.util.*;

class Node{
     int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class StrartinPoint_loop{

    // private static int Srt_Point(Node head){
    //     // brute force approach
    //     HashMap<Node,Integer> map = new HashMap<>();
    //     Node temp = head;
    //     while(temp !=null){
    //         if(map.containsKey(temp)){
    //             return temp.value;
    //         }
    //         map.put(temp,1);
    //         temp = temp.next;
    //     }
    //     return 0;
    // }

    private static int Srt_Point(Node head){

        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow.value;
            }
        }
        return 0;
    }
    public static void main(String[]args){
        // Create nodes
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        // Link nodes
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;  // Creates a loop

        System.out.println(Srt_Point(node1));
    }
}