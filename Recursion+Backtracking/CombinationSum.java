import java.util.*;
public class CombinationSum{
    
    public static void ComSum(int ind, int[]arr, int target,List<List<Integer>> ans, List<Integer> ds){
        if(ind == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if(arr[ind]<=target){
            ds.add(arr[ind]);
            ComSum(ind,arr,target-arr[ind],ans,ds);
            ds.remove(ds.size()-1);
        }
        ComSum(ind+1,arr,target,ans,ds);

    }
    public static void main(String[]args){
        int [] arr = {2,3,6,7};
        int target = 7;
        List<List<Integer>> ans = new ArrayList<>();
        ComSum(0,arr,target,ans, new ArrayList<>()); 
        System.out.println(ans);
    }
}