class ArrayPractice{

    // SECOND SMALLEST ELEMENT
    // public static void main(String[]args){
    //     int []arr={1,2,4,7,7,5};

    //     int smallest = arr[0];
    //     int sec_smallest = Integer.MAX_VALUE;

    //     for(int i=1;i<arr.length;i++){
    //         if(arr[i]<smallest){
    //             sec_smallest = smallest;
    //             smallest = arr[i];
    //         }
    //         else if(arr[i]<sec_smallest && arr[i]!=smallest){
    //             sec_smallest = arr[i];
    //         }
    //     }
    //     System.out.println("second smallest element in the array is :"+sec_smallest);
    // }

// CHECK IF THE ARRAY IS SORTED OR NOT
    // public static void main(String[]args){
    //     int []arr = {1,2,4,2,3,3,4};
    //     boolean ans = true;
    //     for(int i=1;i<arr.length;i++){
    //         if(arr[i-1]>arr[i]){
    //             ans = false;
    //         }
    //     }
    //     System.out.println(ans);
    // }

    // REMOVE DUPLICATES
    // public static void main(String[]args){
    //     int []arr = {1,2,2,3,4,5,5,6};
    //     int i=0;
    //     for(int j=1;j<arr.length;j++){
    //         if(arr[i]!= arr[j]){
    //             arr[i+1] = arr[j];
    //             i++;
    //         }
    //     }
    //     for(int k=0;k<=i;k++){
    //         System.out.println(arr[k]);
    //     }
    // }

    // ROTATE AN ARRAY BY K PLACES
    // public static void reverse(int[]arr,int i,int j){
    //     while(i<=j){
    //         int temp = arr[i];
    //         arr[i] = arr[j];
    //         arr[j] = temp;
    //         i++;
    //         j--;
    //     }
    // }
    // public static void main(String[]args){
    //     int []arr = {1,2,3,4,5,6,7};
    //     int d = 3;
    //     int n = arr.length;
    //     reverse(arr,0,d-1);
    //     reverse(arr,d,n-1);
    //     reverse(arr,0,n-1);

    //     for(int i =0;i<n;i++){
    //         System.out.println(arr[i]);
    //     }
    // }

    // BUY AND SELL A STOCK TO GET THE MAXIMUM PRICE
    // DINAMIC PROGRAMMING IS ALL ABOUT REMEMBERING THE PAST 
    // public static void main(String[]args){
    //     int []arr = {7,1,5,3,6,4};
    //     int mintrack = arr[0];
    //     int maxProfit = 0;
    //     for(int i =1;i<arr.length;i++){
    //         int cost = arr[i] - mintrack;
    //         maxProfit = Math.max(maxProfit,cost);
    //         mintrack = Math.min(mintrack,arr[i]);
    //     }
    //     System.out.println(maxProfit);
    // }

    // REARANGE THE ELEMENTS IN THE ARRAY IN THE ALTERNATE WAY POS AND NEG 
    public static void main(String[]args){
        int []arr ={-1,2,3,4,-4,1};
       
    }
}