public class SearchRotateDuplicate{
    public static void main(String[]args){
        int[] arr = {3,3,3,1,3,3,3};
        int target = 9;
        int n = arr.length;
        int i = 0;
        int j = n-1;

        while(i<=j){
            int mid = (i+j)/2;

            if(arr[mid] == target){
                System.out.println("true");
                break;
            }
            if(arr[i] == arr[mid] && arr[mid] == arr[j]){
                i++;
                j--;
            }
            if(arr[mid]<= arr[j]){
                if(target >arr[mid]  && target<=arr[j]){
                    i= mid+1;
                }
                else{
                    j = mid-1;
                }
            }
            else{
                if(target >= arr[i] && target <arr[mid]){
                    j = mid -1;
                }
                else{
                    i =mid+1;
                }
            }
        }
    }
}