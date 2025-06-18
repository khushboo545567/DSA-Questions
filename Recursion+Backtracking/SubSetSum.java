import java.util.*;
// PRINT SUB SET SUM I

public class SubSetSum{
    public static void subset(int ind , int []arr, int sum , List<Integer>ans){
        if(ind == arr.length){
            ans.add(sum);
            return ;
        }
        // pick
        subset(ind+1,arr,sum+arr[ind],ans);
        // not pick 
        subset(ind+1,arr,sum,ans);
    }
    public static void main(String[]args){
        int []arr = {3,1,2};
        List<Integer> ans = new ArrayList<>();
        subset(0,arr,0 , ans);
        Collections.sort(ans);  // sort the subset sums
        System.out.println(ans);  // print sorted list
    }
}