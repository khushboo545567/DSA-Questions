import java.util.*;
// COUNT THE NUMBER OF ITEMS HOW MANY TIMES THEY APPEAR
public class ContNo{
    public static void main(String[]args){
        int []arr = {3,2,3,3,5,5,6};
        int[]valcheck = {6,3,5,1,12};

        HashMap<Integer,Integer>map = new HashMap<>();

        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int val:valcheck){
            System.out.println("Number "+ val+ " appears "+map.getOrDefault(val,0) +"times.");
        }
    }
}

