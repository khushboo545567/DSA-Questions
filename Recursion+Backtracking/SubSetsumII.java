import java.util.*;
public class SubSetSumII{
    public static void subsetsum(int ind, int[]arr,List<List<Integer>>ans,List<Integer>ds){
            ans.add(new ArrayList<>(ds));

        for(int i = ind;i<arr.length;i++){
            if(i!=ind && arr[i] == arr[i-1]) continue;
            // add to the list
            ds.add(arr[i]);
            subsetsum(i+1,arr,ans,ds);
            // remove or backtrack
            ds.remove(ds.size()-1);
        }

    }
    public static void main(String[]args){
        int []arr = {1,2,2};
        Arrays.sort(arr);
        // if the array is unsorted then sort it before procedding 
        List<List<Integer>> ans = new ArrayList<>();
        subsetsum(0,arr,ans,new ArrayList<>());
        System.out.println(ans);
    }
}