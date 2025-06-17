import java.util.*;
public class CombinationSum2{
    public static void findCommon(int ind , int[]arr, int target, List<List<Integer>>ans, List<Integer>ds){

        if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = ind;i<arr.length;i++){
            if(i>ind && arr[i] == arr[i-1]) continue;
            if(arr[i]>target) break;
            ds.add(arr[i]);
            findCommon(i+1,arr,target-arr[i],ans,ds);
            ds.remove(ds.size()-1);
        }
    }
    public static void main(String[]args){
        int [] arr = {1,1,1,2,2};
        Arrays.sort(arr);
        int target = 4;
        List<List<Integer>> ans = new ArrayList<>();
        findCommon(0,arr,target,ans,new ArrayList<>());
        System.out.println(ans);
    }

}