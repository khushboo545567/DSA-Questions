import java.util.*;
public class ThreeSumArr{
    // public static void main(String[]args){
    //     // BRUTE FORCE APPROACH
    //     // TC = N3 , SC = 
    //     int []arr = {-1,0,1,2,-1,-4};
    //     HashSet<List<Integer>> set = new HashSet<>();
    //     int n = arr.length;
    //     for(int i = 0;i<n;i++){
    //         for(int j = i+1;j<n;j++){
    //             for(int k = j+1;k<n;k++){
    //                 ArrayList<Integer>lst = new ArrayList<>();
    //                 if(arr[i]+arr[j]+arr[k] == 0){
    //                     lst.add(arr[i]);
    //                     lst.add(arr[j]);
    //                     lst.add(arr[k]);
    //                     Collections.sort(lst);
    //                     set.add(lst);
    //                 }
    //             }
    //         }
    //     }
    //     System.out.println(set);
    // }

    // BETTER APPROACH
    // TC = N2,SC = N+ NO.OF UNIQUE TRIPLATE IN THE SET

    // public static void main(String[]args){
    //     int[]arr = {-1,0,1,2,-1,-4 };
    //     HashSet <List<Integer>> set = new HashSet<>();
    //     int n = arr.length;
    //     for(int i=0;i<n;i++){
    //         HashSet <Integer> mid = new HashSet<>();
    //         for(int j=i+1;j<n;j++){
    //             ArrayList<Integer>temp = new ArrayList<>();
    //             int k = -(arr[i]+arr[j]);
    //             if(mid.contains(k)){
    //                 if(arr[i]+arr[j]+k ==0){
    //                     temp.add(arr[i]);
    //                     temp.add(arr[j]);
    //                     temp.add(k);
    //                     Collections.sort(temp);
    //                     set.add(temp);
    //                 }
    //             }
    //             mid.add(arr[j]);
    //         }
    //     }
    //     System.out.println(set);
    // }

    // OPTIMAL APPROACH
    // TWO POINTER APPROACH , SORT THE ARRAY
    // TC = n2 , SC = no. of triplates and the temp list 0(1);
    
    public static void main(String[]args){
       int[]arr = {-1,0,1,2,-1,-4 };
        HashSet <List<Integer>> set = new HashSet<>();
        int n = arr.length;

        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            // skip duplicates for the first elements
            if(i>0 && arr[i] == arr[i-1]){
                continue;
            }
            int left = i+1;
            int right =n-1;
            while(left<right){
                int sum = arr[i]+arr[left]+arr[right];
            if(sum ==0){
            ArrayList <Integer> temp = new ArrayList<>();
                temp.add(arr[i]);
                temp.add(arr[left]);
                temp.add(arr[right]);
                set.add(temp);

                while(left<right && arr[left] == arr[left+1]) left++;
                while(left<right && arr[right] == arr[right-1]) right--;

                left++;
                right--;
            }
            else if(sum<0){
                left++;
            }
            else{
                right--;
            }
            }
        }
        System.out.println(set);
    }

}