public class ParameterFun{
    private static void sumPer(int i,int sum){
        // by parameter
        // n to 1 3+2+1
        if(i<1){
            System.out.print(sum);
            return;
        }
        sumPer(i-1,sum+i);
    }
    private static int sumfun(int i){
        if(i==0){
            return 0;
        }
        return i+sumfun(i-1);
    }

    public static void main(String[]args){
        sumPer(3,0);
        System.out.print(sumfun(3));
    }
}