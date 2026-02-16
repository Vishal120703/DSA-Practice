package Arrays;

public class BestTimeToBuyAndSellStocks {
    public static void findMaximum(int[]arr){
        int maxProfit = 0;
        int buyPrice = arr[0];
        for(int i = 0; i < arr.length; i++){
            buyPrice = Math.min(buyPrice,arr[i]);
            maxProfit = Math.max(maxProfit,arr[i]-buyPrice);
        }
        System.out.println(maxProfit);
    }
    public static void main(String[] args) {
        int[] arr ={7,1,5,3,6,4};
        findMaximum(arr);

    }
}
