import java.util.*;
public class Lapindrome{
    public static void main(String[]args){
        String s = "abcabfg";
        HashMap<Character,Integer>freq = new HashMap<>();
        int len = s.length();
        for(int i=0;i<len/2;i++){
            freq.put(s.charAt(i),freq.getOrDefault(s.charAt(i),0)+1);
        }
        int start = (len%2 == 0) ? len/2 : len/2+1;
        for(int i = start;i<len ;i++){
            char ch = s.charAt(i);
            if(!freq.containsKey(ch)){
                System.out.println("not a palindrome");
                return;
            }
            freq.put(ch,freq.get(ch)-1);
            if(freq.get(ch)==0){
                freq.remove(ch);
            }
        }
        if(freq.isEmpty()){
            System.out.println("is palindrome");
        } 
        else{
            System.out.println("not palindrome");
        }
    }
}