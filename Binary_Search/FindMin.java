public class FindMin{
    public static void main(String[]args){
        // the sorted part may not contain the min vale;
        // non sorted part contains the min value most probably beacuse the start of the arry will be there

        int []arr = {4,5,6,7,1,2};
        int ans = Integer.MAX_VALUE;
        int n = arr.length;
        int i = 0;
        int j=n-1;

        while(i<=j){
            int mid = (i+j)/2;
            if(arr[i] <= arr[mid]){
                ans = Math.min(ans, arr[i]);
                i= mid+1;
            }
            else{
                ans = Math.min(ans,arr[mid]);
                j = mid-1;
            }
        }
        System.out.println(ans);
    }
}