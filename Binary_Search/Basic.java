public class Basic{
    public static void main(String[]args){
        int []arr = {3,4,5,6,7,9};
        int target = 7;
        int n = arr.length;
        System.out.println(search(arr,0,n-1,target));
    }
    public static int search(int[]arr,int low,int high, int target){
        if(low>high){
            return -1;
        }
        int mid = low+(high-low)/2;
        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid]<target){
            return search(arr,mid+1,high,target);
        }
        else{
           return search(arr,low,mid-1,target);
        }
    }
}