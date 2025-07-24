public class MaxProduct{
    public static void main(String[]args){
        int [] arr= {-2,6,-3,-10,0,2};
        int MaxProduct = 0;
        int sufixProd = 1;
        int prefixPro = 1;
        int n = arr.length;

        for(int i=0;i<n;i++){
            if(sufixProd == 0){
                sufixProd = 1;
            }
            if(prefixPro == 0){
                prefixPro = 1;
            }

            prefixPro = prefixPro*arr[i];
            sufixProd = sufixProd*arr[n-i-1];
            MaxProduct = Math.max(MaxProduct,Math.max(prefixPro,sufixProd));
        }
        System.out.println(MaxProduct);
    }
}