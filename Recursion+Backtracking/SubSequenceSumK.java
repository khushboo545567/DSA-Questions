import java.util.*;

// public class SubSequenceSumK{
//     public static void pSumK(int ind, int[]arr, List<Integer>lst, int sum , int k){
// if(sum>k){
//     return 0;
// }
//         if(ind == arr.length){
//             if(sum == k){
//                 System.out.println(lst);
//             }
//             return ;
//         }
//         // include currect el
//         lst.add(arr[ind]);
//         pSumK(ind+1,arr,lst,sum+arr[ind],k);
//         lst.remove(lst.size()-1);
//         // exclude 
//         pSumK(ind+1,arr,lst,sum,k);
//     }
//     public static void main(String[]args){
//         int []arr = {1,2,1};
//         int k = 2;
//         pSumK(0,arr,new ArrayList<>() , 0,k);
//     }
// }

// COUNT THE TOTAL NUMBER OF ANSS
public class SubSequenceSumK{
    public static int pSumK(int ind, int[]arr, int sum , int k){
        if(ind == arr.length){
            if(sum == k){
                return 1;
            }
            return 0;
        }
        // include currect el
        int left = pSumK(ind+1,arr,sum+arr[ind],k);
        // exclude 
        int right = pSumK(ind+1,arr,sum,k);

        int ans = left + right;
        return ans;
    }
    public static void main(String[]args){
        int []arr = {1,2,1};
        int k = 2;
        System.out.println(pSumK(0,arr,0,k));
    }
}

// TO PRINT ONLY ONE ANS 
// public class SubSequenceSumK{
//     public static boolean pSumK(int ind, int[]arr, List<Integer>lst, int sum , int k){
//         // CONDITION SATISFIED
//         if(ind == arr.length){
//             if(sum == k){
//                 System.out.println(lst);
//                 return true;
//             }
//             else{
//             return false;
//             }
//         }
//         // include currect el
//         lst.add(arr[ind]);
//         if(pSumK(ind+1,arr,lst,sum+arr[ind],k) == true){
//             return true;
//         }
//         lst.remove(lst.size()-1);
//         // exclude 
//         if(pSumK(ind+1,arr,lst,sum,k) == true){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
    
//     public static void main(String[]args){
//         int []arr = {1,2,1};
//         int k = 2;
//         pSumK(0,arr,new ArrayList<>() , 0,k);
//     }
// }