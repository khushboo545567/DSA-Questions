// COUNT THE NUMBER OF CHARACTER IN THE STRING 

public class CntChar{
    public static void main(String[]args){
        String str = "hellow world";
        char[]ch = {'l','o','w','k'};

        HashMap<Integer,Integer>map = new HashMap<>();

        for(int s:str.toCharArray()){
            map.put(s,map.getOrDefault(s,0)+1);
        } 

        for(int c:ch){
           System.out.println(map.getOrDefault(c,0));
        }
    }
}

