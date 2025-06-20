import java.util.*;
public class PermutationsSpace{
    public static void recurPermutaion(int[] arr, List<List<Integer>> ans, boolean[] freq, List<Integer> ds){
        if(ds.size() == arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!freq[i]){
                freq[i]  = true;
                ds.add(arr[i]);
                recurPermutaion(arr,ans,freq,ds);
                ds.remove(ds.size()-1);
                freq[i] = false;

            }
        }
    }
    public static void main(String[]args){
        int []arr = {1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        boolean freq[] = new boolean [arr.length];
        recurPermutaion(arr,ans,freq,new ArrayList<>());
        System.out.println(ans);
    }
}