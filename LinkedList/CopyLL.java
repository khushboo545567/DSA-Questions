import java.util.*;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class CopyLL{
    
    public static Node createLinkedList(int[][] data) {
        if (data == null || data.length == 0) return null;

        int n = data.length;
        Node[] nodes = new Node[n];

        // Step 1: Create all nodes
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node(data[i][0]);
        }

        // Step 2: Set next pointers
        for (int i = 0; i < n - 1; i++) {
            nodes[i].next = nodes[i + 1];
        }

        // Step 3: Set random pointers
        for (int i = 0; i < n; i++) {
            Integer randomIndex = data[i][1];
            if (randomIndex != -1) {
                nodes[i].random = nodes[randomIndex];
            }
        }

        return nodes[0]; // return head
    }
    public static void printLinkedList(Node head) {
        Node current = head;
        int index = 0;
        Map<Node, Integer> nodeIndexMap = new HashMap<>();

        // First pass: build index map
        while (current != null) {
            nodeIndexMap.put(current, index++);
            current = current.next;
        }

        // Second pass: print details
        current = head;
        while (current != null) {
            int randIndex = current.random != null ? nodeIndexMap.get(current.random) : -1;
            System.out.println("Val: " + current.val + ", Random points to index: " + randIndex);
            current = current.next;
        }
    }
    // BETTER APPROACH
    // public static Node copy(Node head){
    //     Node temp = head;
    //     HashMap<Node ,Node> map = new HashMap<>();
    //     while(temp != null){
    //         Node newNode = new Node (temp.val);
    //         map.put(temp,newNode);
    //         temp = temp.next;
    //     }
    //     temp = head;
    //     while(temp!=null){
    //         Node copynode = map.get(temp);
    //         Node copynext = map.get(temp.next);
    //         Node copyrandom = map.get(temp.random);
    //         copynode.random = copyrandom;
    //         copynode.next = copynext;
    //         temp = temp.next;
    //     }
    //     return map.get(head);
    // }

    // OPTIMAL APPROACH
    public static Node copy(Node head){
        // INSERT THE COPY IN BETWEEN
        Node temp = head;
        while(temp !=null){
        Node copynode = new Node(temp.val);
        copynode.next = temp.next;
        temp.next = copynode;
        temp = temp.next.next;
        }
        // connect to the random
        temp = head;
        while(temp!=null){
           Node copyNode = temp.next;
           if(temp.random != null){
            copyNode.random = temp.random.next;
           }
            else{
                copyNode.random = null;
            }
            temp = temp.next.next;
        }
        // extract the copied node
        temp = head;
        Node dummy = new Node(-1);
        Node res = dummy;
        while(temp!=null){
        res.next = temp.next;
        temp.next = temp.next.next;
        res = res.next;
        temp = temp.next;
        }
        return dummy.next;
    }
    public static void main(String[]args){
        int[][] input = {
            {7, -1},
            {13, 0},
            {11, 4},
            {10, 2},
            {1, 0}
        };

        Node head = createLinkedList(input);
        printLinkedList(head);
        Node copyheadnode = copy(head);
        printLinkedList(copyheadnode);
    }
}