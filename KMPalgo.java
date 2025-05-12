// it is used when we have to search patterns in the string like if i have to search a sub string form a stirng 
// use of lps arrays and then compare both the sting 

class Solution {
    private static int[] lps(String pat){
        int m = pat.length();
        int[]lps = new int[m];
        int len = 0;
        int i=1;
        
        while(i<m){
            if(pat.charAt(i) == pat.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }
            else{
                if(len!=0){
                    len = lps[len-1];
                }
                else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    } 
    // Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2) {
        // Your code here
        String txt = s1+s1;
        int m = txt.length();
        int n = s2.length();
        int [] lps = lps(s2);
        int i=0;
        int j=0;
        
        while(i<m){
            if(txt.charAt(i) == s2.charAt(j)){
                i++;
                j++;
            }
            if(j==n){
                return true;
            }
            else if(i<m && txt.charAt(i) != s2.charAt(j)){
                if(j!=0){
                    j = lps[j-1];
                }
                else{
                    i++;
                }
            }
            
        }
        return false;
    }
}