public class FindPeak{
    // THINK OF LIKE MOUNTAINS AND PEAKS OF THE MOUNTAIN ARE THE PEAK EL WHEN THE MID IS GREATER THAN PREV THEN PEAK ON THE RIGHT SIDE AND WHEN THE MID IS GREATER THE PEAK IN ON THE LEFT SIDE 
    public static void main(String[]args){
        int []arr = {1,2,1,3,5,6,4};
        int n = arr.length;

        if(n ==1) {
            System.out.println(0);
        }
        if(arr[0] > arr[1]){
            System.out.println(0);
        }
        if(arr[n-1] > arr[n-2]){
            System.out.println(n-1);
        }
        int i =1;
        int j= n-2;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                System.out.println(mid);
                break;
            }
            else if(arr[mid]>arr[mid-1]){
                i = mid+1;
            }
            else if(arr[mid]>arr[mid+1]){
                j= mid-1;
            }
            else{
                j= mid-1; // if both the el are greater than move any side dont matter
            }
        }
    }
}