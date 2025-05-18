import java.util.*;

class Node{
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}
public class Len_loop{
    // private static int lenloop(Node head){
    //     // brute force apporach 
    //     HashMap<Node,Integer> map = new HashMap<>();
    //     Node temp = head;
    //     int timer = 1;
    //     while(temp!=null){
    //         if(map.containsKey(temp)){
    //             int value = map.get(temp);
    //             return timer-value;
    //         }
    //         map.put(temp, timer);
    //         timer++;
    //         temp = temp.next;
    //     }
    //     return 0;
    // }

   private static int lenloop(Node head) {
    // optimal solution
    Node slow = head;
    Node fast = head;

    // Step 1: Detect the loop using Floyd's cycle-finding algorithm
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;

        if (slow == fast) {
            // Step 2: Loop detected, now count the loop length
            int count = 1;
            Node temp = slow.next;
            while (temp != slow) {
                temp = temp.next;
                count++;
            }
            return count;
        }
    }

    // No loop
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

        int ans = lenloop(node1);
        System.out.println(ans);
    }
}