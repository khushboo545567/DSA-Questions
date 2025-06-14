import java.util.*;
public class SubSequenceSumK{
    public static void pSumK(int ind, int[]arr, List<Integer>lst, int sum , int k){
        if(ind == arr.length){
            if(sum == k){
                System.out.println(lst);
            }
            return ;
        }
        // include currect el
        lst.add(arr[ind]);
        pSumK(ind+1,arr,lst,sum+arr[ind],k);
        lst.remove(lst.size()-1);
        // exclude 
        pSumK(ind+1,arr,lst,sum,k);
    }
    public static void main(String[]args){
        int []arr = {1,2,1};
        int k = 2;
        pSumK(0,arr,new ArrayList<>() , 0,k);
    }
}