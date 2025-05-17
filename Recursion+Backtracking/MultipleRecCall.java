public class MultipleRecCall{
    private static int fabi(int n){
        if(n<=1){
            return n;
        }
        int last = fabi(n-1);
        int slast = fabi(n-2);
        return last + slast;
    }
    public static void main(String[]args){
        System.out.print(fabi(4));
    }
}