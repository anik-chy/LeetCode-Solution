package LeetcodeSolutions.slidingWindowpkg;

public class BestTimeToBuySellStock {
    public static int maxProfit(int[] prices) {
        int left=0;
        int maxProfit=0;
        for(int right =1; right<prices.length;right++){
            if(prices[right]>prices[left]){
                maxProfit=Math.max(maxProfit,prices[right]-prices[left]);

            }else{
                left=right;
            }
        }
          return maxProfit;
    }

    public static void main(String[] args){
        int arr[]= {10,1,5,6,7,1};
        System .out.println("Output is: "+maxProfit(arr));
    }
    
}
