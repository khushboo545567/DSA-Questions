import java.util.*;
class FristLstElIn{
    public int lb(int[]arr, int target){
        int low = 0;
        int high = arr.length-1;
        int ans = arr.length;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>=target){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;

    }
    public int up(int []arr,int target){
        int low =0;
        int high = arr.length-1;
        int ans = arr.length;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>target){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    public List<Integer> FistLst(int[]arr,int target){
        int n = arr.length;
        int lbb = lb(arr,target);
        if(lbb ==n || arr[lbb] != target){
            return Arrays.asList(-1, -1);
        }
        return Arrays.asList(lbb, up(arr, target) - 1);
    }

    public static void main(String[]args){
        int [] arr = {2,4,6,8,8,11,13};
        int target = 8;
       FristLstElIn obj = new FristLstElIn();
        obj.lb(arr,target);
        obj.up(arr,target);
        System.out.println(obj.FistLst(arr,target));
    }
}