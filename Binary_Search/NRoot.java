public class NRoot{
    public static void main(String[]args){
        int n=2;
        int m=4;

        int low = 1;
        int high = m;
        int ans = -1;

        while(low<=high){
            int mid = (low+high)/2;
            int midPowerN = power(mid,n);

            if(midPowerN == m){
                ans= mid;
                break;
            }
            else if(midPowerN < m){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        System.out.println(ans);
    }
    public static int power(int n,int mid){
        int result = 1;
        for(int i=0;i<n;i++){
            result*=mid;
            if(result > Integer.MAX_VALUE){
                break;
            }
        }
        return result;
    }
}