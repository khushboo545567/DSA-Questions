public class Basic_Ques{

    // PRINT NAME 5 TIME 
    public static void name(int cnt){
        if(cnt>5){
            return;
        }
        System.out.print("khushboo"+" ");
        name(cnt+1); 
    }

    // PRINT 1 TO 4
    public static void count(int cnt,int lim){
        if(cnt>lim){
            return;
        }
        System.out.print(cnt+" ");
        count(cnt+1,lim);
    }

    // PRINT 4 TO 1
    public static void revcount(int cnt,int lim){
        if(cnt<lim){
            return;
        }
        System.out.print(cnt+" ");
        revcount(cnt-1,lim);
    }

    // PRINT 1 TO 4 BY BACKTRACKING 
    // public static void backtrackcnt(int i){
    //     if(i<1){
    //         return;
    //     }
    //     backtrackcnt(i-1);
    //     System.out.print(i+" ");
    // }

    // PRINT 4 TO 1 BY BACKTRACKING 
    public static void backtrackcnt(int j){
        if(j>4){
            return;
        }
        backtrackcnt(j+1);
        System.out.print(j+" ");
    }

    public static void main(String[]args){
        int cnt =1;
        name(cnt);
        count(cnt,4);
        int revcnt=4;
        revcount(revcnt,1);

        // for print 1 to 3
        // int i = 3;
        // backtrackcnt(i);

        // to print 4 to 1
        int i = 1;
        backtrackcnt(i);
    }

}