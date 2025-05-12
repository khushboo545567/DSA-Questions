public class OccrenceInChar{
    public static void main(String[]args){
        String s = "tattarT";
        char [] arr = new char [26];
        for(int i =0;i<s.length();i++){
            char c = Character.toLowerCase(s.charAt(i));
            arr[c-'a'] ++; 
        }
        int maxfreq = 0;
        char maxchar = ' ';
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxfreq){
                maxfreq = arr[i];
                maxchar = (char )(i+'a');
            }
        }
        System.out.println(maxchar);
    }
}