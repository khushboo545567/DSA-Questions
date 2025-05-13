public class Introduction{
    // THERE IS NO BASE CASE SO THIS FUNCTION WILL RUN FOR INFINITE TIMES
    // STACK OVERFLOW == these functions are not yet completed until it reaches to the base case
    
    public static void recuse(){
        System.out.print('1');
        recuse();
    }
    public static void recuse(int cnt){
        // BASE CASE WHEN CNT REACHES 10 , STOP RECURSION
        if(cnt == 10){
            return;
        }
        System.out.print(cnt);
        recuse(++cnt);
    }
    public static void main(String[]args){
        int cnt = 0;
        recuse(cnt);
    }
}