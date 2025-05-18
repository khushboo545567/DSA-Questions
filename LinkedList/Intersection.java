import java.util.HashSet;

class ListNode{
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Intersection{

    // private static ListNode intersection(ListNode headA,ListNode headB){
    //     // BRUTE FORCE APPROACH time = o(n+m) space = o(n)
    //     HashSet<ListNode> set = new HashSet<>();
    //     ListNode temp = headA;
    //     while(temp !=null){
    //         set.add(temp);
    //         temp = temp.next;
    //     }
    //     ListNode temp1 = headB;
    //     while(temp1!=null){
    //         if(set.contains(temp1)){
    //             return temp1;
    //         }
    //         temp1 = temp1.next;
    //     }
    //     return null;
    // }

    // BETTER APPORACH
    // private static int traverse(ListNode head){
    //     ListNode temp = head;
    //     int cnt = 0;
    //     while(temp!=null){
    //         temp = temp.next;
    //         cnt++;
    //     }
    //     return cnt;
    // }
    // private static ListNode intersection(ListNode headA,ListNode headB){
    //     int n1 = traverse(headA);
    //     int n2 = traverse(headB);
    //     if(n1>n2){
    //         ListNode skip = skip(headA,n1-n2);
    //         return collison(skip,headB);
    //     }
    //     else{
    //         ListNode skip = skip(headB,n2-n1);
    //         return collison(skip,headA);
    //     }
    // }   

    // private static ListNode skip(ListNode head,int d){
    //     ListNode temp = head;
    //     for(int i=0;i<d;i++){
    //         temp = temp.next;
    //     }
    //     return temp;
    // } 

    // private static ListNode collison(ListNode skip,ListNode head){
    //     ListNode temp1 = skip;
    //     ListNode temp2 = head;
    //     while(temp1!=null && temp2!=null){
    //         if(temp1 == temp2){
    //             return temp1;
    //         }
    //         temp1 = temp1.next;
    //         temp2 = temp2.next;
    //     }
    //     return temp1;

    // OPTIMAL SOLUTION
    private static ListNode intersection(ListNode headA,ListNode headB){
        if(headA==null || headB == null){
            return null;
        }
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1!=temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
           if(temp1 == null){
            temp1 = headB;
           }
           if(temp2 == null){
            temp2 = headA;
           }
        }
        return temp1;
    }
    
    public static void main(String[]args){
        // Creating shared nodes
        ListNode common = new ListNode(8);
        common.next = new ListNode(10);

        // List A: 1 -> 2 -> 8 -> 10
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = common;

        // List B: 3 -> 8 -> 10
        ListNode headB = new ListNode(3);
        headB.next = common;

        ListNode ans = intersection(headA,headB);
        if(ans!=null){
            System.out.println("intersection is :"+ans.data);
        }
        else{
            System.out.println("there are no intersection found");
        }
    }
}