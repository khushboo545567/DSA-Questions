public class CheckPalindrome{
    private static boolean check(int i,String s){
        int n = s.length();
        if(i>=n){
            return true;
        }
        else if(s.charAt(i) != s.charAt(n-i-1)){
            return false;
        }
        return check(i+1,s);
    }
    public static void main(String[]args){
        String s= "abaa";
        System.out.print(check(0,s));
    }
}