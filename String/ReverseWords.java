public class ReverseWords{
    public static void main(String[]args){
        String s = "eulb si yks eht";
        StringBuilder ans = new StringBuilder();
        int len = s.length();
        int i = 0;

        while(i<len){
            StringBuilder word  = new StringBuilder();
            while(i<len && s.charAt(i) != ' '){
                word.append(s.charAt(i));
                i++;
            }
            if(word.length() >0){
                if(ans.length()>0){
                    ans.append(' ');
                }
                word.reverse();
                ans.append(word);
            }
            while(i<len && s.charAt(i) == ' '){
                i++;
            }
        }
        System.out.println(ans);
    }
}