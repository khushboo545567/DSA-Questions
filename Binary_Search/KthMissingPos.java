public class KthMissingPos{
    public static void main(String[]args){
        // first find the nereast element then find the missing one low points to the index where the missng number should be inserted 
        // FIND THE INDEX WEHERE THE MISSING NUMBER SHOULD BE INSERTED = can also be find by this approach just have to return low;
        int [] arr = {2,3,4,7,11};
        int k = 5;
        
        int low =0;
        int high = arr.length;
        while(low<=high){
            int mid = (low+high)/2;
            int missing = arr[mid] - (mid+1);
            if(missing < k){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        System.out.println(low + k);
    }
}