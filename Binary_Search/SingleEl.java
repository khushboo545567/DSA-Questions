public class SingleEl{
    // BRUTE FORCE APPROACH 
    // public static void main(String[]args){
    //     int []arr = {1,1,2,2,3,3,4,5,5,6,6};
    //     int n = arr.length;
    //     if(n==1){
    //         System.out.println( arr[0]);
    //     }
    //     for(int i=0;i<n;i++){
    //         if(i==0){
    //             if(arr[i] != arr[i+1]){
    //                 System.out.println(arr[i]);
    //             }
    //         }
    //         else if(i== n-1){
    //             if(arr[i] != arr[i-1]){
    //                 System.out.println(arr[i]);
    //                 break;
    //             }
    //         }
    //         else{
    //             if(arr[i] != arr[i+1] && arr[i] != arr[i-1]){
    //                 System.out.println(arr[i]);
    //                 break;
    //             }
    //         }
    //     }
    // }

    // OPTIMAL approach 
    public static void main(String[]args){
        int []arr = {1,1,2,2,3,4,4,5,5,6,6};
        int n = arr.length;
        if(n==1){
            System.out.println(arr[0]);
        }
        if(arr[0] != arr[1]){
            System.out.println(arr[0]);
        }
        if(arr[n-1] != arr[n-2]){
            System.out.println(arr[n-1]);
        }
        int i=0;
        int j=n-1;
        while(i<=j){
            int mid =( i+j)/2;

            if(arr[mid] !=arr[mid-1] && arr[mid] != arr[mid+1]){
                System.out.println(arr[mid]);
            }

            if((mid%2 ==1 && arr[mid] == arr[mid-1]) || mid%2 == 0 && arr[mid] == arr[mid+1]){
                i = mid+1;
            }
            else{
                j= mid-1;
            }
        }
    }
}