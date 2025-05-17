public class ReverseArr{

    // private static void rev(int[]arr,int i,int j){
    //     if(i>=j){
    //         return ;
    //     }
    //     int temp = arr[i];
    //     arr[i] = arr[j];
    //     arr[j] = temp;
    //     rev(arr,i+1,j-1);
    // }

    private static void rev(int[]arr,int i){
        int n = arr.length;
        if(i>=n/2){
            return ;
        }
        int temp = arr[i];
        arr[i]= arr[n-i-1];
        arr[n-i-1] = temp;
        rev(arr,i+1);
    }

    public static void main(String[]args){
        int[]arr = {2,4,8,6,10};
        // rev(arr,0,arr.length-1);
        rev(arr,0);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}