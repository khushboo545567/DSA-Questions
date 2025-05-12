public class SlidingWin{
    public static void main(String[]args){
        String str = "0001101011";
        int k =2;
        int s =0;
        int e = 0;
        int zerocont =0;
        int maxcount = -1;
        while(e<str.length()){

             if(str.charAt(e) =='0'){
                zerocont++;
            }
            while(zerocont > k){
                if(str.charAt(s) == '0'){
                zerocont--;
                }
                s++;
            }
           
           
            // Valid window; update max
            maxcount = Math.max(maxcount, e - s + 1);
            e++;
        }
        System.out.println(maxcount);
    }
}