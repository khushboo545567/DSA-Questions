public class FindRootValue{
    public static void main(String[]args){
        int n = 36;
        int low = 1;
        int high = n;
        int ans = 1;
        while(low <= high){
            int mid = (low+high)/2;
            if(mid*mid > n){
                high = mid-1;
            }
            else{
                ans = mid;
                low = mid+1;
            }
        }
        System.out.println(ans);
    }
}