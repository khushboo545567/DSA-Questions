// 1. FIRST FIND THE MAXSUM FOR = MAXlINEAR (LINEAR ARR)
// 2. TOTAL SUM - MIN SUM = MAXCURCULAR (FOR CIRCULAR ARR)
// 3. TAKE MAX OF 1 AND 2 BECAUSE WE DONT KNOW THE LINEAR WOULD GIVE THE MAX RESULT OR CIRCULAR WILL 

public class MaxCircularSum{
    public static void main(String[]args){
        int []arr = {8,-8,9,-9,10,-11,12};
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int currmaxSum = 0;
        int minSum = Integer.MAX_VALUE;
        int currminSum = 0;

        int total = 0;

        for(int i=0;i<n;i++){
            total+=arr[i];
            if(currmaxSum<0){
                currmaxSum = 0;
            }
            if(currminSum >0){
                currminSum = 0;
            }
            currmaxSum+=arr[i];
            maxSum = Math.max(maxSum,currmaxSum);
            currminSum +=arr[i];
            minSum = Math.min(minSum,currminSum);
        }
        System.out.println(Math.max(maxSum,total-minSum));
    }
}