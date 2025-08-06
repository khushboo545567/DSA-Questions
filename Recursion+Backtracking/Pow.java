public class Pow{
    public static void main(String[]args){
        double x = 4;
        int n = 4;
        long N = n;
        if(N < 0){
            x = 1/x;
            N = -N;
        }
        System.out.println(pow(x,N));
    }
    public static double pow(double x, long N){
        if(N == 0) return 1.0;
        if(N %2 == 0){
            return pow(x*x,N/2);
        }
        else{
            return x *pow(x*x,(N-1)/2);
        }
    }
}