import java.util.*;
import java.util.Scanner;
public class StringPractice{

    public static void main(String[]args){
        // INPUT FORM USER
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter a string");
        // String output = scanner.nextLine();
        // System.out.println(output);
        // for(int i =0;i<output.length();i++){
        //     System.out.println(output.charAt(i));
        // }

        // ASCII
        // char aa = 'a';
        // System.out.println((int )aa);

        // REVERSE
        // String str1 = "khushboo";
        // StringBuilder sb = new StringBuilder(str1);
        // System.out.println(sb.reverse());
        // // reverse some part of the string 

        // // SUBSTRING
        // String partToReverse = str1.substring(0, 4); 
        // StringBuilder sbb = new StringBuilder(partToReverse);
        // System.out.println(sbb.reverse());

        // // TO STRING 
        // int c = 4;
        // System.out.println(Integer.toString(c));

        // SORT A STRING 
        
            // String input = "collage wallha";
            // char[] chars = input.toCharArray();
            // Arrays.sort(chars);
            // String output = new String(chars);
            // System.out.println(output);
        

        // CHECK ANAGRAM by sorting

        // String str1 = "word";
        // String str2 = "owd";
        // char[] charstr1 = str1.toCharArray();
        // char[] charstr2 = str2.toCharArray();
        // Arrays.sort(charstr1);
        // Arrays.sort(charstr2);
        // String str1sorted = new String(charstr1);
        // String str2sorted = new String(charstr2);
        // if(str1sorted.equals(str2sorted)){
        //     System.out.println("yes it is an anagram ");
        // }
        // else{
        //     System.out.println("it is not an anagram ");
        // }

        // CHECK ANAGRAM AND BY FREQUECY COUNT

    //     String s1 = "heyy";
    //     String s2 = "yyhe";
    //     int []cnt = new int[26];
    //     if(s1.length() != s2.length()){
    //         System.out.println("this is not an anagram");
    //         return;
    //     }
    //     for(int i=0;i<s1.length();i++){
    //         cnt[s1.charAt(i)-'a']++;
    //         cnt[s2.charAt(i)-'a']--;
    //     }
    //     for(int i=0;i<cnt.length;i++){
    //         if(cnt[i] != 0){
    //             System.out.println("this is not an anagrma");
    //             return;
    //         }
    //     }
    //     System.out.println("yes it is an anagram");

    // CHECK ISOMORPHIC

    // take tow freq. arr inilisize with -1 and first check if both have same length then if the s1 of char of that index have the same value of the s2 value then update value otherwise return false;
    // String s1 = "egg";
    // String s2 = "add";
    // int []arr1 = new int [128];
    // int []arr2 = new int [128];
    // // Initialize all values to -1
    //     Arrays.fill(arr1, -1);
    //     Arrays.fill(arr2, -1);

    // if(s1.length() != s2.length()){
    //     System.out.println("not isomorphic");
    //     return ;
    // }
    // for(int i=0;i<s1.length();i++){
    //     if(arr1[s1.charAt(i)-'a'] != arr2[s2.charAt(i)-'a']){
    //         System.out.println("not isomorphic");
    //         return ;
    //     }
    //     arr1[s1.charAt(i)-'a'] = i;
    //     arr2[s2.charAt(i)-'a'] = i;
    // }
    // System.out.println("yes isomorphic");
    // return; 

    // FIND LONGEST COMMON PREFIX

    // String [] strarr = {"flower","flight","flow","flask"};
    // Arrays.sort(strarr);
    // String first = strarr[0];
    // String last = strarr[strarr.length-1];
    // int minlength = Math.min(first.length(),last.length());
    // StringBuilder ans = new StringBuilder();
    // for(int i=0;i<minlength;i++){
    //     if(first.charAt(i) == last.charAt(i)){
    //         ans.append(first.charAt(i));
    //     }
    //     else{
    //         break;
    //     }
    // }
    // System.out.println(ans);

// ANOTHER WAY TO TEH LONGEST COMMON PREFIX
    // String [] str ={"anti","ant","antithusm","add"};
    // String f = str[0];
    // int ans = f.length();
    // for(int i=1;i<str.length;i++){
    //     int j=0;
    //     while(j<f.length() && j<str[i].length() && f.charAt(j)== str[i].charAt(j)){
    //         j++;
    //     }
    //     ans = Math.min(ans,j);
    // }
    // System.out.println(f.substring(0,ans));
    // }

    // DECODE THE ENCODING STRING 
    // MAIN FUNCTION 
    String s = "3[b2[ca]]";
    System.out.println(decodeString(s));
}

// THIS IS THE HELPER FUNCTIONS WHICH IS CALLED INSIDE THE MAIN FUNCTION 
public static String decodeString(String s){
    return decodeHelper(s,new int[]{0});
}

public static String decodeHelper(String s, int []index){
    StringBuilder result = new StringBuilder();
    int num =0;

    while(index[0]<s.length()){
        char c = s.charAt(index[0]);
        
        if(Character.isDigit(c)){
            num = num*10+(c-'0');
        }

        else if(c == '['){
            index[0]++;
            String decode = decodeHelper(s,index);


            for(int i=0;i<num;i++){
                result.append(decode);
            }
            num = 0;
        }

        else if(c == ']'){
            return result.toString();
        }

        else{
            result.append(c);
        }

        index[0]++;
    }
    return result.toString();
}
}