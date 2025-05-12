public class TestStr{
    public static void main(String[]args){
        String s1 = "babutad";
        String s2 = "bjk";

        int i =0;
        int j=0,k=0;
        boolean found = false;
        while(j<s1.length() && k<s2.length()){
            if(s1.charAt(j) != s2.charAt(k)){
                i++;
                j = i;
                k=0;
            }
            else{
            j++;
            k++;
            if(k == s2.length()) {
                found = true;
            }
            }
        }
        if(found){
        System.out.print(i);
        }else{
            System.out.print("-1");
        }
    }
}