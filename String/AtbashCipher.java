public class AtbashCipher{
    public static void main(String[]args){
        String s = "charlie";
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char reverse = (char)('a'+('z' - s.charAt(i)));
            ans.append(reverse);
        }
        System.out.println(ans);
    }
}