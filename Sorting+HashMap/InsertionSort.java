public class InsertionSort{
    public static void main(String[]args){
        int[]arr = {3,5,1,6,8,0};

        for(int i =0;i<arr.length;i++){
            int j = i;
            while(j>0&&arr[j]<arr[j-1]){
                int temp = arr[j-1];
                arr[j-1]= arr[j];
                arr[j] = temp;
                j--;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}