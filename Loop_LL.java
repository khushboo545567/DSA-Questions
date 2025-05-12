import java.util.*;

class Node{
     int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class Loop_LL{

    // private static boolean cycle(Node head){
    //     // brute force approach 
    //     HashSet <Node> map = new HashSet<>();
    //     Node temp = head;
    //     while(temp!=null){
    //         if(map.contains(temp)){
    //             return true;
    //         }
    //         map.add(temp);
    //         temp = temp.next;
    //     } 
    //     return false;
    // }

    private static boolean cycle(Node head){
        // optimal solution 
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
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

        boolean ans = cycle(node1);
        System.out.println(ans);
    }
}