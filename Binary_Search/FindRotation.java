public class FindRotation{
    public static void main(String[]args){
        // find minimum THAT INDEX WILL BE THE COUNT OF ROTATION 

        int []arr = {3,4,5,1,2};
        int ans = Integer.MAX_VALUE;
        int n = arr.length;
        int i=0;
        int j=n-1;
        int ind = 0;

        while(i<=j){
            int mid = (i+j)/2;
            if(arr[i]<=arr[mid]){
                if(ans>arr[i]){
                    ans = arr[i];
                    ind = i;
                }
                i = mid+1;
            }
            else{
                if(ans<arr[mid]){
                    ans = arr[mid];
                    ind = mid;
                }
                j= mid-1;
            }
        }
        System.out.println(ind);
        System.out.println(ans);
    }
}